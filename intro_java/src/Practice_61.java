import java.util.Scanner;

public class Practice_61 {

    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size : ");
        int s=sc.nextInt();

        System.out.print("Enter array :");
        int arr[] = new int[s];



        for(int i=0; i<s; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter sum :");
        int sum=sc.nextInt();

        for (int i=0; i<s; i++){
            for (int j=1; j<s; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
                else{
                    flag = true;
                }
            }
        }
        if (flag){
            System.out.println("Sum Not Found");
        }
    }
}
