import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Array Limit :");
        int num=sc.nextInt();
        int[]arr=new int[num];

        for (int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
