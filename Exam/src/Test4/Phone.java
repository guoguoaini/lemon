package Test4;

abstract  public class Phone {
    private String name ;
    public Phone() {
    }
    public Phone(String name ){
        this.name=name;
    }

   abstract void playMusic(Song song);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
