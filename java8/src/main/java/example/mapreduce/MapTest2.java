package example.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 例8、对列表的每个元素应用函数 */
public class MapTest2 {

    /*
    我们通常需要对列表的每个元素使用某个函数，例如逐一乘以某个数、除以某个数或者做其它操作。

    这些操作都很适合用 map() 方法，可以将转换逻辑以lambda表达式的形式放在 map() 方法里，就可以对集合的各个元素进行转换了，如下所示。
    */
    public static void main(String[] args) {
        // 将字符串换成大写并用逗号链接起来
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

        String G7Countries = G7.stream().map(String::toUpperCase).collect(Collectors.joining(", "));

        System.out.println(G7Countries);
    }
}
