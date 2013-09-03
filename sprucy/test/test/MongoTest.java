package test;

import java.net.UnknownHostException;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.WriteResult;

public class MongoTest {

    /**
     * @param args
     * @throws MongoException
     * @throws UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException, MongoException {
        Mongo m = new Mongo("localhost", 27017);
        DB db = m.getDB("image");
        DBCollection coll = db.getCollection("photo");
        BasicDBObject doc = new BasicDBObject();

        doc.put("name", "MongoDB");
        doc.put("type", "database");
        doc.put("count", 1);

        BasicDBObject info = new BasicDBObject();

        info.put("x", 203);
        info.put("y", 102);

        doc.put("info", info);
        doc.put("_id", ObjectId.get());
        System.out.println(doc);

        WriteResult wr = coll.insert(doc);

        System.out.println(wr);
        DBObject myDoc = coll.findOne();
        System.out.println(myDoc);

        m.close();

    }
}
