import java.util.Scanner;

public class do_while_Loop {
    public static void main(String[] args)
    {
        System.out.print("Enter A number : ");
        Scanner sac = new Scanner(System.in);
        int num = sac.nextInt();

        do{
            System.out.println(num);
            num--;
        }while (num>0);
    }
}
