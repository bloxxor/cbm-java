package UML.GeometryDisplay;

public class Launcher {

    public static void main(String[] args) {

        GeoDot linep1 = new GeoDot(7,2);
        GeoDot linep2 = new GeoDot(12,5);

        GeoDrawLine line1 = new GeoDrawLine(linep1,linep2);
        line1.callGeometryDisplay();

        // ----------------------

        GeoDot squarep1 = new GeoDot(3,4);
        GeoDot squarep2 = new GeoDot(6,4);
        GeoDot squarep3 = new GeoDot(3,6);
        GeoDot squarep4 = new GeoDot(6,6);

        GeoDrawSquare square1 = new GeoDrawSquare(squarep1,squarep2,squarep3,squarep4);
        square1.callGeometryDisplay();

        // ----------------------

        GeoDot circlep1 = new GeoDot(7,9);
        GeoDrawCircle radius = new GeoDrawCircle(circlep1, 8);
        radius.callGeometryDisplay();


    }

}
