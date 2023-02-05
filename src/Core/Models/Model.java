package Core.Models;

public interface Model {
    double result();
    void setX(double value);
    void setY(double value);
    String resultForComplex(Complex c1, Complex c2);
}
