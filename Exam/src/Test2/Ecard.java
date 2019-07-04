package Test2;
/**
 b.定义接口Ecard，要求 ：
 1)定义默认方法： void connect()；打印：“打印输出"已连接卡电子充值服务，可以使用充值功能"；
 2)定义抽象方法： void recharge (Card card,int num)；
 */
abstract interface Ecard {
  default void connect(){
     System.out.println("已连接卡电子充值服务，可以使用充值功能\t");
  }
    void recharge(Card card,int num);

}
