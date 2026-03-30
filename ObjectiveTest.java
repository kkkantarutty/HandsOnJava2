
package objectivetest;
import java.util.Scanner;
public class ObjectiveTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char answer;
        int attempts = 0;
        boolean gotIt = false;

        do {
            attempts++;

            // Enunciado da questão
            System.out.println("IHC/UX question:");
            System.out.println("yo wich one of these defines UX (User Experience) the best?");
            System.out.println("(a) only the visual design of a system");
            System.out.println("(b) the entirety of the user experience interacting with a product");
            System.out.println("(c) only the usability of the softwae");
            System.out.println("(d) only the GUI(grafic interface)");
            System.out.println("(e) only the system's execution speed");

            System.out.print("choose an answer (a, b, c, d, e): ");
            answer = scanner.next().toLowerCase().charAt(0);

            switch (answer) {
                case 'b':
                    System.out.println("yo congrats, right answer, ur a genius(maybe not)!");
                    System.out.println("you got it in the attempt: " + attempts);
                    gotIt = true;
                    break;

                case 'a':
                case 'c':
                case 'd':
                case 'e':
                    System.out.println("danm thats wrong yo.");
                    break;

                default:
                    System.out.println("invalid answer bro.");
                    attempts--; 
            }

            System.out.println();

        } while (!gotIt && attempts < 3);

        if (!gotIt) {
            System.out.println("damn you got it wrong all three times LOL ur so dumb.");
        }

        scanner.close();
    }
}
    
    

