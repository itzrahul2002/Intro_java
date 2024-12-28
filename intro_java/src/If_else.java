import java.util.Scanner;
public class If_else {
    public static void main (String[] args)
    {
        Scanner sca = new Scanner (System.in);
        int x = sca.nextInt();

        if(x>0)
        {
            System.out.println("It is Possative Number : "+x);
        }
        else if (x<0)
        {
            System.out.println("It is Negative Number : "+x);
        }
        else
        {
            System.out.println("It is Zero");
        }

        Scanner y = new Scanner(System.in);
        int value = y.nextInt();

        if(value % 2==0)
        {
            System.out.println("It is Even Number : "+value);
        }
        else
        {
            System.out.println("It is Odd number : "+value);
        }
    }
}
