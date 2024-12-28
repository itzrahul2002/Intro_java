public class Data_type {
    public static void main(String[] args) {
        System.out.println("Rahul");
        int a = 20;
        int b = 10;
        int c = a * b;
        System.out.println(c);

//       1. byte hava limit -128 to 127
        byte x = 100;
        System.out.println(x);

//       2. short have a limit -32768 to 32767
        short x1 = 500;
        System.out.println(x1);

//        3. char In this we can store Symbols
        char multiplay='*';
        System.out.println(multiplay);


//       4. int also hav a limit -2147483648 to 2147483677
        int x3 = 400000000;
        System.out.println(x3);

//      5. boolean its Give us only boolean values
        boolean y=true;
        System.out.println(y);

//        6. long hava also limit between -9223372036854775 to 9293372036854775807
        long x4 =50000000;
        System.out.print(x4);

//      5 . float have limits value store
        float x5=12.3F;
        System.out.println(x5);

//      5 . Double have decimal value store
        double x6=32.5;
        System.out.println(x6);

//      String use " " for containing varibles
        String name="Rahul Thakur";
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(3));
        System.out.println(name);

//        USe Triple to store multiline string """
        String intro= """
                I am Rahul Thakur
                I am a Programer
                I love Coding
                """;
        System.out.println(intro);

//      final is use to const final value desnot change or not updated
         final String id="Rahul thakur";
            System.out.println(id);


    }
}