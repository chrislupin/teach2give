package teach2give;
import java.util.Scanner;

public class Reversedigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();
        
        int reverseddigits = reverseDigits(inputNumber);

        System.out.println("Reversed digit: " + reverseddigits);
	
	    scanner.close();
	
	
	}
	static int reverseDigits(int num) 
    { 
        int rev_num = 0; 
        while (num > 0) { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev_num; 
    } 
		
	 
}
