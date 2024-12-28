public class Scope_Variables {
    static void hello()
    {
        String s="Hello World";
        System.out.println(s);
    }
    public static void main(String[] agrs)
    {
        int a=5;
        if(true)
        {
            a=10;
            System.out.println("InSide the if a ="+a);
        }
        System.out.println("OutSide the if a ="+a);
        hello();
//        System.out.println(s);
    }
}
