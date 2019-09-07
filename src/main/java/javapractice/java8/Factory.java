package javapractice.java8;

import java.util.function.Supplier;

public class Factory {
    public static <T> void print(Supplier<T> sub){
        System.out.println(sub.get());
    }
}
