import java.util.Arrays;

public class Practice10 {
    public static void  main(String[] args)
    {
        int[] arr1={1,2,3,4,5,22,44};
        int[] arr2={9,8,3,5,7,43,22};
        boolean ans =false;
        System.out.println("Array1 : "+ Arrays.toString(arr1));
        System.out.println("Array2 : "+Arrays.toString(arr2));

//        System.out.println("Common elements is :"+" ");
        for (int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr2.length;j++)
            {
                if (arr1[i]==arr2[j])
                {
                    System.out.println("Common elements is :"+arr1[i]+" ");
                }

            }
        }

    }
}
