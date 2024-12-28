import java.util.Scanner;

public class Practice11 {
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter A first Number :");
        int a= sc.nextInt();
        System.out.print("Enter A second Number :");
        int b= sc.nextInt();
        System.out.print("Enter A third number :");
        int c= sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("Maximum is A :"+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Maximum is A :"+b);
        }

        else
        {
            System.out.println("Maximum is C :"+c);
        }
    }
}
