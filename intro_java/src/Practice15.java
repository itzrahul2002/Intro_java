import java.util.Scanner;

public class Practice15 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;

        for(int i=1;i<=num;i++)
        {
            if(num %i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("This is Prime Number "+num);
        }
        else
        {
            System.out.println("This is Not a Prime Number "+num);
        }
    }
}
