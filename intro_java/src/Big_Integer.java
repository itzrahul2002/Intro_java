import java.math.BigInteger;

public class Big_Integer {
    public static void main(String[] args) {
//        long x =222324444;
//        int y  =348535345;
//        long z = x+y;
        BigInteger a = new BigInteger("1283232323232322489248925");
        BigInteger  b = new BigInteger("234343434343434343434344");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        BigInteger b2 =a.pow(20);
        System.out.println(b2);
    }
}
