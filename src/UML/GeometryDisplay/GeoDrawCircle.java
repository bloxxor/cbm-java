package UML.GeometryDisplay;

public class GeoDrawCircle {

    private GeoDot p1;
    private double radius;

    public GeoDrawCircle(GeoDot p1, double radius) {
        this.p1 = p1;
        this.radius = radius;
    }

    public GeoDot getP1() {
        return p1;
    }

    public void setP1(GeoDot p1) {
        this.p1 = p1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void callGeometryDisplay() {
        GeometryDisplay showCircle = new GeometryDisplay();
        showCircle.AreaCircle(this);
    }

}
