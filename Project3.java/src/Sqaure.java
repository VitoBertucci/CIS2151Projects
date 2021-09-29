public class Sqaure extends Shape {
    public double width;
    public double height;

    //constructors
    //one value for width
    public Sqaure(double wdth) {
        width = wdth;
        area = getArea(width);
    }

    //two values for width and height (for use in Rectangle constrctor)
    public Sqaure(double wdth, double hght) {
        width = wdth;
        height = hght;
        area = getArea(width, height);
    }

    //set and get methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double wdth) {
        width = wdth;
    }

    public double getArea() {
        return area;
    }
}
