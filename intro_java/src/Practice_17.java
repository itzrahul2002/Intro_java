import java.util.Scanner;

public class Practice_17 {
    static void show(int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter Row Number :");
        int row = sc.nextInt();
        System.err.print("Enter Column Number :");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] =sc.nextInt();
            }
        }

        show(arr);
    }
}
