package ViolatedCode;

public class MathStudent implements Student {
    private String course;
    @Override
    public void setCourse(String course)
    {
        this.course = course;
    }
    @Override
    public String getCourse()
    {
        return course;
    }
    @Override
    public String getDetails()
    {
        return "studying Math";
    }

    @Override
    public int getFees() {
        return 30000;
    }
}
