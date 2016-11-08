package fh.ha2.geometry.twodimensional;

/**
 * Created by Acer on 08.11.2016.
 */
public class Hexagon extends TwoDim {

    private double sideA;

    public Hexagon(int x, int y, double sideA) {
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
    public double calcArea() {
        return (sideA*sideA)*(3/2)*Math.sqrt(3);
    }

    @Override
    public double calcPerimeter() {
        return 6*sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Hexagon hexagon = (Hexagon) o;

        return Double.compare(hexagon.sideA, sideA) == 0;

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
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hexagon{");
        //sb.append("sideA=").append(sideA);
        sb.append("area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }
}
