package RefactoredCode;


public class Main {
    public static void main(String args[])
    {
        // Liskov Principle
        TeachClasses teacher=new Teacher();
        teacher.teachClasses();
        TeachClasses juniorteacher =new JuniorTeacher();
        juniorteacher.teachClasses();


        StudentDetails studentdetails=new StudentDetails();        // Dependency principle
        studentdetails.create(new MathStudent());
        System.out.println(studentdetails.getDetails());
        studentdetails.create(new ScienceStudent());
        System.out.println(studentdetails.getDetails());
    }
}
