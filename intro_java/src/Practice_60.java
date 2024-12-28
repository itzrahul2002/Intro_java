public class Practice_60 {
    int x;
    static float msg(float... varargs) {
        float total=0;
        for (int i=0; i<=varargs.length;i++){
            total+=i;
        }
        return total;
    }

    public static void main(String[] args) {

//        Practice_60.msg(6,7);
        System.out.println(Practice_60.msg(5,6));
    }
}
