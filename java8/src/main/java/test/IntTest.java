package test;

public class IntTest {

    public IntTest() {
    }

    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        System.out.println(y + z / ++x);

        int i = 5;
        int j = 10;
        System.out.println(~j);
        System.out.println(i + ~j);

    }
}
