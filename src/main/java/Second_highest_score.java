public class Second_highest_score {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double highest = Double.MIN_VALUE;
        double secondHighest = Double.MIN_VALUE;

        for (double i : cgpas) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest && i != highest) {
                secondHighest = i;
            }
        }

        System.out.println("The second highest CGPA: " + secondHighest);

    }
}
