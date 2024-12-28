import java.util.Scanner;
public class Practice2 {
   public static void main (String[] args)
   {
       Scanner sca= new Scanner(System.in);
       int amt= sca.nextInt();
       int gst_rate=sca.nextInt();
       int gst_amt=(gst_rate*amt)/100;
       int tamt= gst_amt+amt;
       System.out.println("Your GST Amount is : "+gst_amt);
       System.out.println("Your Total Amount is : "+tamt);
   }
}
