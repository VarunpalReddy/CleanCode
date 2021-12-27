package ViolatedCode;


public class Main {
    public static void main(String args[])
    {
        Teacher teacher=new JuniorTeacher();
        teacher.teachClasses();   // Liskov Principle Violation
        teacher.checkStudents();

        StudentDetails studentdetails=new StudentDetails();        // Dependency principle violation
        studentdetails.create(new MathStudent());
        System.out.println(studentdetails.getDetails());
    }
}
