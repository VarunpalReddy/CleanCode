package ViolatedCode;

public class JuniorTeacher extends Teacher{
    @Override
    public void teachClasses(){System.out.println("Junior Teacher taking classes");}

    @Override
    public void checkStudents() {
        System.out.println("not needed for junior");
    }
}
