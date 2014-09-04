package Model;

/**
 *
 * @author tdornak
 */
public class TriangleCalculator implements CalculatorStrategy {

    @Override
    public String calculateArea(double width, double height) {
        
        double area = (width * height) / 2;
        String areaString = "" + area;
        return areaString;
        
    }
}
