package test.exam;

public class SingleTon{

    private SingleTon(){}

    private static class SingleTonInner{
        private static SingleTon INSTANCE = new SingleTon();
    }

    public static SingleTon getInstance(){
        return SingleTonInner.INSTANCE;
    }
}
