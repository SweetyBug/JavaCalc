package Core.Models;

public class Multiplication extends CalcModel {
    public Multiplication() {

    }

    @Override
    public double result() {
        return super.x * super.y;
    }

    @Override
    public String resultForComplex(Complex c1, Complex c2) {
        String newReal = String.valueOf(c1.x * c2.x - c1.y * c2.y);
        String newImage = String.valueOf(c2.x * c1.y + c1.x * c2.y);
        return newReal + "+" + newImage;
    }


}
