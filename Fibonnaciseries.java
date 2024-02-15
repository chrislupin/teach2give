package teach2give;

public class Fibonnaciseries {

	public static void main(String[] args) {
		
		int n = 100;
		
		int first = 0, second = 1, next;

        System.out.println("Fibonacci sequence up to " + n + ":");
        System.out.print(first + " " + second + " ");

        for (int i = 2; i <= n; ++i) {
            next = first + second;
            if (next > n) {
                break; 
            }
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }


}
