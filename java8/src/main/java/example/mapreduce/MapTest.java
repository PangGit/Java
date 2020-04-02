package example.mapreduce;

import java.util.Arrays;
import java.util.List;

/*例6、Java 8中使用lambda表达式的Map和Reduce示例*/
public class MapTest {

    /*
    本例介绍最广为人知的 函数式编程概念map。它允许你将对象进行转换。

    例如在本例中，我们将 costBeforeTax 列表的每个元素转换成为税后的值。
        我们将 x -> x*x lambda表达式传到 map() 方法，后者将其应用到流中的每一个元素。
        然后用 forEach() 将列表元素打印出来。

    使用流API的收集器类，可以得到所有含税的开销。用 toList() 这样的方法将 map 或任何其他操作的结果合并起来。

    由于收集器在流上做终端操作，因此之后便不能重用流了。
    */
    public static void main(String[] args) {

        // 不使用lambda表达式为每个订单加上12%的税
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + .12 * cost;
            System.out.println(price);
        }

        // 使用lambda表达式
        List<Integer> costBeforeTax2 = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax2.stream().map((cost) -> cost + .12 * cost).forEach(System.out:: println);


    }

}
