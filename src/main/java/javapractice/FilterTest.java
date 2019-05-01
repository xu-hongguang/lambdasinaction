package javapractice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "what", "who");


        Set<String> a = strings.stream().filter(s -> s.contains("wh")).collect(Collectors.toSet());
        System.out.println(a);

        System.out.println("====================================================");

        List<MapTest> mapTests = Arrays.asList(new MapTest("k1", "v1"),
                new MapTest("k2", "v2"), new MapTest("k3", "v3"));

        String collect = mapTests.stream().map(MapTest::getKey).collect(Collectors.joining(","));
        System.out.println(collect);
    }

    static class MapTest {
        private String key;
        private String value;

        public MapTest() {
        }

        public MapTest(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
