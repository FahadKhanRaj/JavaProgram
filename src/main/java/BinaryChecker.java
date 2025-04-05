import java.util.Scanner;
public class BinaryChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isBinary = true;
        for (char c : input.toCharArray()) {
            if (c != '0' && c != '1') {
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary);
    }
}

