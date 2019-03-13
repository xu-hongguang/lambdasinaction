package thinkinginjava.typeinformation;


import java.util.Random;

class Initable{

    static final int STATIC_FINAL = 47;
    static final int STATIC_FINAL2 = ClassInitialization.rand.nextInt(1000);
    static final String STATIC_FINAL3 = new String("哈哈");

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

/**
 * @author 16033
 */
public class ClassInitialization {
    public static Random rand = new Random(47);

    /**
     * 不需要对类进行初始化(初始化一次): <br>
     *    1.直接调用static final的值是“编译期常量”时（eg: static final int = 23）
     *    2.使用 .class 语法获得Class对象时
     *
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> initable = Initable.class;
        System.out.println("After creating Initable ref");
//        static final值是“编译期常量”时，不需要对类进行初始化
        System.out.println(Initable.STATIC_FINAL);

        System.out.println(Initable.STATIC_FINAL2);
        System.out.println(Initable.STATIC_FINAL3);



        System.out.println(Initable2.staticNonFinal);

        Class<?> initable3Class = Class.forName("thinkinginjava.typeinformation.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
