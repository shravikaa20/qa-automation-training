import java.util.Scanner;

public class week3_program2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

        System.out.print("Enter Principal Amount (p): ");
        double p = read.nextDouble();

        System.out.print("Enter Rate of Interest per annum (r): ");
        double r = read.nextDouble();

        System.out.print("Enter Time in years (t): ");
        double t = read.nextDouble();

        // Calculating simple interest
        double simpleInterest = (p * r * t) / 100;

        // Display result
        System.out.println("Simple Interest = " + simpleInterest);

        read.close();

	}

}
