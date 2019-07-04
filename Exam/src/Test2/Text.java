package Test2;
/**
 定义测试类Test，在main方法实现以下功能：
 * 创建Card对象card，设置名称：“公交卡”，设置余额：200元；
 * 创建Cardreader对象,调用其recharge方法将card传入，充值100元；
 * 创建Phone对象,调用其connect方法和recharge方法,充值50元；
*/
public class Text {
    public static void main (String []arge){
        Card card =  new Card("公交卡", 200);
          //System.out.println(card);
        Cardreader c = new Cardreader();
        c.recharge(card,100);

        Phone p = new Phone();
        p.recharge(card,50);


    }
}
