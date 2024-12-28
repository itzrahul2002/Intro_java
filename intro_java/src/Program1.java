import java.util.Scanner;

public class Program1 {
    public static void main (String[] args)
    {
        Scanner ans = new Scanner(System.in);
        int p = ans.nextInt();
        int r = ans.nextInt();
        int t = ans.nextInt();

        int si = (p * r * t) / 100;
        System.out.println("Simple Intrest Is : "+si);
    }
}
