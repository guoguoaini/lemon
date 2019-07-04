package Test2;
/**
 a.定义公交卡类Card，要求包含：
 1)成员变量:名称 type（ String 型）、名称balance（int型）；
 2)构造方法:空参、满参构造方法；
 */
public class Card {
    private String  type ;
    private int   balance;

    public Card() {
    }

    public Card(String type, int balance) {
        this.type = type;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
