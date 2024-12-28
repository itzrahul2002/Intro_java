import java.util.Scanner;

public class Practice_19 {
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

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <i; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j<arr[1].length;j++){
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println();
        }
    }
}
