import java.util.Scanner;
public class and_Operator {
    public static void main (String[] args)
    {

        System.out.print("Enter Physics Number :");
        Scanner num = new Scanner(System.in);
        int phy = num.nextInt();
        System.out.print("Enter Chemistry Number :");
        Scanner num1 = new Scanner(System.in);
        int chem =num1.nextInt();
        System.out.print("Enter Maths Number :");
        Scanner  num2 = new Scanner(System.in);
        int maths = num2.nextInt();

        int total=phy+chem+maths;

        if(phy>=40 & chem>=45 & maths>=50 & total>=135)
        {
            System.out.println("You are Eligible");
            System.out.println("Your Total Marks : "+total);
        }
        else
        {
            System.out.println("You are Not Eligible");
            System.out.println("Your Total Marks : "+total);
        }
    }
}
