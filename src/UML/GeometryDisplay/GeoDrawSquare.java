package UML.GeometryDisplay;

public class GeoDrawSquare {

    private GeoDot p1;
    private GeoDot p2;
    private GeoDot p3;
    private GeoDot p4;

    public GeoDrawSquare(GeoDot p1, GeoDot p2, GeoDot p3, GeoDot p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
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

    public GeoDot getP3() {
        return p3;
    }

    public void setP3(GeoDot p3) {
        this.p3 = p3;
    }

    public GeoDot getP4() {
        return p4;
    }

    public void setP4(GeoDot p4) {
        this.p4 = p4;
    }

    public void callGeometryDisplay() {
        GeometryDisplay showSquare = new GeometryDisplay();
        showSquare.AreaSquare(this);
    }

}
