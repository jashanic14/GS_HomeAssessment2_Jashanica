package fh.ha2.geometry;

import fh.ha2.geometry.threedimensional.Cone;
import fh.ha2.geometry.threedimensional.Cuboid;
import fh.ha2.geometry.threedimensional.Pyramid;
import fh.ha2.geometry.threedimensional.ThreeDim;
import fh.ha2.geometry.twodimensional.Hexagon;
import fh.ha2.geometry.twodimensional.Rhombus;
import fh.ha2.geometry.twodimensional.Square;
import fh.ha2.geometry.twodimensional.TwoDim;

import java.util.*;


/**
 * Created by Acer on 08.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.doIt();
    }

    private void doIt() {
        List<TwoDim> twoDimList = new ArrayList<>();
        List<ThreeDim> threeDimList = new ArrayList<>();

        fillList2D(twoDimList);
        fillList3D(threeDimList);

    }

    public void fillList2D(List<TwoDim> twoDimList) {
        //TODO: Implement

        Hexagon h1 = new Hexagon(1,5,12.0);
        Rhombus r1 = new Rhombus(1,5,4.0,12.0);
        Square s1 = new Square(1,5,7.0);

        twoDimList.add(h1);
        twoDimList.add(r1);
        twoDimList.add(s1);

        double sumOfArea = 0;
        double sumOfPerimeter = 0;

        for (TwoDim areaList: twoDimList){
            sumOfArea+=areaList.calcArea();
        }

        for (TwoDim perimeterList: twoDimList){
            sumOfPerimeter+=perimeterList.calcPerimeter();
        }

        System.out.println("Sum of the AREA of all two dimensional shapes:\n" + sumOfArea);
        System.out.println("\nSum of the PERIMETER of all two dimensional shapes:\n" + sumOfPerimeter);

        System.out.println("---------------------------------------------");

    }

    public void fillList3D(List<ThreeDim> threeDimList) {
        //TODO: Implement
        Cone cone1 = new Cone(2,8,14.0,2.0,5.0);
        Cuboid cuboid1 = new Cuboid(2,8,12.0,12.0,8.0);
        Pyramid pyramid1 = new Pyramid(2,8,32.0,17.0);

        threeDimList.add(cone1);
        threeDimList.add(cuboid1);
        threeDimList.add(pyramid1);

        double sumOfVolume = 0;
        double sumOfSurfaceArea = 0;

        for (ThreeDim volumeList: threeDimList){
            sumOfVolume+=volumeList.calcVolume();
        }

        for (ThreeDim surfaceOfAreaList: threeDimList){
            sumOfSurfaceArea+=surfaceOfAreaList.calcSurfaceArea();
        }

        System.out.println("Sum of the VOLUME of all three dimensional shapes:\n" + sumOfVolume);
        System.out.println("\nSum of the SURFACE OF AREA of all three dimensional shapes:\n" + sumOfSurfaceArea);

        System.out.println("---------------------------------------------");

    }

}
