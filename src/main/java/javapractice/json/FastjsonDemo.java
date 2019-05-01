package javapractice.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import effectivejava.JsonTest;

import java.util.Map;

public class FastjsonDemo {
    public static void main(String[] args) {
        JsonTest jsonTest = new JsonTest();
        jsonTest.setTotal(12);

        String jsonStr = JSON.toJSONString(jsonTest);

        System.out.println(jsonStr);

        JsonTest jsonTest1 = JSON.parseObject(jsonStr,JsonTest.class);

        System.out.println(jsonTest1);

        JSONObject jsonObject = JSONArray.parseObject(jsonStr);
        int i = jsonObject.size();
        System.out.println(i);
        for (Map.Entry<String,Object> jsonTest2: jsonObject.entrySet()){
            System.out.println(jsonTest2.getKey() + "=" + jsonTest2.getValue());
        }
    }
}
