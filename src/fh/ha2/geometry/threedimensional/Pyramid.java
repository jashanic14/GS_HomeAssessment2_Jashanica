package fh.ha2.geometry.threedimensional;

/**
 * Created by Acer on 08.11.2016.
 */
public class Pyramid extends ThreeDim {

    private double sideA;
    private double height;

    public Pyramid(int x, int y, double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
        this.x=x;
        this.y=y;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcVolume() {
        return (1/3)*(sideA*sideA)*height;
    }

    @Override
    public double calcSurfaceArea() {
        return (sideA*sideA)*4*((1/2)*sideA*height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pyramid pyramid = (Pyramid) o;

        if (Double.compare(pyramid.sideA, sideA) != 0) return false;
        return Double.compare(pyramid.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        //sb.append("sideA=").append(sideA);
        //sb.append("height=").append(height);
        sb.append("volume=").append(calcVolume());
        sb.append(", surfaceArea=").append(calcSurfaceArea());

        sb.append('}');
        return sb.toString();
    }
}
