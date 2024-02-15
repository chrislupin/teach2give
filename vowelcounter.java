package teach2give;
import java.util.Scanner;
public class vowelcounter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);

        System.out.println("Number of vowels: " + vowelCount);
        
        scanner.close();
    }
	static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;

	}

}
