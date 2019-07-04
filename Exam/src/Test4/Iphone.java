package Test4;

public class Iphone extends Phone implements BlueTooth {
    public Iphone() {
        super();
    }

    public Iphone(String name) {
        super(name);
    }

    @Override
    public void btFunction() {
        System.out.println("支持蓝牙功能");
    }

    @Override
    void playMusic(Song song) {
        System.out.println(super.getName()+"手机正在播放"+song.getSinger()+"唱的"+song.getName());
    }


}
