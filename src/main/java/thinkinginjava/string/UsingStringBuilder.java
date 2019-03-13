package thinkinginjava.string;

import java.util.Arrays;
import java.util.Random;

public class UsingStringBuilder {
    public static Random random = new Random(47);

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            stringBuilder.append(random.nextInt(100));
            stringBuilder.append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usingStringBuilder = new UsingStringBuilder();
        System.out.println(usingStringBuilder);

        // sads
        System.out.println("sads,yuuia".substring(0,4));
        // yuuia
        System.out.println("sads,yuuia".substring(5));
        // [sads, yuuia]
        System.out.println(Arrays.toString("sads,yuuia".split(",")));
        // [sa, ds, yu, uia]
        System.out.println(Arrays.toString("sa-ds-yu-uia".split("-",9)));
    }
}
