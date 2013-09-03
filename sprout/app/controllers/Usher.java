package controllers;

import japidviews.Application.photo.HomeViews;
import japidviews.Application.photo.Test;
import japidviews.Application.photo.TestUpload;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import play.Logger;
import play.data.Upload;
import play.modules.router.Any;
import play.modules.router.Get;
import play.modules.router.Gets;
import play.modules.router.Post;
import cn.bran.play.JapidResult;
import fengfei.fir.model.PhotoShow;
import fengfei.forest.database.DataAccessException;
import fengfei.ucm.entity.photo.Favorite;
import fengfei.ucm.entity.photo.PhotoAccess;
import fengfei.ucm.repository.ShowRepository;
import fengfei.ucm.repository.impl.SqlShowRepository;

public class Usher extends Admin {

    static String DownloadPath = "/photo/test/";
    static String UploadPath = "./photo/test/";
    public static ShowRepository show = new SqlShowRepository();
    public final static int TotalRowLimit = 15;

    @Get("/?")
    public static void index() {
        redirect("/pop");
    }

    @Gets({ @Get("/?"), @Get("/{<[0-9]+>pageNum}/?") })
    @Any("/{<[0-9]+>pageNum}/?")
    public static void home(int pageNum) {
        // redirect("/pop");
    }

    @Any("/photos")
    public static void photos() {
        redirect("/popular");
    }

    @Any("/test")
    public static void test() {

        throw new JapidResult(new Test().render());
    }

    @Post("/agile/upload/done/?")
    public static void agileUpload(File Filedata) {

        List<Upload> uploadFiles = (List<Upload>) request.args.get("__UPLOADS");
        System.out.println("pp: " + params.allSimple());
        System.out.println("xx: " + request.args);

        if (uploadFiles != null && uploadFiles.size() > 0) {
            for (Upload upload : uploadFiles) {
                System.out.println("size: " + upload.getSize());
                if (upload.getSize() > 0) {
                    File file = upload.asFile();
                    File destFile = new File(UploadPath + upload.getFileName());
                    try {
                        FileUtils.moveFile(file, destFile);
                        System.out.println(file.getAbsolutePath() + "  \n"
                                + destFile.getAbsolutePath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }

        agileUploader();
    }

    @Get("/agile/upload/?")
    public static void agileUploader() {

        File f = new File(UploadPath);
        if (!f.exists())
            f.mkdirs();
        File[] files = f.listFiles();
        List<String> list = new ArrayList<>();

        for (File file : files) {
            list.add(DownloadPath + file.getName());
        }

        throw new JapidResult(new TestUpload().render(list));
    }

}