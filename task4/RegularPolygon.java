/*
UML Diagram for RegularPolygon:

-------------------------------
|        RegularPolygon        |
-------------------------------
| - n: int                     |
| - side: double               |
| - x: double                  |
| - y: double                  |
-------------------------------
| + RegularPolygon()           |
| + RegularPolygon(n: int, side: double) |
| + RegularPolygon(n: int, side: double, x: double, y: double) |
| + getN(): int                |
| + setN(n: int): void         |
| + getSide(): double          |
| + setSide(side: double): void|
| + getX(): double             |
| + setX(x: double): void      |
| + getY(): double             |
| + setY(y: double): void      |
| + getPerimeter(): double     |
| + getArea(): double          |
-------------------------------
*/

public class RegularPolygon {
    // Private data fields
    private int n;          // Number of sides
    private double side;    // Length of each side
    private double x;       // x-coordinate of center
    private double y;       // y-coordinate of center

    // No-arg constructor
    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    // Constructor with number of sides and side length
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    // Constructor with all parameters
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor and mutator methods
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to compute perimeter
    public double getPerimeter() {
        return n * side;
    }

    // Method to compute area
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}

