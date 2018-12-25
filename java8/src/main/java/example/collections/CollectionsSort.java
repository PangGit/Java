package example.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*例2、使用Java 8 lambda表达式进行 排序处理*/
public class CollectionsSort {

    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a', 'c', 'b', 'f', 'e','d');


        // 排序
        // 如果同时有自然排序和比较器排序，以比较器排序为主

        // 自然排序
        /*Collections.sort(list);*/

        // 比较器排序  使用匿名类 为 Collections.sort() 定制 Comparator。
        /*
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return c1-c2;
            }
        });
        */


        // Lambda
        Collections.sort(list, (c1, c2) -> c1 - c2);


        // 遍历集合
        /*for (Character s : list) {
            System.out.println(s);
        }*/
        list.forEach(System.out::println);


    }
}
