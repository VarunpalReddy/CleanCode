package ViolatedCode;

abstract class Teacher implements TeacherActions {
    public void teachClasses(){
        System.out.println("Teacher taking classes");
    }
    @Override
    public void checkStudents(){ System.out.println("checking classes"); }
}
