import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern1 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter the size: ");

        // Read in line from standard input
        int size = in.nextInt();
        System.out.println();
        
        // Outer loop to print each of the rows
        for (int i = 1; i <= size; i++) {
            // Inner loop to print each of the columns of a particular row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}