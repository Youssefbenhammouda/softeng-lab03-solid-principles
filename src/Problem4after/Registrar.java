package Problem4after;

import java.util.List;

public class Registrar {
    public void enrollAll(List<Learner> learners, String code) {
        for (Learner l : learners) l.enrollInCourse(code);
    }
}
