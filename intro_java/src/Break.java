import java.util.Scanner;

public class Break {
    public static void main(String[] args)
    {
        System.out.print("Enter A Number : ");
        Scanner sca =new Scanner(System.in);
        int num=sca.nextInt();
        int i=0;

        while (i<=num)
        {
            if(i==5)
            {
                System.out.println("Loop Will Break Here !");
                break;
            }
            i++;
            System.out.println(i);
        }

    }
}
