public class Variables_Arguments {
    static int getavg(int...varagrs)
    {
//        System.out.println(varagrs)
//        System.out.println(varagrs.getClass().getSimpleName());
        int total=0;
        for(int num:varagrs)
        {
            total+=num;
        }
        return total;
    }
    public static void main(String[] args)
    {
        int avg1 =getavg(1,2,3,4,5);
        int avg2 =getavg(2,4,2);
        System.out.println(avg1);
        System.out.println(avg2);
    }
}
