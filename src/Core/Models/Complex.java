package Core.Models;

public class Complex extends CalcModel{
    public Complex(double real, double image) {
        super.x = real;
        super.y = image;
    }
    @Override
    public double result() {
        return 0;
    }

    @Override
    public String resultForComplex(Complex c1, Complex c2) {
        return null;
    }
}
