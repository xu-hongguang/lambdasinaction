package thinkinginjava.typeinformation;

import java.lang.reflect.*;

/**
 * 反射的简单运用
 */
public class ReflectDemo {

    public static void main(String[] args) {
        Class<Book> cla = Book.class;

        //获取构造方法
        System.out.println("\n-------------------获取构造方法-------------------");
        //得到所有构造方法,包括private修饰的  没有Declared就是访问public
        Constructor[] cons = cla.getDeclaredConstructors();
        for (Constructor con : cons) {
            //获得修饰符
            System.out.print(Modifier.toString(con.getModifiers()) + " ");
            //得到方法名
            System.out.print(con.getName() + "(");
            //获取参数类型
            Class[] pars = con.getParameterTypes();
            for (int i = 0; i < pars.length; i++) {
                System.out.print(pars[i].getSimpleName() + " args" + (i + 1));
                //多参数需要逗号分隔
                if (i < pars.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println(") { }");
        }
        try {
            //得到指定public构造方法
            Constructor<Book> co = cla.getConstructor(int.class, String.class, int.class, boolean.class);
            //反射创建Book对象
            Book book1 = co.newInstance(2, "金刚", 1, false);
            System.out.println(book1.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        System.out.println("\n---------------获取属性----------------");

        //获取属性
        Field[] fields = cla.getDeclaredFields();//访问所有属性
        for (Field field : fields) {
            System.out.print(Modifier.toString(field.getModifiers()) + " ");
            System.out.print(field.getType().getSimpleName() + " ");
            System.out.println(field.getName() + " ");
        }
        try {
            Book book2 = new Book();
            //获取指定属性(属性名)
            Field field = cla.getDeclaredField("name");
            //访问该属性时取消权限检查
            field.setAccessible(true);
            //针对引用数据类型
            field.set(book2, "生化危机");

            Field field1 = cla.getDeclaredField("borrowTimes");
            //private修饰的需要这个方法，为true时取消访问权限检查
            field1.setAccessible(true);
            //setInt()方法用于设置int值的属性值，8个基本数据类型都有个setXxx()方法
            field1.setInt(book2, 12);

            System.out.println(book2);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        System.out.println("\n---------------获取方法----------------");

        Method[] methods = cla.getDeclaredMethods();
        for (Method method : methods) {

            System.out.print(Modifier.toString(method.getModifiers()) + " ");
            //返回返回值类型
            System.out.print(method.getReturnType().getSimpleName() + " ");
            System.out.print(method.getName() + "(");
            Class[] classes = method.getParameterTypes();
            for (int i = 0; i < classes.length; i++) {
                System.out.print(classes[i].getSimpleName() + " args");
            }
            System.out.println(") { }");

        }

        Book book3 = new Book();
        try {
            //指定方法，参数（方法名，方法参数的Class类对象）
            Method method = cla.getDeclaredMethod("setName", String.class);
            method.invoke(book3, "未来简史");

            //指定方法没有参数时后面参数用 null或省略
            Method method1 = cla.getDeclaredMethod("getName");
            //调用getName()，获取name值
            Object o = method1.invoke(book3);
            System.out.println(o);
            System.out.println(book3);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        System.out.println("\n------------------创建数组-------------------");
        //创建一个储存String类的数组，长度为10
        Object arr = Array.newInstance(String.class, 10);
        //为下标5,6元素赋值
        Array.set(arr, 5, "Jack");
        Array.set(arr, 6, "Tom");

        for (int i = 0; i < Array.getLength(arr); i++) {
            //Array.get(arr,i)获取数组元素
            System.out.println(Array.get(arr, i));
        }

    }


}


