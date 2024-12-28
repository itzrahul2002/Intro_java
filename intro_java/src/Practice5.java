import java.util.Scanner;

public class Practice5 {
    public static  void main(String[] args)
    {
        Scanner sac=new Scanner(System.in);
        int n=sac.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sac.nextInt();
            System.out.println(arr[i]);
        }

    }
}
