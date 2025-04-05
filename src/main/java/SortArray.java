public class SortArray {
        public static void main(String[] args) {
            double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

            // Using Bubble Sort algoritgm, all are in Descending Order
            for (int i = 0; i < cgpas.length - 1; i++) {
                for (int j = 0; j < cgpas.length - i - 1; j++) {
                    if (cgpas[j] < cgpas[j + 1]) {
                        // swap
                        double temp = cgpas[j];
                        cgpas[j] = cgpas[j + 1];
                        cgpas[j + 1] = temp;
                    }
                }
            }

            System.out.println("Sorted CGPAs (Highest to Lowest):");
            for (double cgpa : cgpas) {
                System.out.print(cgpa + " ");
            }
        }
    }
