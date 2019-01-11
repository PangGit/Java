package jvm;

import java.util.Scanner;

/**
 * StackOverFlowError： 若Java虚拟机栈的内存大小不允许动态扩展，那么当线程请求栈的深度超过当前Java虚拟机栈的最大深度的时候，就抛出StackOverFlowError异常。
 */
public class StackOverFlowError {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = sum(n);
        System.out.println(sum);
    }

    private static long sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }
}
