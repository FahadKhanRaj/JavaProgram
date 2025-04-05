import java.util.Scanner;

public class BabyHeightFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];
        System.out.println("Enter heights of 10 babies (in cm):");
        for (int i = 0; i < 10; i++) {
            heights[i] = scanner.nextInt();
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int height : heights) {
            if (height < min1) {
                min2 = min1;
                min1 = height;
            } else if (height < min2) {
                min2 = height;
            }
        }

        // Handle duplicates or single value
        if (min2 == Integer.MAX_VALUE) {
            min2 = min1;
        }

        System.out.println("Two lowest heights: " + min1 + " cm and " + min2 + " cm");
    }
}