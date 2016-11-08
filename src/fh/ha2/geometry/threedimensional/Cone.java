package fh.ha2.geometry.threedimensional;

/**
 * Created by Acer on 08.11.2016.
 */
public class Cone extends ThreeDim {

    private double radius;
    private double height;
    private double s;

    public Cone(int x, int y, double radius, double height, double s) {
        this.radius = radius;
        this.height = height;
        this.s = s;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.radius, radius) != 0) return false;
        if (Double.compare(cone.height, height) != 0) return false;
        return Double.compare(cone.s, s) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(s);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calcVolume() {
        return 1/3*Math.PI*(radius*radius)*height;
    }

    @Override
    public double calcSurfaceArea() {
        return Math.PI*(radius*radius)+Math.PI*radius*s;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cone{");
        //sb.append("radius=").append(radius);
        //sb.append("s=").append(s);
        //sb.append("height=").append(height);
        sb.append("volume=").append(calcVolume());
        sb.append(", surfaceArea=").append(calcSurfaceArea());

        sb.append('}');
        return sb.toString();
    }
}
