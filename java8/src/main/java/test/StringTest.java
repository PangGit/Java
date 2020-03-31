package test;

public class StringTest {

    public static void main(String[] args) {

        {
            String str1 = "abc";
            String str2 = new String("abc");
            String str3 = str2.intern();

            assertSame(str1 == str2);
            assertSame(str2 == str3);
            assertSame(str1 == str3);
        }
        {
            String str = "ab" + "cd" + "ef";
        }
        {
            String str = "abcdef";
            for(int i=0; i<1000; i++) {
                str = str + i;
            }
            System.out.println(str);
        }
        {

            String s1 = "hello";
            String s2 = "world";
            String s3 = "helloworld";
            System.out.println(s3 == s1 + s2);
            System.out.println(s3.equals((s1 + s2)));

            System.out.println(s3 == "hello" + "world");
            System.out.println(s3.equals("hello" + "world"));

            // 通过反编译看源码，我们知道这里已经做好了处理。
             System.out.println(s3 == "helloworld");
             System.out.println(s3.equals("helloworld"));
        }

    }

    private static void assertSame(boolean b) {
        System.out.println(b);
    }


}
