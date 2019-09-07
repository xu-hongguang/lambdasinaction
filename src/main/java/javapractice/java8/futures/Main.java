package javapractice.java8.futures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Tasker1 tasker1 = new Tasker1();
        service.execute(tasker1);
        for (;;){
            if (tasker1.getUsername() != null){
                System.out.println("得到: " + tasker1.getUsername());
                break;
            }
        }

//        Future<?> submit = service.submit(() -> {
//
//        });
    }
}
