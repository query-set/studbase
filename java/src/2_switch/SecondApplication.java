import java.util.Scanner;

public class SecondApplication {
    static double get_param(String param_name) {
	Scanner scanner = new Scanner(System.in);

	System.out.printf("Give me %s: ", param_name);
	double param  = Double.parseDouble(scanner.nextLine());
	return param;
    }

    public static void main(String[] args) {
	double a = get_param("a");
	double b = get_param("b");
	double c = get_param("c");

	double delta = (b*b) - (4*a*c);

	if ((int) delta < 0) {
	    System.out.println("Delta less than 0, there are no solutions.");
	} else if ((int) delta == 0) {
	    double x = (-b) / 2*a;
	    System.out.printf("Delta is equal to 1, only one solution, x: %.2f\n", x);
	} else {
	    double delta_sqrt = Math.sqrt(delta);
	    double x1 = (-b - delta_sqrt) / 2*a;
	    double x2 = (-b + delta_sqrt) / 2*a;

	    System.out.printf("x1: %.2f\n", x1);
	    System.out.printf("x2: %.2f\n", x2);
	}
    }
}
