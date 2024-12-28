import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int[] arr={12,23,34,45,56,67,78,89,90};
        int key= sc.nextInt();
        boolean ans =false;
        for (int num:arr)
        {
            if(num==key)
            {
                ans=true;
                break;
            }
        }
        if(ans)
        {
            System.out.println("Your key is Fond");
        }
        else
        {
            System.out.println("Your key Doesn,t Find");
        }
    }
}
