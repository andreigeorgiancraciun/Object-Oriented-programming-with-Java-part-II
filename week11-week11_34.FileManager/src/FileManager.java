
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> list = new ArrayList<String>();

        File files = new File(file);
        Scanner reader = new Scanner(files);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            list.add(line);
        }

        reader.close();
        return list;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fileWriter = new FileWriter(file);

        for (String s : texts) {
            fileWriter.write(s + "\n");
        }

        fileWriter.close();
    }
}
