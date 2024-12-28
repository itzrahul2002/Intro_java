class C_P{
    int real;
    int imaginary;
    C_P(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    void print(){
        System.out.println(real+" "+imaginary+"i");
    }
    C_P add(C_P c){
        int sumReal = real+c.real;
        int sumImaginary = imaginary+c.imaginary;
        C_P ans = new C_P(sumReal, sumImaginary);
        return ans;
    }
}
public  class Complex_Number {
    public static void main(String[] args) {
        C_P x = new C_P(2,3);
        x.print();

        C_P y = new C_P(-5,4);
        y.print();

        C_P z =x.add(y);
        z.print();

    }

}
