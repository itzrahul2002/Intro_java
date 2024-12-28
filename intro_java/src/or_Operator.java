import java.util.Scanner;
public class or_Operator {

    public static void main(String[] args)
    {
        System.out.print("Enter A Physics Number :");
        Scanner sca = new Scanner(System.in);
        int phy= sca.nextInt();
        System.out.print("Enter A Maths Number :");
        Scanner sc = new Scanner(System.in);
        int maths= sc.nextInt();
        if(phy>=30 | maths>=30 )
        {
            System.out.println("You Are Pass");
        }
        else
        {
            System.out.println("You are fail");
        }
    }
}
