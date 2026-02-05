package BeanLifecycle;

public class Laptop {

    public Laptop(){
        System.out.println("1.laptop object created ");
    }
    public void start(){
        System.out.println("\uD83D\uDCBB.laptop started");
    }
    public void destroy(){
        System.out.println("3.laptop destroyed ");
    }
}
