import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n= sc.nextInt();
        int[]arr=new int[n];

        for (int i=1;i<=n;i++)
        {
            System.out.println(i*i);
        }
    }
}
