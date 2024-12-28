public class Contains {
    public static void main(String[] args)
    {
        String str1="Har Har Mahadev";
        String str2="Jai Shree ram";
        String str3="Jai Shree ram";

        System.out.println(str1.contains("ar"));
        System.out.println(str1.contains("o"));

        System.out.println(str3.contains(str2));
    }
}
