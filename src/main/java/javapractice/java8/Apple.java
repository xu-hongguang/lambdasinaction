package javapractice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 16033
 */
public class Apple {
    private ColorEnum appleColor;
    private byte weigth;

    public Apple(ColorEnum appleColor, byte weigth) {
        this.appleColor = appleColor;
        this.weigth = weigth;
    }

    public String getColor() {
        return appleColor.getColor();
    }

    public void setAppleColor(ColorEnum appleColor) {
        this.appleColor = appleColor;
    }

    public byte getWeigth() {
        return weigth;
    }

    public void setWeigth(byte weigth) {
        this.weigth = weigth;
    }

    public boolean getRed(){
        return "red".equals(getColor());
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleColor=" + appleColor +
                ", weigth=" + weigth +
                '}';
    }
}

class AppleMain {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(ColorEnum.BLUE, (byte) 1));
        apples.add(new Apple(ColorEnum.RED, (byte) 10));
        apples.add(new Apple(ColorEnum.YELLOW, (byte) 3));
        apples.add(new Apple(ColorEnum.BLUE, (byte) 2));
        apples.add(new Apple(ColorEnum.BLUE, (byte) 7));
        apples.add(new Apple(ColorEnum.RED, (byte) 1));
        // 筛选红(第一种方法）
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple : apples) {
            if ("red".equals(apple.getColor())) {
                redApples.add(apple);
            }
        }
        System.out.println(redApples);

        // 筛选红并且大于5 2
        System.out.println(filter(apples, apple ->
                "red".equals(apple.getColor())
                        && apple.getWeigth() > 5));

        // 使用流 3
        // 条件封装在类中
        List<Apple> appleStream = apples.stream()
                .filter(Apple::getRed)
                .collect(Collectors.toList());
        System.out.println(appleStream);
    }

    public static <T> List<T> filter(List<T> apples, Predicate<T> predicate) {
        List<T> apps = new ArrayList<>();
        for (T apple : apples) {
            if (predicate.test(apple)) {
                apps.add(apple);
            }
        }
        return apps;
    }
}
