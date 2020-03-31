package jvm.string;


/**
 * intern() 方法返回字符串对象的规范化表示形式。
 * <p>
 * 它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
 * <p>
 * 返回值 : 一个字符串，内容与此字符串相同，但一定取自具有唯一字符串的池。
 * <p>
 * https://blog.csdn.net/qq_41701956/article/details/81664921
 * <p>
 * http://www.runoob.com/java/java-string-intern.html
 */
public class InternTest {


    public static void main(String[] args) {

        /* 结果：str1、str2、str3、str5都是存在于常量池，str4由于表达式右半边有引用类型，所以str4存在于堆内存，

        而str5表达式右边没有引用类型，是纯字符串常量，就存放在了常量池里面。

        其实Integer这种包装类型的-128 ~ +127也是存放在常量池里面，

        比如Integer i1 = 10;Integer i2 = 10; i1 == i2结果是true，估计也是为了性能优化。*/

        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "aaabbb";
        String str4 = str1 + str2;
        String str5 = "aaa" + "bbb";

        // false
        System.out.println(str3 == str4);
        // true
        System.out.println(str3 == str4.intern());
        // true
        System.out.println(str3 == str5);

    }


}
