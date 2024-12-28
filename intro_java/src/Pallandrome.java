import java.util.Scanner;

public class Pallandrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Character :");
        String str=sc.next();

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev= sb.toString();
        if(str.equals(rev))
        {
            System.out.println("yes It is Palindromic");
        }
        else
        {
            System.out.println("No it is not palindromic");
        }
    }
}
