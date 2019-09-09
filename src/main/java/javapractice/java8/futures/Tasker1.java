package javapractice.java8.futures;

import java.util.concurrent.TimeUnit;

public class Tasker1 implements Runnable {
    /** volatile 解决可见性问题 */
    private volatile String username;

    @Override
    public void run() {
        System.out.println("this is my test!");
        username = "xhg1";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

class Tasker2 implements Runnable{

    private String username;

    public Tasker2() {
    }

    public Tasker2(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println("this is my test!");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        username = "xhg2";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
