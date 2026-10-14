package Problem5after;


import java.io.IOException;

public class EnrollmentService {
    private  StudentRepository store ;
    private  Notifier sender;
    public EnrollmentService(StudentRepository store, Notifier sender){
        this.store = store;
        this.sender = sender;
    }
    public void enroll(String cne, String name, String email) throws IOException {
        if (cne == null || cne.isBlank())
            throw new IllegalArgumentException("CNE is required");
        if (store.exists(cne))
            throw new IllegalStateException("Already enrolled: " + cne);
        store.save(cne, name, email);
        sender.notify(email, "Welcome " + name + ", you are enrolled.");
    }
}
