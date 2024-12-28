
import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args)
    {
         Scanner sac = new Scanner(System.in);
         int months = sac.nextInt();

         switch (months){
             case 1:
                     System.out.println("january");
                     System.out.println("31 Days");
                     break;
             case 2:
                     System.out.println("Febuary");
                     System.out.println("28 Days");
                     break;
             case 3:
                    System.out.println("March");
                    System.out.println("32 Days");
                    break;
             case 4:
                    System.out.println("April");
                    System.out.println("30 Days");
                    break;
             case 5:
                    System.out.println("May");
                    System.out.println("31 Days");
                    break;
             case 6:
                    System.out.println("June");
                    System.out.println("30 Days");
                    break;
             case 7:
                    System.out.println("July");
                    System.out.println("31 Days");
                    break;
             case 8:
                    System.out.println("August");
                    System.out.println("31 Days");
                    break;
             case 9:
                 System.out.println("September");
                 System.out.println("30 Days");
                 break;
             case 10:
                 System.out.println("October");
                 System.out.println("31 Days");
                 break;
             case  11:
                 System.out.println("November");
                 System.out.println("30 Days");
                 break;
             case 12:
                 System.out.println("December");
                 System.out.println("31 Dyas");
                 break;
             default:{
                 System.out.println(months + """
                         : This Number Is Invalid Months !
                         PLEASE ENTER VALID MOTHS NUMBER
                         """);
             }

         }
          Scanner sc = new Scanner(System.in);
          String weather = sc.next();

          switch (weather){
              case "summer" -> {
                  System.out.println("Wear a Sunglasses & cap");
              }

              case "winter" -> {
                  System.out.println("Its Very Cold wear sweater and Woolen clothes");
              }

              case "rainy" -> {
                  System.out.println("Got outside with Umbrella and wear rain coat");
              }
              default ->{
                  System.out.println("Its Spring Season");
              }
          }

          Scanner scn = new Scanner(System.in);
          String vowels = scn.next();

          switch (vowels){
              case "a","e","i","o","u","A","E","I","O","U":
                  System.out.println(vowels+" :It is a Vowels");
                  break;
              default:{
                  System.out.println(vowels+" :It is a Consonant");
              }
          }

    }
}
