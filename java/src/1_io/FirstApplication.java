import java.util.Scanner;

public class FirstApplication {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Give me 'x': ");
	double x  = Double.parseDouble(scanner.nextLine());

	System.out.println("Give me 'y': ");
	double y  = Double.parseDouble(scanner.nextLine());

	System.out.printf("sum: %.2f\n", (x+y));
	System.out.printf("subtraction: %.2f\n", (x-y));
	System.out.printf("multiplication: %.2f\n", (x*y));
	System.out.printf("quotient: %.2f\n", (x/y));
    }
}
