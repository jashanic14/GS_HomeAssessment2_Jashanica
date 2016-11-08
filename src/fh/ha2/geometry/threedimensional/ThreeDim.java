package fh.ha2.geometry.threedimensional;

import fh.ha2.geometry.GeometricShapes;

/**
 * Created by Acer on 08.11.2016.
 */
public abstract class ThreeDim extends GeometricShapes{

    protected  int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public abstract double calcVolume();
    public abstract double calcSurfaceArea();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ThreeDim threeDim = (ThreeDim) o;

        return z == threeDim.z;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + z;
        return result;
    }
}
