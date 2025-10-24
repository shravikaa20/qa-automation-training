
public class week4_program2 {

	public static void main(String[] args) {
		int number1 = 0, number2 = 1, number3;
        int count = 10;  

        System.out.print("Fibonacci Series up to " + count + " numbers: \n ");

        System.out.print(number1 + " " + number2); 

        for (int i = 2; i < count; i++) {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }

	}

}
