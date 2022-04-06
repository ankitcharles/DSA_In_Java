import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamingFIles {

    public static void main(String[] args) throws IOException {
       /* try(FileReader fr = new FileReader("C:/sampledata/testfile.txt");

           BufferedReader br = new BufferedReader(fr)) */
            try(Stream st = Files.lines(Paths.get("C:/sampledata/testfile.txt"))){
            st.forEach(System.out::println);
        }
    }
}
