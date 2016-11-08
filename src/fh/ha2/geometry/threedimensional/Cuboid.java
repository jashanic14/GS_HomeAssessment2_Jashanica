package fh.ha2.geometry.threedimensional;

/**
 * Created by Acer on 08.11.2016.
 */
public class Cuboid extends ThreeDim {

    private double sideA;
    private double sideB;
    private double sideC;

    public Cuboid(int x, int y, double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.x=x;
        this.y=y;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cuboid cuboid = (Cuboid) o;

        if (Double.compare(cuboid.sideA, sideA) != 0) return false;
        if (Double.compare(cuboid.sideB, sideB) != 0) return false;
        return Double.compare(cuboid.sideC, sideC) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calcVolume() {
        return sideA*sideB*sideC;
    }

    @Override
    public double calcSurfaceArea() {
        return 2*(sideA*sideB)+2*(sideA*sideC)+2*(sideB*sideC);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuboid{");
        //sb.append("sideA=").append(sideA);
        //sb.append("sideB=").append(sideB);
        //sb.append("sideC=").append(sideC);
        sb.append("volume=").append(calcVolume());
        sb.append(", surfaceArea=").append(calcSurfaceArea());

        sb.append('}');
        return sb.toString();
    }
}
