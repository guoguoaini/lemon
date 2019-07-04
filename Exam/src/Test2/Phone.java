package Test2;
/**
 定义手机类Phone,实现Ecard接口，要求：
 1) 重写recharge (Card card)方法:首先打印“已连接网上充值服务，
 可以使用充值功能” 然后验证传入的卡片类型是否为“公交卡”，
 类型为“公交卡”则将num累加进卡片余额并打印“使用手机充值"XXX"元成功，
 卡上余额："XXX”，否则打印“验证失败，目前手机充值只支持公交卡”；
*/
  public class Phone implements Ecard {
  private Card  card ;
  private int   num;

  public Phone() {
  }
  public Phone(Card  card ,int   num) {
    this.card=card;
    this.num=num;
  }

  @Override
    public void connect() {
    }

  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
    public void recharge(Card card, int num) {
      int sum = card.getBalance();
      System.out.println("已连接网上充值服务，可以使用充值功能");
      if (card.getType()=="公交卡"){
        sum+=num;
        card.setBalance(sum);
        System.out.println("使用手机充值"+num+"元成功，卡上余额："+card.getBalance()+"元");
      }else{
        System.out.println("验证失败，目前手机充值只支持公交卡");
      }


    }
}
