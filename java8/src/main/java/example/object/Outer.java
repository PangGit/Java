package example.object;

public class Outer {

    private final int b = 12;

    void outMethod() {
        /*
        局部内部类访问局部变量的注意事项：
		必须被final修饰
		因为局部变量会随着方法的调用完毕而消失，这个时候，局部对象并没有立马从堆内存中消失，还要使用那个变量。
		为了让数据还能继续被使用，就用final修饰，这样，在堆内存里面存储的其实是一个常量值。
		*/
        final int a = 10;
        class Inner {
            void innerMethod() {
                System.out.println(a);
                System.out.println(b);
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        new Outer().outMethod();
    }

}