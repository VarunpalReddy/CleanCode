package ViolatedCode;

public interface Student {
    //Interface segregation Violation
    public String getDetails();
    public int getFees();
    public void setCourse(String course);
    public String getCourse();
}
