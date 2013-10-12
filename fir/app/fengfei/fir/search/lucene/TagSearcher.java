package fengfei.fir.search.lucene;

import demo.analysis.CommaAnalyzer;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 */
public class TagSearcher {
    private IndexReader reader;

    public TagSearcher(String dir) {
        try {
            reader = createIndexReader(dir);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private IndexReader createIndexReader(String dir)
            throws Exception {

        FSDirectory directory = FSDirectory.open(getIndexFile(dir));
        IndexReader reader = DirectoryReader.open(directory);
        return reader;
    }

    private Analyzer getAnalyzer() {
        Analyzer analyzer = new CommaAnalyzer(Version.LUCENE_45);
        return analyzer;
    }

    private File getIndexFile(String dir) {
        final File docDir = new File(dir);
        if (!docDir.exists()) {
            docDir.mkdirs();
        }
        return docDir;

    }

    public static String stringFilter(String str) throws PatternSyntaxException {
        String regEx = "[`~!@#$%^&*()+=|{ }':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？·\'\"\\-\t\n\r]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }

    public TopDocs search(boolean isHighlighter,
                          ScoreDoc after,
                          int pageSize,
                          int currentPage,
                          String... keywords) throws ParseException, IOException {
        //将关键字中的特殊符号过滤
        if (null != keywords && keywords.length > 0) {
            String[] tmp = new String[keywords.length];
            for (int i = 0; i < keywords.length; i++) {
                tmp[i] = stringFilter(keywords[i]);
            }
            keywords = tmp;
        }

        IndexSearcher searcher = new IndexSearcher(reader);
        Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_45);


        Query query = MultiFieldQueryParser.parse(Version.LUCENE_45, keywords, new String[]{"content"}, analyzer);
        //5.根据searcher搜索并且返回TopDocs
        if (currentPage <= 1) {
            return searcher.search(query, pageSize);
        } else {
            return searcher.searchAfter(after, query, 10);
        }
    }
}
