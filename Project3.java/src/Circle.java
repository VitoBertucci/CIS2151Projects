public class Circle extends Shape {
    public double circleRadius;

    //constructor gives value to radius and area upon object creation
    public Circle(double radius) {
        circleRadius = radius;
        area = getArea(circleRadius, Math.PI);
    }

    //get and set methods
    public double getRadius() {
        return circleRadius;
    }

    public void setRadius(double rad) {
        circleRadius = rad;
    }
    
    public double getArea() {
        return area;
    }
}
