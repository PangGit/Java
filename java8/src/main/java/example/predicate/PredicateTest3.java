package example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*例7、通过过滤创建一个String列表*/
public class PredicateTest3 {

    /*
    过滤是Java开发者在大规模集合上的一个常用操作，而现在使用lambda表达式和流API 【过滤大规模数据集合】 是惊人的简单。

    流提供了一个 filter() 方法，接受一个 Predicate 对象，即可以传入一个lambda表达式作为过滤逻辑。

    下面的例子是用lambda表达式过滤Java集合，将帮助理解。
    */
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        // 创建一个字符串列表，每个字符串长度大于2
        List<String> filtered = strList.stream().filter(x -> x.toString().length() > 2).collect(Collectors.toList());

        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);

    }
}
