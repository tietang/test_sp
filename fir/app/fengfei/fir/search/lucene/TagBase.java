package fengfei.fir.search.lucene;

import fengfei.fir.search.lucene.analysis.CommaAnalyzer;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.util.Version;

import java.io.File;

/**
 */
public abstract class TagBase {

    protected Analyzer getAnalyzer() {
        Analyzer analyzer = new CommaAnalyzer(Version.LUCENE_45);
        return analyzer;
    }

    protected File getIndexFile(String dir) {
        final File docDir = new File(dir);
        if (!docDir.exists()) {
            docDir.mkdirs();
        }
        return docDir;

    }

}
