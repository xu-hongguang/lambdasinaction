package javapractice;

import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Eddy.Xu
 */
public class Java8Sim {
    public static void main(String[] args) {

        Converter<Date, String> converter = (date -> new SimpleDateFormat("yyyy-MM-dd").format(date));
        String converted = converter.convert(new Date());
        System.out.println(converted);
        System.out.println("***********************************************************");
        Converter<String, Date> converter1 = (date -> {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        });
        Date converted1 = converter1.convert("2017-2-10");
        System.out.println(new DateTime(converted1).plusDays(90).toString("E yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println("***********************************************************");

        SomeThing someThing = new SomeThing();
        Converter<String,String> converter2 = someThing::startWith;
        String covted = converter2.convert("哈市阿萨Java");

        System.out.println(covted);
    }

    @FunctionalInterface
    interface Converter<F, T> {
        /**
         * 转换接口（eg: 日期=>字符串）
         *
         * @param from 待转换对象
         * @return 转换后对象
         */
        T convert(F from);
    }

    public static class SomeThing{
        String startWith(String s){
            return String.valueOf(s.charAt(0));
        }
    }
}
