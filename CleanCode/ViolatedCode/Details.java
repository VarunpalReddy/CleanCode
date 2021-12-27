package ViolatedCode;


public class Details implements Student {
    //Violates Open - Closed Principle

    public String getDescription(Student student){
        if(student instanceof ScienceStudent){
            return "Science";
        }
        return "Math";
    }

    @Override
    public int getFees() {
        return 0;
    }

    @Override
    public String getCourse() {
        return "";
    }

    @Override
    public String getDetails() {
        return "Studying";
    }

    @Override
    public void setCourse(String course) {}
}
