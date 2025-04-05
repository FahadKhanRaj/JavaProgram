public class DiscountCalculator {
    public static void main(String[] args) {
        String text = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";

        String[] numbers = text.replaceAll("[^0-9]+", " ").trim().split(" ");
        int laptopPrice = Integer.parseInt(numbers[1]);  // 85000
        int mousePrice = Integer.parseInt(numbers[2]);   // 2500

//        System.out.println(laptopPrice);
//        System.out.println(mousePrice);


        int total = laptopPrice + mousePrice;
        double discount = total * 0.15;
        double finalPrice = total - discount;
        System.out.println("Total cost after 15% discount: " + finalPrice + " tk");
    }
}