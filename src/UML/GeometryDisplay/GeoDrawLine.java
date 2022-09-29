package UML.GeometryDisplay;

public class GeoDrawLine {

    private GeoDot p1;
    private GeoDot p2;

    public GeoDrawLine(GeoDot p1, GeoDot p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public GeoDot getP1() {
        return p1;
    }

    public void setP1(GeoDot p1) {
        this.p1 = p1;
    }

    public GeoDot getP2() {
        return p2;
    }

    public void setP2(GeoDot p2) {
        this.p2 = p2;
    }

    public void callGeometryDisplay() {
        GeometryDisplay showLine = new GeometryDisplay();
        showLine.AreaLine(this);
    }

}
