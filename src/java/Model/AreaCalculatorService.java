package Model;

/**
 *
 * @author tdornak
 */
public class AreaCalculatorService {

    private CalculatorStrategy calculator;
    
    public AreaCalculatorService(String name) {
        if (name.equalsIgnoreCase("rectangle")) {
            calculator = new RectangleCalculator();
        } else if (name.equalsIgnoreCase("triangle")) {
            calculator = new TriangleCalculator();
        } else if (name.equalsIgnoreCase("circle")) {
            calculator = new CircleCalculator();
        }
    }
    
    public String calculateArea(double width, double height) {
        return calculator.calculateArea(width, height);
    }
    
}
