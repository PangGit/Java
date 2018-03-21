package example.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 例9、复制不同的值，创建一个子列表 */
public class CollectionsTest2 {

    /* 利用流的 distinct() 方法来对集合进行去重。*/
    public static void main(String[] args) {

        // 用所有不同的数字创建一个正方形列表
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        List<Integer> distinct = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());

        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
    }
}
