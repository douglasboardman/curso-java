import java.io.IOException;
import java.util.Scanner;

public class StarPyramidBuilder {
    public static void main(String[] args) throws IOException {
        // Step 1: Declare and initialize Scanner object
        Scanner scanner = new Scanner(System.in);

        // App wellcome statement
        System.out.println("Wellcome to the Star Pyramid Builder");
        System.out.println();

        // Create variable to control app loop
        Boolean run = true;
        
        while (run) {
            // Step 2: Prompt the user to input
            System.out.println("Enter the number of levels");
            int levels = scanner.nextInt();
            
            String s = " ";
            String star = "*";
            String stars;
            int nStars;
            int baseLineWidth = levels * 2 - 1;
            
            for (int i = 1; i <= levels; i++) {
                nStars = i * 2 - 1;
                stars = star.repeat(nStars);
                String gap = s.repeat((baseLineWidth - stars.length()) / 2);
                System.out.println(gap + stars);
            }
            
            System.out.println();
            System.out.println("Would you like to create another pyramid? Y(YES) / N(NO)");

            while (true) {
                char input;
                input = (char) System.in.read();
                System.in.skip(System.in.available());

                if (input == 'y' || input == 'Y') {
                    run = true;
                    break;
                } else if (input == 'n' || input == 'N') {
                    run = false;
                    break;
                }
            }
        }

        scanner.close();
    }
}