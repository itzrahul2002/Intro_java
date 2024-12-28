public class Outer {
    int x=10;
     class Inner_class{
        void show(){
            System.out.println("inner Class Method " +x);
        }
    }
    public static class Inner2{
        void show2(){
            System.out.println("2 inner Class Method ");
        }
    }

    public static void main(String[] args) {
        Outer o =new Outer();
        Outer.Inner_class oi =o.new Inner_class();
        oi.show();

        Outer.Inner2 oi2 = new Outer.Inner2();
        oi2.show2();
    }
}
