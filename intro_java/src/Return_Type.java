public class Return_Type {
    static int cube (int num)
    {
        return num*num*num;
    }
    static void hello()
    {
        System.out.println("I am A Progammer");
    }
    static String[] avengers()
    {
        String[] heros={"Iron Man","Caption America","Thor","Wanada"};
        return heros;
    }
    public static void main(String[] args)
    {
        System.out.println(cube(2));
        System.out.println(cube(5));
        hello();

        String[] arr=avengers();
        for(String hero:arr)
        {
            System.out.println(hero);
        }
    }
}
