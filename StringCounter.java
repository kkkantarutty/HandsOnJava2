
package stringcounter;
import java.util.Scanner;
public class StringCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("write something bro: ");
        String text = scanner.nextLine();

        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int other = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            } else {
                other++;
            }
        }

        System.out.println("yo the letters are: " + letters);
        System.out.println("yo the numbers are: " + numbers);
        System.out.println("yo the spaces are: " + spaces);
        System.out.println("there's also this: " + other);

        scanner.close();
    }
}
    
    

