package jvm;

import java.util.concurrent.atomic.AtomicInteger;

public class OutOfMemoryError {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        OutOfMemoryError out = new OutOfMemoryError();
        try {
            out.add();
        } catch (Throwable e) {
            System.out.println(out.atomicInteger.intValue());
            e.printStackTrace();
        }

    }

    private void add() throws Throwable {
        atomicInteger.getAndIncrement();
        try {
            add();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(atomicInteger.intValue());
            return;
        }
    }
}
