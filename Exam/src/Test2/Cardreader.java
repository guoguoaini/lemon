package Test2;
/**
 定义读卡器类Cardreader,包含:
 成员方法: void  recharge (Card card，int num):将num(充值的钱)累加进卡片余额并打印：
 使用读卡器充值"XXX"元成功，卡上余额："XXX"；
 */
public class Cardreader {
    private Card  card ;
    private int   num;

    public Cardreader() {
    }
    public Cardreader(Card card, int num) {
        this.card =card;
        this.num =num;
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

    public void recharge(Card card, int num){
     int sum = card.getBalance();
        sum+=num;
        System.out.println("使用读卡器充值"+num+" 元成功，卡上余额："+card.getBalance()+"元");

    }
}
