package vedio.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by Jaric Liao on 2015/11/1.
 */
public class JsonUtil {

    private static final Gson gson;

    static {
        gson = new Gson();
    }


    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }

    public static String getClassName(String json) throws Exception{
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = jsonParser.parse(json).getAsJsonObject();
        JsonElement element = jsonObject.get("_class");
        if ( element!= null) return element.getAsString();
        return null;
    }

    public static <T> T toObject(String json,Class<T> clazz) {
        return gson.fromJson(json,clazz);
    }
}
