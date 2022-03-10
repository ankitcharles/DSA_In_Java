import java.util.Objects;

public class main {

    enum Letter {
        A,
        B,
        C;
    }
    static int million = 3_000_000;
    // function to print
    static void printFunc(Object... objects){
        for (Object o : objects){
            System.out.println(o + " ");
        }

    }

    public static void main(String[] args) {
        //int million = 3_000_000;
        printFunc(Letter.A,Letter.B,Letter.C);
        System.out.println("\n");
        printFunc(1,2,3);
        System.out.println(main.million);
    }

}
