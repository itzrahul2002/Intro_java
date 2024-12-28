import java.util.Scanner;

public class Practice12 {
    public static void main (String[] args)
    {
        int[] array= {12,34,56,67,43,234,56,987};

        int min = array[0];
        int max = array[0];
        for (int i=1;i<array.length;i++)
        {
            if(array [i] > max)
            {
                max=array[i];
            }
            else if (array[i]<min)
            {
                min=array[i];
            }

        }
        System.out.println("Maximum is : "+max);
        System.out.println("Minimum is : "+min);
    }
}
