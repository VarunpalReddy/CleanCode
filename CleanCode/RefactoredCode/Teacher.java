package RefactoredCode;

public class Teacher implements TeachClasses,CheckStudents {
    @Override
    public void teachClasses(){
        System.out.println("Teacher taking classes");
    }
    @Override
    public void checkStudents(){ System.out.println("checking classes"); }

}
