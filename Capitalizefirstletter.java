package teach2give;

import java.util.Scanner;

public class Capitalizefirstletter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String output = capitalizeFirstLetter(inputString);

        System.out.println("Result: " + output);
        
        scanner.close();
    }

    static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder output = new StringBuilder();

        for (String word : input.split("\\s")) {
            if (!word.isEmpty()) {
                output.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
            }
        }

        return output.toString();

	}

}
