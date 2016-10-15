/**
 * Created by chawki on 15/10/16.
 */
public class Main {

    public static void main(String[] args) {


        Point A = new Point();
        Point B = new Point(5);
        Point C = new Point(3, 8);

        Segment AB = new Segment(A, B);
        Segment BC = new Segment(B, C);


        System.out.println("A"+A.toString());
        System.out.println("B"+B.toString());
        System.out.println("C"+C.toString());


        System.out.println("AB=" + AB.distance());
        System.out.println("BC=" + BC.distance());


        System.out.println("image de BC" + BC.toString() + "est CB" + BC.symetrie(BC));


    }
}
