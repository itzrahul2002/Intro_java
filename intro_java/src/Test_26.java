public class Test_26 {
    public void foo(boolean a,boolean b){
        if(a){
            System.out.println("A");
        } else if (a&&b) {
            System.out.println("A && B");
        }
        else {
            if(!b){
                System.out.println("NOT B");
            }
            else {
                System.out.println("ELSE");
            }
        }
    }
    public static void main(String[] args) {
//        String biz= args[1];
//        String baz = args[2];
//        String rip = args[3];
//        System.out.println("Args is" +rip);
        Test_26 t = new Test_26();
        t.foo(false,false);
    }
}
