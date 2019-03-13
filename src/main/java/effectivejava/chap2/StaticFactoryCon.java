package effectivejava.chap2;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态工厂方法代替构造器
 * @author 16033
 */
public class StaticFactoryCon {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> objectObjectConcurrentMap = Map.newConcurrentHashMap();
        objectObjectConcurrentMap.put("map","徐宏光");

        String map = objectObjectConcurrentMap.get("map");

        System.out.println(map);
    }
}

class Map {
    public static <k,v> ConcurrentHashMap<k,v> newConcurrentHashMap(){
        return new ConcurrentHashMap<>(16);
    }
}