class Hello{
    int x;
    int y;
    Hello(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println(this.x + " " + this.y);
    }

    @Override
    public String toString() {
        return  "x" + x + " y" + y;
    }
}
public class This_keyword {
    public static void main(String[] args) {
        Hello h = new Hello(5,10);
        h.print();
        System.out.println(h);
    }
}
