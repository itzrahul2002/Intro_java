public class Varargs {
    static float getAvg(float... varargs) {
        float total=0;
        for (int i=0; i<=varargs.length;i++){
            total+=i;
        }
        return total/varargs.length;
    }

    public static void main(String[] args) {
        float avg1 = getAvg(1,2,3,4,5);
        System.out.println(avg1);
        System.out.println(getAvg(1,2,3));
    }
}
