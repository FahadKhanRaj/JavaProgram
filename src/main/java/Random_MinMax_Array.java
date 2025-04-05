import java.util.Random;
public class Random_MinMax_Array {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        // Generate random numbers from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // Range: 1-100 (for 0 value)
        }
        System.out.print("Generated Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
    }
}