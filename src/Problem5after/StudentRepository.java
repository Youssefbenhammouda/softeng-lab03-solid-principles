package Problem5after;

import java.io.IOException;

public interface StudentRepository {
    boolean exists(String cne) throws IOException;
    void save(String cne, String name, String email) throws IOException ;
}
