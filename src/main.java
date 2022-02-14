public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        System.out.println(point2D);
        for (float i : point2D.getXY()) {
            System.out.println(i);
        }

        System.out.println(point3D);
        for (float i : point3D.getXYZ()) {
            System.out.println(i);
        }
    }
}
