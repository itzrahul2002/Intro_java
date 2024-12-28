import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Limt :");
        int num= sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a Number You want to Find :");
        int key= sc.nextInt();
        int ans=-1;
        for(int i=0;i<num;i++)
        {
            if(arr[i]==key)
            {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
