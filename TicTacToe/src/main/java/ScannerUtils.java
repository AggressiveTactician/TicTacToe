import java.util.Scanner;

public class ScannerUtils {
    public static final Scanner scanner = new Scanner(System.in);

    public static int getFromScanner(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }
}