import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern2 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter the size: ");

        // Read in line from standard input
        int size = in.nextInt();
        System.out.println();
        
        if (size < 1) {
            System.out.println("too small!");
        } else if (size > 5) {
            System.out.println("too big!");
        } else {
            for (int i = 1; i <= size; i++) {
                for (int j = i; j < (size + i); j++) {
                    System.out.print(j);
                }
                for (int j = size + i - 1; j >= i; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
            for (int i = size; i >= 1; i--) {
                for (int j = i; j < (size + i); j++) {
                    System.out.print(j);
                }
                for (int j = size + i - 1; j >= i; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}