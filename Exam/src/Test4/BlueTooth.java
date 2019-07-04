package Test4;

public interface BlueTooth {
    void  btFunction();

    default void  connecting(){
        System.out.println("可以输出蓝牙");
    }

}
