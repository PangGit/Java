package example.Collections;

import java.util.Arrays;
import java.util.List;

public class CollectionsTest {


    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a', 'c', 'b', 'f', 'e');

        /*传统方式*/
        for (Object n : list) {
            System.out.println("1:" + n);
        }

        /*lambda*/
        list.forEach(n -> System.out.println("2:" + n));

        /*方法引用（Method references）*/
        list.forEach(System.out:: println);


    }
}
