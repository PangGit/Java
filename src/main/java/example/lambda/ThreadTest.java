package example.lambda;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        /*传统方式*/
        new java.lang.Thread(new Runnable() {
            public void run() {
                System.out.println(java.lang.Thread.currentThread().getName());
            }
        }, "name : old thread").start();

        /*lambda*/
        new java.lang.Thread(() -> {
            System.out.println(java.lang.Thread.currentThread().getName());
        }, "name : new thread").start();

    }


}
