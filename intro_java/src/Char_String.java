public class Char_String {
    public static void main(String[] args)
    {
        String str="Hello";
        char[] arr={'H','e','l','l','o'};

        System.out.println(str);
        System.out.println(arr);

        char[] arr2= str.toCharArray();
        System.out.println(arr2);

        String str2 = new String(arr);
        System.out.println(str2);
    }
}
