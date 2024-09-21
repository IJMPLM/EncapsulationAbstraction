package encapsulationabstraction;
public class Area {
    protected String strShape;
    protected double dblArea;
    Area(String strShape, int intRadius){
        this.strShape = strShape;
        this.dblArea = Math.PI*intRadius*intRadius;
    }
    Area(String strShape, double dblRadius){
        this.strShape = strShape;
        this.dblArea = Math.PI*dblRadius*dblRadius;
    }
    Area(String strShape, int intLength, int intWidth){
        this.strShape = strShape;
        this.dblArea = intLength*intWidth;
    }
    Area(String strShape, double dblLength, int intWidth){
        this.strShape = strShape;
        this.dblArea = dblLength*intWidth;
    }
    Area(String strShape, int intLength, double dblWidth){
        this.strShape = strShape;
        this.dblArea = intLength*dblWidth;
    }
    Area(String strShape, double dblLength, double dblWidth){
        this.strShape = strShape;
        this.dblArea = dblLength*dblWidth;
    }
}
