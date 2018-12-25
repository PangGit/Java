package example.lambda;

import java.util.ArrayList;
import java.util.List;


/*例1、用lambda表达式实现Runnable*/
public class ThreadTest {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        /*传统方式*/
        new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(java.lang.Thread.currentThread().getName());
            }
        }, "name : old thread").start();


        /*使用lambda表达式替换匿名类，实现Runnable接口。用 () -> {} 代码块替代了整个匿名类*/
        new java.lang.Thread(() -> {
            System.out.println(java.lang.Thread.currentThread().getName());
        }, "name : new thread").start();

    }


}
