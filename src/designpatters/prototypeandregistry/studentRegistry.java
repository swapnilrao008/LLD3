package designpatters.prototypeandregistry;

import java.util.HashMap;
import java.util.Map;

public class studentRegistry {
    private Map<String,Student> map=new HashMap<>();
    void register(String key,Student st)
    {
        map.put(key,st);
    }
    Student get(String key)
    {
        return map.get(key);
    }
}
