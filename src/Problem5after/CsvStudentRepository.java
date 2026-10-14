package Problem5after;

import java.io.*;

public class CsvStudentRepository implements StudentRepository {
    private File file;

    public CsvStudentRepository(String filePath) throws IOException {

        this.file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public boolean exists(String cne) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader(file));


        try {

            String line;
            while ((line = br.readLine()) != null) {
                int del = line.indexOf(',');
                if (del < 0) throw new RuntimeException("Invalid csv format in file " + file.getAbsolutePath());
                if (line.substring(0, del).equals(cne)) return true;
            }
        } finally {

            br.close();

        }
        return false;

    }

    @Override
    public void save(String cne, String name, String email) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        try {
            bw.write(cne+","+name+","+email);
            bw.newLine();
        }finally {
            bw.close();
        }


    }
}
