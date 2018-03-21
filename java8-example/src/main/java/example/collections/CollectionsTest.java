package example.collections;

import java.util.Arrays;
import java.util.List;


/*例2、 使用lambda表达式对列表进行 迭代 */
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
