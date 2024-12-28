import java.util.Scanner;

public class Practice16 {
    public static void main (String args[])
    {
        System.out.print("Enter a Initial Rage :");
        Scanner sc=new Scanner(System.in);
        int min= sc.nextInt();
        System.out.print("Enter a Final Rage :");
        int max= sc.nextInt();

        for(int i=min;i<=max;i++)
        {
            if(i%2==0)
            {
                System.out.println("Ii is Even Number : "+i);
            }
            else
            {
                System.out.println("It is ODD Number : "+i);
            }
        }
    }
}
