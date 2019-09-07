package javapractice.java8.futures;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompleteFutureTest {
    public static void main(String[] args) {
        CompletableFuture<String> cf = new CompletableFuture<>();
        ExecutorService ex = Executors.newCachedThreadPool();
        CompletableFuture.supplyAsync(()->{
            System.out.println("连接服务器1获取用户名信息");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("xiaoming");
            return "xiaoming";
        },ex).thenApplyAsync(str->{
            System.out.println("连接服务器2获取订单信息");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("xiaoming订单号666");
            return "666";
        },ex);
    }
}
