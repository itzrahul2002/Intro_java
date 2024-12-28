import java.util.Scanner;
public class and_and_Operators {
    public static void main (String[] args)
    {
        String citizen = "Indian";
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sca.nextInt();
        String citi= sca.next();

        if(age>=18)
        {
            System.out.println("You are Eligible for Voting");
        }
        else
        {
            System.out.println("Your Are Not Eligible For Voting");
        }

    }
}

