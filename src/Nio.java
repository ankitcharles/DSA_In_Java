import java.io.IOException;
import java.util.stream.Collectors.*;

import java.util.stream.*;

import java.nio.file.*;

public class Nio {
    public static void main(String[] args) throws IOException {

        System.out.println("\n ----> first 5 java file names:");
        Files.list(Paths.get("."))
                .map(Path::getFileName)
                .map(Path::toString)
                .filter(name -> name.endsWith(".java"))
                .sorted()
                .limit(5)
                .forEach(System.out::println);

    }
}
