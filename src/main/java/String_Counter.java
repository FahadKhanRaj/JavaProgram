public class String_Counter{
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        System.out.println(input);

        // Split into words
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        int charCount = 0, vowels = 0, consonants = 0;
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCount++;
                char lowerC = Character.toLowerCase(c);
                if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
                    vowels++;
                } else if (Character.isLetter(c)) {
                    consonants++;
                }
            }
        }

        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowels);
        System.out.println("Consonant: " + consonants);
    }
}
