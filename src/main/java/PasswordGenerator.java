
import java.util.Random;

    public class PasswordGenerator {
        public static String generatePassword() {
            String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String smallLetters = "abcdefghijklmnopqrstuvwxyz";
            String digits = "0123456789";
            String specialChars = "!@#$%^&*";
            String allChars = capitalLetters + smallLetters + digits + specialChars;

            Random random = new Random();
            StringBuilder password = new StringBuilder();

            password.append(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
            password.append(smallLetters.charAt(random.nextInt(smallLetters.length())));
            password.append(digits.charAt(random.nextInt(digits.length())));
            password.append(specialChars.charAt(random.nextInt(specialChars.length())));

            for (int i = 0; i < 4; i++) {
                password.append(allChars.charAt(random.nextInt(allChars.length())));
            }

            char[] passwordArray = password.toString().toCharArray();
            for (int i = passwordArray.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                char temp = passwordArray[i];
                passwordArray[i] = passwordArray[j];
                passwordArray[j] = temp;
            }

            return new String(passwordArray);
        }

        public static void main(String[] args) {
            System.out.println("Generated Password: " + generatePassword());
        }
    }
