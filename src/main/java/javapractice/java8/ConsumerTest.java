package javapractice.java8;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {

        Consumer<User> consumer = user -> user.setUserName("xhg");
        User user = new User("徐宏光");
        consumer.accept(user);
        System.out.println(user.getUserName());
    }
}
