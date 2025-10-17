import java.util.Scanner;

public class week3_program3 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = read.nextInt();

        System.out.print("Enter b: ");
        int b = read.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        read.close();

	}

}
