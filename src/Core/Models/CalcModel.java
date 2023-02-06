package Core.Models;

public abstract class CalcModel implements Model{
   double x, y;

    @Override
    public void setX(double value) {
        this.x = value;
    }

    @Override
    public void setY(double value) {
        this.y = value;
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
