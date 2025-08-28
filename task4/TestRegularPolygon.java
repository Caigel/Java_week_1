public class TestRegularPolygon {
    public static void main(String[] args) {
        // Create polygons
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display perimeter and area for each polygon
        System.out.println("Polygon 1 (default):");
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon1.getArea());
        System.out.println();

        System.out.println("Polygon 2 (6 sides, side 4):");
        System.out.println("Perimeter: " + polygon2.getPerimeter());
        System.out.println("Area: " + polygon2.getArea());
        System.out.println();

        System.out.println("Polygon 3 (10 sides, side 4, center at 5.6, 7.8):");
        System.out.println("Perimeter: " + polygon3.getPerimeter());
        System.out.println("Area: " + polygon3.getArea());
    }
}
