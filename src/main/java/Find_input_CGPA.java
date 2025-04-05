
import java.util.Scanner;
public class Find_input_CGPA {
    public static void main(String[] args) {
        double[] cgpas = {3.30, 3.32, 3.43, 3.48, 3.50, 3.52, 3.60, 3.63, 3.75, 3.86};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a CGPA to search: ");
        double target = scanner.nextDouble();

        int left = 0;
        int right = cgpas.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (cgpas[mid] == target) {
                found = true;
                System.out.println("CGPA " + target + " is present ");
                break;
            } else if (cgpas[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("CGPA " + target + " not in the list.");
        }
    }
}

