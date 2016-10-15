/**
 * Created by chawki on 14/10/16.
 */
public class Segment {
/**
 * Created by Bengueddach on 16/10/16.
 */
    private Point point1 = new Point();
    private Point point2 = new Point();

    //constructeur pour un segment OM avec O(0,0) et M(x,y)
    Segment(Point point) {

        this.point2 = point;
    }

    //constructeur pour un segment AB avec A(xa,ya) et B(xb,yb)
    Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;

    }


    public double distance() {
        return Math.sqrt(Math.pow(point2.getAbscisse() - point1.getAbscisse(), 2) + Math.pow(point2.getOrdonnee() - point1.getOrdonnee(), 2));
    }

    public String symetrie(Segment segment) {
        Segment image = segment;
        image.point1.symetrie(point1);
        image.point2.symetrie(point2);
        return image.point1.toString() + image.point2.toString();
    }

    @Override
    public String toString() {
        return point1.toString()+point2.toString();
    }
}
