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
}
