package Problem4before;

public class Professor implements UniversityMember{
    private final String name;
    public Professor(String name) { this.name = name; }
    @Override
    public void enrollInCourse(String code) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void payTuition(double amount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void teach(String code) {
        System.out.println(name + " teaches " + code);
    }

    @Override
    public void gradeExam(String code) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void publishPaper(String title) {
        throw new UnsupportedOperationException();
    }
}
