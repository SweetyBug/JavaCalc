package Core.Models;

public class Substation extends CalcModel{

    public Substation() {

    }
    @Override
    public double result() {
        return super.x - super.y;
    }

    @Override
    public String resultForComplex(Complex c1, Complex c2) {
        String a = String.valueOf(c1.x - c2.x);
        String b = String.valueOf(c1.y - c2.y);

        return a+"+"+b;
    }
}
