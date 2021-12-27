package RefactoredCode;


public class StudentDetails {

    Student student1;
    public void create(Student s1)
    {
        student1=s1;
    }
    public String getDetails(){
        return student1.getDetails();
    }
}
