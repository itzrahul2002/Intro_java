public class Autoboxing {
    public static void main(String[] args) {
        int i=10;
        float f=5.5f;
        char c='J';

        Integer x=i;
        Float y=f;
        Character z=c;

        System.out.println(x==i);
        System.out.println(y);
        System.out.println(z);

        System.out.println(Integer.max(5,6));
    }
}
