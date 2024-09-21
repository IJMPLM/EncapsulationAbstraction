package abstraction;

public class RectangleInterface implements FigureInterface {
    
    public void sides() {
        System.out.println("A rectangle has four sides.");
    }
    
    public void shapeName() {
        System.out.println("The shape is a rectangle.");
    }
}