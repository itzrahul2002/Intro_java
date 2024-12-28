import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Character :");
        String str= sc.next();
        String rev="";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println("Your Reverse is :"+rev);
    }
}
