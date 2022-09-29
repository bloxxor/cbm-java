package UML.GeometryDisplay;


public class GeometryDisplay {

    public void AreaCircle(GeoDrawCircle c) {
        double areaCircle = 3.14 * c.getRadius() * c.getRadius();
        System.out.println("Fläche des Kreises: " + areaCircle);
    }

    public void AreaSquare(GeoDrawSquare s) {
        double widthSquare = s.getP2().getX() - s.getP1().getX();
        double heightSquare = s.getP3().getY() - s.getP1().getY();
        double areaSquare = widthSquare * heightSquare;
        System.out.println("Rechteckfläche: " + areaSquare + "cm2");
    }

    public void AreaLine(GeoDrawLine l) {
        double width = l.getP1().getX() - l.getP2().getX();
        double height = l.getP1().getY() - l.getP2().getY();
        double widthLine = Math.sqrt(width * width + height + height);
        System.out.println("Länge der Linie: " + widthLine);
    }

}
