import java.math.BigInteger;

public class Big_Factorial {
    public static void main(String[] args) {
        int x =500;
        BigInteger ans =new BigInteger("1");

        for (int i=1;i<=x;i++){
            BigInteger temp = new BigInteger(i+"");
            ans = ans.multiply(temp);
        }
        System.out.println(ans);
    }
}
