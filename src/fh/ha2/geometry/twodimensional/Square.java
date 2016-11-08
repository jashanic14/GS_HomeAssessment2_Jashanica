package fh.ha2.geometry.twodimensional;

/**
 * Created by Acer on 08.11.2016.
 */
public class Square extends TwoDim {

    private double sideA;

    public Square(int x, int y, double sideA) {
        this.sideA = sideA;
        this.x=x;
        this.y=y;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        return Double.compare(square.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calcArea() {
        return sideA*sideA;
    }

    @Override
    public double calcPerimeter() {
        return 4*sideA;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        //sb.append("sideA=").append(sideA);
        sb.append("area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }
}
