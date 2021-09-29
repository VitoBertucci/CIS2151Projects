public abstract class Shape {
    public double area = 0.0;

    //get area methods

    //two values (uses in circle and rectangle)
    public double getArea (double fVal, double sVal) {
        area = fVal * sVal;
        return area;
    }

    //one value (use in sqaure)
    public double getArea (double val) {
        area = val * val;
        return area;
    }
}
