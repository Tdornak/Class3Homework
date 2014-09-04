package Model;

/**
 *
 * @author tdornak
 */
public class CircleCalculator implements CalculatorStrategy {

    @Override
    public String calculateArea(double width, double height) {
        
        double area = Math.PI * (width * width);
        String areaString = "" + area;
        return areaString;
        
    }
}
