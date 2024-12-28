import java.util.Scanner;

public class Practice_20 {
    static void matrixRead(int arr[][]){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number :");
        int row = sc.nextInt();
        System.out.print("Enter Col number :");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        matrixRead(arr);


            for (int j = 0; j<col;j++){
                for (int i = 0; i <row; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


    }
}
