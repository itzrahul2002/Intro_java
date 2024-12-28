import java.util.Scanner;

public class Practice_18 {
    static void matrixRead(int arr[][]){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

    }
    static void sum(int arr1[][]){
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number :");
        int row = sc.nextInt();
        System.out.print("Enter Col number :");
        int col = sc.nextInt();

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];

        int[][] add = new int[row][col];

        matrixRead(arr1);
        matrixRead(arr2);

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                add[i][j] =arr1[i][j]+arr2[i][j];
            }
        }
        sum(add);

    }
}
