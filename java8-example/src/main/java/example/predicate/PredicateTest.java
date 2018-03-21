package example.predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
除了在语言层面支持函数式编程风格，Java 8也添加了一个包，叫做 java.util.function。

它包含了很多类，用来支持Java的函数式编程。

其中一个便是Predicate，使用 java.util.function.Predicate 函数式接口以及lambda表达式，可以向API方法添加逻辑，用更少的代码支持更多的动态行为。

下面是Java 8 Predicate 的例子，展示了过滤集合数据的多种常用方法。

Predicate接口非常适用于做过滤。
*/
/*例4、使用lambda表达式和函数式接口Predicate*/
public class PredicateTest {

    public static void main(String[] args) {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("\nLanguages which starts with J :");
        filter(languages, (str) -> str.toString().startsWith("J"));

        System.out.println("\nLanguages which ends with a ");
        filter(languages, (str) -> str.toString().endsWith("a"));

        System.out.println("\nPrint all languages :");
        filter(languages, (str) -> true);

        System.out.println("\nPrint no language : ");
        filter(languages, (str) -> false);

        System.out.println("\nPrint language whose length greater than 4:");
        filter(languages, (str) -> str.toString().length() > 4);


    }

    /*1*/
    /*
    public static void filter(List names, Predicate condition) {
        for(Object name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }*/


    /*
        Stream API的过滤方法也接受一个Predicate，这意味着可以将我们定制的 filter() 方法替换成写在里面的内联代码
    */
    /*2*/
    public static void filter(List names, java.util.function.Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }

}