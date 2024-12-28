import java.util.Scanner;

public class reading {
    public static void main (String[] args)
    {
        Scanner data = new Scanner(System.in);
        int x= data.nextInt();
        System.out.println(x);

        Scanner scan = new Scanner(System.in);
        byte y = scan.nextByte();
        System.out.println(y*y);

        Scanner arr = new Scanner(System.in);
        long z = arr.nextLong();
        System.out.println(z*z*z);

        Scanner name =new Scanner(System.in);
        String a=name.nextLine();
        System.out.println(a);

        Scanner res = new Scanner(System.in);
        boolean b = res.nextBoolean();
        System.out.println(b);

        Scanner ans = new Scanner(System.in);
        char c = ans.next().charAt(0);
        System.out.println(c);

        Scanner answer = new Scanner(System.in);
        char p = answer.next().charAt(2);
        System.out.println(p);
    }
}

