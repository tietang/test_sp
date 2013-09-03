package fengfei.web.app.init;

import fengfei.forest.slice.utils.ResourcesUtils;
import fengfei.spruce.cache.CategoryCache;
import fengfei.spruce.utils.FollowServiceUtils;
import fengfei.sprucy.AppConstants;
import fengfei.ucm.registry.ChainExecuteProxy;
import fengfei.ucm.registry.ChainExecuteType;
import fengfei.ucm.repository.RelaionRepository;
import fengfei.ucm.repository.impl.SqlRelaionRepository;
import fengfei.ucm.service.ReadFollowService;
import fengfei.ucm.service.WriteFollowService;
import fengfei.ucm.service.relation.ReadFollowSqlService;
import fengfei.ucm.service.relation.WriteFollowSqlService;
import fengfei.web.app.init.utils.PropertiesToJson;
import play.Logger;
import play.PlayPlugin;
import play.i18n.Lang;
import play.i18n.Messages;

import java.io.*;
import java.util.Properties;

public class AppInitPlugin extends PlayPlugin {

    @Override
    public void onApplicationStart() {
        initFollowService();
        AppConstants.PopularMinScore = 30;
        AppConstants.UpcomingMinScore = 20;
        AppConstants.UpcomingMaxScore = AppConstants.PopularMinScore;
        //
        //TODO TEST
        Lang.set("en");

        try {
            i18nJavaScriptGenerate();
            Logger.info("Generate i18n javascript file finished.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initFollowService() {

        RelaionRepository repository = new SqlRelaionRepository();
        //
        ChainExecuteProxy<WriteFollowService> writeChainExecuteProxy = new ChainExecuteProxy<>(
                WriteFollowService.class);

        writeChainExecuteProxy.register(1,
                new WriteFollowSqlService(repository),
                ChainExecuteType.NonReturnValue);
        WriteFollowService write = writeChainExecuteProxy.newInstance();
        FollowServiceUtils.writeFollowService = write;
        //
        ChainExecuteProxy<ReadFollowService> readChainExecuteProxy = new ChainExecuteProxy<>(
                ReadFollowService.class);
        readChainExecuteProxy.register(1, new ReadFollowSqlService(repository),
                ChainExecuteType.ReturnValue);
        ReadFollowService read = readChainExecuteProxy.newInstance();
        FollowServiceUtils.readFollowService = read;

        //

        readCategory();
    }

    final static String CategoryFile = "category%s.conf";

    private void readCategory() {

        play.Logger.info("read category.");
        String lang = Lang.get();
        if (lang == null || "en".equals(lang)) {
            lang = "";
        } else {
            lang = "." + lang;
        }
        try (InputStream inputStream = ResourcesUtils
                .getResourceAsStream(String.format(CategoryFile, lang));) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    inputStream));
            String line = null;
            byte group = -1;
            while ((line = reader.readLine()) != null) {
                String[] ls = line.split("=");
                if (line.startsWith("#optgroup")) {
                    String value = ls.length == 2 ? ls[1] : null;
                    CategoryCache.put(group,
                            null != value && !"".equals(value) ? value
                                    : "-----------------------");
                    group--;

                } else {
                    byte key = Byte.parseByte(ls[0].trim());
                    String value = ls[1];
                    CategoryCache.put(key, value);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    final static String I18nJavaScriptFilePath = "public/app/i18n.js";

    private void i18nJavaScriptGenerate() throws IOException {
        Properties properties = Messages.all(Lang.get());
        String json = PropertiesToJson.toJson(properties, "web", "validation",
                "since");

        File f = new File(I18nJavaScriptFilePath);
        FileOutputStream out = new FileOutputStream(f);
        out.write("var i18n=".getBytes());
        out.write(json.getBytes());
        out.write(";\n".getBytes());
        out.close();
    }

}
