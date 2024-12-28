public class Method_OverLoding {
    static int add(int a,int b)
    {
        System.out.println("Inside First Add");
        return a+b;
    }
    static String add(String a,String b)
    {
        System.out.println("Inside Second Add");
        return a+b;
    }
    static String add(int a,String b)
    {
        System.out.println("Inside Third Add");
        return a+b;
    }
    public static void main(String[] args)
    {
        System.out.println(add(2,3));
        System.out.println(add("Love","❤️Coding"));
        System.out.println(add(5,"core"));
    }

}
