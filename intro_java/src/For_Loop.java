import java.util.Scanner;
public class For_Loop {
    public static void main (String[] args)
    {
        int[] number={12,3,23,4,98,87};
        int max = number[0];

        for (int i=0; i<number.length;i++)
        {
            if(number[i]>max)
            {
                max = number[i];
            }
        }
        System.out.println("MAXIMUM NUMBER IS : "+max);
    }
}
