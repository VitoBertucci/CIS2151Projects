public class Rectangle extends Sqaure {
    public double width;
    public double height;

    //constructor
    public Rectangle(double wdth, double hght) {
        super(wdth, hght);
    }

    //set and get methods
    public double getHeight () {
        return height;
    }
    
    public void setHeight(double hght) {
        height = hght;
    }

    public double getArea() {
        return area;
    }
}
