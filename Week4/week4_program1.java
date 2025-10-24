import java.util.Scanner;

public class week4_program1 {

	public static void main(String[] args) {
		
		        Scanner number = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        int n = number.nextInt();
		        int count = 0;

		        // Checking how many numbers divide n
		        
		        for (int i = 1; i <= n; i++) {
		            if (n % i == 0) {
		                count++;
		            }
		        }

		        // A prime number can only be divided by 1 and itself
		        
		        if (count == 2) {
		            System.out.println(n + " is a prime number.");
		        } else {
		            System.out.println(n + " is not a prime number.");
		        }

		        number.close();
		    }
		
	}
