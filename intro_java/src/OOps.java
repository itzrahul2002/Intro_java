class Laptop{
    String brand ="ASUS";
    String color ="White";
    int price =500000;
    boolean isLocked=false;
    void gaming(){
        System.out.println("Advance Gaming Functions");
    }
    void editing(){
        System.out.println("Advance Version ");
    }
    void lock(){
        isLocked=true;
        System.out.println("Pc is locked");
    }
    void unlock(){
        isLocked=false;
        System.out.println("Pc is unlocked");
    }
    int get(){
        return price;
    }
    void set(int price){
        if(price<=0){
            price=0;
        }
        this.price = price;
    }
}
public class OOps {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        Laptop l1 = new Laptop();
        System.out.println(l.brand);
        System.out.println(l.color);
        System.out.println(l.price);
        l.editing();l.gaming();

        l.set(-12133);
        System.out.println(l.get());

        l.lock();

        l1.unlock();
        System.out.println(l.isLocked);
        System.out.println(l1.isLocked);
    }
}
