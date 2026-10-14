package Problem5after;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        StudentRepository repository = new CsvStudentRepository("students.csv");
        Notifier notifier = new SmsNotifier();
        EnrollmentService service = new EnrollmentService(repository, notifier);

        service.enroll("22885676", "SAFI Amal", "0612345678");
        try {
            service.enroll("22885676", "SAFI Amal", "0612345678");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
