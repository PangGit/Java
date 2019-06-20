package test;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FloatPrimitiveTest {

    public static void main(String[] args) {

        test1();
        test2();
       // test3();
        test4();
        test5();

    }

    private static void test1() {
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;

        if (a == b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void test2() {
        Float a = Float.valueOf(1.0f - 0.9f);
        Float b = Float.valueOf(0.9f - 0.8f);

        if (a.equals(b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void test3() {
        String param = null;
        switch (param) {
            case "null":
                System.out.println("null");
                break;
            default:
                System.out.println("default");
        }
    }

    private static void test4() {
        BigDecimal a = new BigDecimal(0.1);
        System.out.println(a);

        BigDecimal b = new BigDecimal("0.1");
        System.out.println(b);
    }

    private final static Lock lock = new ReentrantLock();

    private static void test5() {
        // lock是非公平锁
        // tryLock获取锁失败则直接往下执行
        try {
            lock.tryLock();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}