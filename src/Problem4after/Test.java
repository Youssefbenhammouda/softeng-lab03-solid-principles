package Problem4after;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("SAFI Amal");
        Professor professor = new Professor("Prof. KALLOUBI");
        TeachingAssistant ta = new TeachingAssistant("ALAMI Samir");

        Registrar registrar = new Registrar();
        ExamBoard examBoard = new ExamBoard();

        registrar.enrollAll(List.of(student, ta), "SE101");
        examBoard.collectGrades(List.of(professor, ta), "SE101");
    }
}
