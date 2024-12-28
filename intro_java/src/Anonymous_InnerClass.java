class Upper{
    public void show(){
        System.out.println("upper Class Method");
    }
}

public class Anonymous_InnerClass {
    public static void main(String[] args) {
        Upper u = new Upper()
        {
            public void show(){
                super.show();
                System.out.println("In Class Method");
            }
        };
        u.show();

    }
}
