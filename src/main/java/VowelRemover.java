
public class VowelRemover {
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String result = removeVowels(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}