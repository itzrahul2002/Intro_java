import java.util.Scanner;

public class array {
    public static void main(String[] args)
    {
        Scanner sac =new Scanner(System.in);
        int[] arr= new int[5];

        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sac.nextInt();
        }
        System.out.println(arr[3]);
        System.out.println(arr[0]);
    }
}
