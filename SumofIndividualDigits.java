import java.util.Scanner;

public class SumofIndividualDigits {
    public static int reduceToSingleDigit(int num) {
        String numStr = String.valueOf(num); // Convert the number to a string
        while (numStr.length() > 1) { // Continue until single-digit
            String newNumStr = "";

            for (int i = 0; i < numStr.length() - 1; i++) {
                // Manually convert characters to integers and sum them
                int firstDigit = numStr.charAt(i) - '0'; // Convert character to int
                int secondDigit = numStr.charAt(i + 1) - '0'; // Convert character to int

                int sum = firstDigit - secondDigit; // Sum adjacent digits
                newNumStr += Integer.toString(sum); // Append sum to new string
            }
            numStr = newNumStr; // Update numStr with the summed string
        }

        return numStr.charAt(0) - '0'; // Convert the final character back to an integer
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int result = reduceToSingleDigit(num);
        System.out.println("Final single-digit result: " + result);
    }
}
