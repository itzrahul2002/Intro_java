class OuterClass{
//    int x=10;
    class InnerClass{
        void show(){
            System.out.println("Inner Class Show Method");
        }
    }
}
public class Practice_30 {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass i = out.new InnerClass();
        i.show();
    }
}
