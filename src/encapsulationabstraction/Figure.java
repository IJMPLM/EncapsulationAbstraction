package abstraction;

public class Figure {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        RectangleInterface rectIf = new RectangleInterface();
        Octagon oct = new Octagon();
        OctagonInterface octIf = new OctagonInterface();
        
        rect.description();
        
        rect.shapeName();
        rect.sides();
        rectIf.shapeName();
        rectIf.sides();
        System.out.println("");
        
        oct.description();
        oct.shapeName();
        oct.sides();
        octIf.shapeName();
        octIf.sides();
    }

    
    
}

/*
3. A. Create an abstract and interface class for a class named Figure. 

    a. common method- public void description() { 
                          System.out.println("All figures have dimensions."); 
                       }         
    b. different methods implementation- sides(); shapename();
       
   B. implement each abstract and interface by at least 2 figures, e.g. Circle, Triangle, Hexagon, Pentagon, etc
*/