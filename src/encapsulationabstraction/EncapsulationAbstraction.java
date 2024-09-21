package encapsulationabstraction;
public class EncapsulationAbstraction {
    public static void main(String[] args) {
        //Encapsulation
        StudentGrade clSG = new StudentGrade();
        clSG.setStrStudentNo("2023-34007");
        clSG.setStrLastName("Iwag");
        clSG.setStrFirstName("John Michael");
        clSG.setStrEmailAddress("jmmiwag2023@plm.edu.ph");
        clSG.setStrCellPhoneNo("0929 838 0044");
        clSG.setStrSubjectCode("CSC 0101");
        clSG.setIntCourseGrade(100);
        
        System.out.println("Student No: "+clSG.getStrStudentNo());
        System.out.println("Last Name: "+clSG.getStrLastName());
        System.out.println("First Name: "+clSG.getStrFirstName());
        System.out.println("Email Address: "+clSG.getStrEmailAddress());
        System.out.println("Cellphone No: " + clSG.getStrCellPhoneNo());
        System.out.println("Subject Code: "+clSG.getStrSubjectCode());
        System.out.println("Course Grade: "+clSG.getIntCourseGrade());
        System.out.println();
    
        //Constructors
        Area clAreaCircle1 = new Area("Circle",10);
        Area clAreaCircle2 = new Area("Circle",10.0);
        Area clAreaRectangle1 = new Area("Rectangle",10,10);
        Area clAreaRectangle2 = new Area("Rectangle",10.0,10);
        Area clAreaRectangle3 = new Area("Rectangle",10,10.0);
        Area clAreaRectangle4 = new Area("Rectangle",10.0,10.0);
        
        System.out.println("Area of "+clAreaCircle1.strShape+": "+String.format("%.2f", clAreaCircle1.dblArea));
        System.out.println("Area of "+clAreaCircle2.strShape+": "+String.format("%.2f", clAreaCircle2.dblArea));
        System.out.println("Area of "+clAreaRectangle1.strShape+": "+clAreaRectangle1.dblArea);
        System.out.println("Area of "+clAreaRectangle2.strShape+": "+clAreaRectangle2.dblArea);
        System.out.println("Area of "+clAreaRectangle3.strShape+": "+clAreaRectangle3.dblArea);
        System.out.println("Area of "+clAreaRectangle4.strShape+": "+clAreaRectangle4.dblArea);
        
        //Abstract and Interface
    }
}
