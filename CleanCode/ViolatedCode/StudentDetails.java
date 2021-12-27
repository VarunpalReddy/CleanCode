package ViolatedCode;

public class StudentDetails {
    MathStudent student1;
    public void create(MathStudent s1)
    {
        student1=s1;
    }
    public String getDetails(){
        return student1.getDetails();
    }
}
