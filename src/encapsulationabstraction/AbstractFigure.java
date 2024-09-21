package abstraction;

public abstract class AbstractFigure {
    public void description(){
        System.out.println("All figures have dimensions.");
    }
    public abstract void sides();
    public abstract void shapeName();
}
