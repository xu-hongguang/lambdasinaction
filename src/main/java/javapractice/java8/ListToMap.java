package javapractice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 16033
 */
public class ListToMap {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("xhg", "二班"),
                new User("徐宏光", "一班"),
                new User("大妈", "三班"));
        // 排序
        List<User> users1 = users.stream()
                .sorted(Comparator.comparing(user -> user.getUserName().length()))
                .collect(Collectors.toList());
        System.out.println(users1);

        // 转map
        Map<String, String> map = users.stream()
                .collect(Collectors.toMap(User::getUserName, User::getCla));
        System.out.println(map);
    }
}
