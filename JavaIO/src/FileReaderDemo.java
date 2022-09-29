import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("abc.txt");
//        //read()
//        int i = fileReader.read();
//        while(i != -1){
//            System.out.println((char)i);
//            i = fileReader.read();
//        }
//
//        //read(char[]array)
//        char[] c = new char[100];
//        fileReader.read(c);
//        System.out.println(c);

        //read(char[]array,int offset, int length)
        char[] c = new char[100];
        fileReader.read(c,3,3);
        System.out.println(c);

        for(char i : c){
            System.out.println("Char : " +i);
        }
        fileReader.close();
    }
}
