package javapractice.java8;

import java.util.function.Supplier;

class User {
    private static String username = "xiaoming";

    private String userName;
    private String cla;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String cla) {
        this.userName = userName;
        this.cla = cla;
    }

    public static String getUsername() {
        return username;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", cla='" + cla + '\'' +
                '}';
    }
}

/**
 * @author 16033
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = User::getUsername;
        System.out.println(supplier.get());
//        Supplier<String> supplier1 = () -> User.getUsername();
//        System.out.println(supplier1.get());

        Factory.print(User::getUsername);
    }
}
