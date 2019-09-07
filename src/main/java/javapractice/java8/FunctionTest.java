package javapractice.java8;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        // 泛型第一个：传入参数类型；第二个：返回类型
        Function<User,String> function = User::getUserName;
        String s = function.apply(new User("徐宏光"));
        System.out.println(s);
    }
}
