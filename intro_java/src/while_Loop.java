import java.util.Scanner;
public class while_Loop {
    public static void main (String[] args)
    {
        Scanner sac = new Scanner(System.in);
        int num = sac.nextInt();
        int count=0;

        while (num>0)
        {
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
