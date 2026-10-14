package Problem4after;

import java.util.List;

public class ExamBoard {
    public void collectGrades(List<Teacher> teachers, String code) {
        for (Teacher t : teachers) t.gradeExam(code);
    }
}
