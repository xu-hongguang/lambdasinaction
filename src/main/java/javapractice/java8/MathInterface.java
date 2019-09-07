package javapractice.java8;

/**
 * @author 16033
 */
@FunctionalInterface
public interface MathInterface {
    int add(int a,int b);

    static void main(String[] args) {
        MathInterface mathInterface = (a,b) -> a + b;
        System.out.println(mathInterface.add(2,1));
    }
}
