package fengfei.fir.search.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.util.Version;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 */
public class TagSearcher extends TagBase {
    private final static String Fields[] = new String[]{TagFields.Content};

    LuceneFactory factory;


    public TagSearcher(LuceneFactory factory) {
        this.factory = factory;
    }


    public static String stringFilter(String str) throws PatternSyntaxException {
        String regEx = "[`~!@#$%^&*()+=|{ }':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？·\'\"\\-\t\n\r]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }


    public TopDocs search(
            ScoreDoc after,
            int pageSize,
            int currentPage,
            String... keywords) throws ParseException, IOException {
        //将关键字中的特殊符号过滤
        String[] fields = new String[keywords.length];
        if (null != keywords && keywords.length > 0) {
            String[] tmp = new String[keywords.length];
            for (int i = 0; i < keywords.length; i++) {
                tmp[i] = stringFilter(keywords[i]);
                fields[i] = TagFields.Content;
            }
            keywords = tmp;
        }

        Analyzer analyzer = getAnalyzer();

        Query query = MultiFieldQueryParser.parse(Version.LUCENE_45, keywords, fields, analyzer);
        //5.根据searcher搜索并且返回TopDocs
        if (currentPage <= 1) {
            return this.factory.getSearcher().search(query, pageSize);
        } else {
            return this.factory.getSearcher().searchAfter(after, query, 10);
        }
    }


    public static void main(String[] args) {

    }
}
