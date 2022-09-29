import java.io.IOException;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("abc.txt");
        fileWriter.write("Abc");
        fileWriter.write("\n");
        char[] ch = new char[]{'x', 'y', 'z'};
        fileWriter.write(ch);

        fileWriter.flush();
        fileWriter.close();


    }
}
