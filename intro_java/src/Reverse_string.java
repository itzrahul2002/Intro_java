public class Reverse_string {
    public static void main(String[] agrs)
    {
        String str="I Love Coding";
        String rev="";

        for (int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}
