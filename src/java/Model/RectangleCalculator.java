package Model;

/**
 *
 * @author tdornak
 */
public class RectangleCalculator implements CalculatorStrategy {

    @Override
    public String calculateArea(double width, double height) {
        
        double area = width * height;
        String areaString = "" + area;
        return areaString;
        
    }
}
