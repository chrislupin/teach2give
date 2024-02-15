package teach2give;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        boolean result = isPowerOfTwo(number);

	        System.out.println(number + " =>: " + result);
	        
	        scanner.close();
	        
	    }

	    static boolean isPowerOfTwo(int n) {
	        if (n <= 0) {
	            return false;
	        }
	        return (n & (n - 1)) == 0;
	        
	     
	    }

	}

