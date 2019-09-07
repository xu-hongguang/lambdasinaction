package javapractice.java8.futures;

import java.util.concurrent.*;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Object> future1 = ex.submit((Callable<Object>) () -> {
            System.out.println("连接服务器1获取用户名信息");
            TimeUnit.SECONDS.sleep(5);
            return "xiaoming";
        });
        while (!future1.isDone()){ }
        String username = (String) future1.get();
        System.out.println(username);

        Future<Object> future2 = ex.submit(()->{
            System.out.println("连接服务器2获取订单信息");
            TimeUnit.SECONDS.sleep(5);
            return "xiaoming订单号666";
        });
        while (!future2.isDone()){ }
        String username1 = (String) future2.get();
        System.out.println(username1);
    }
}
