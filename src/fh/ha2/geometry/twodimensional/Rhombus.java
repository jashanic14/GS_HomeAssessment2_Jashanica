package fh.ha2.geometry.twodimensional;

/**
 * Created by Acer on 08.11.2016.
 */
public class Rhombus extends TwoDim {

    private double side;
    private double height;


    public Rhombus(int x, int y, double side, double height) {
        this.side = side;
        this.height = height;
        this.x=x;
        this.y=y;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return side*height;
    }

    @Override
    public double calcPerimeter() {
        return 4*side;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rhombus rhombus = (Rhombus) o;

        if (Double.compare(rhombus.side, side) != 0) return false;
        return Double.compare(rhombus.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rhombus{");
        //sb.append("side=").append(side);
        //sb.append("height=").append(height);
        sb.append("area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }
}
