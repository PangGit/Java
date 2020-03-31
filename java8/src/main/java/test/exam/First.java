package test.exam;

public class First {

    public static void main(String[] args) {
        System.out.println(e(1000));
        System.out.println(Integer.MAX_VALUE);
    }

    public static double e(long n) {
        double a = 3 * 5 * 7 * 11 * 13;
        long b = Integer.MAX_VALUE* ((long)Integer.MAX_VALUE + 1);
        return b/a;
    }

}
