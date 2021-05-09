package exercise2;

import java.io.*;
import java.util.Scanner;

class Equation {

    double a, b, c, x1, x2;

    private double get_parameter(String parameter) throws IOException {
	Scanner scanner = new Scanner(System.in);

	System.out.printf("Give me %s: ", parameter);
	return Double.parseDouble(scanner.nextLine());
    }

    public void read_data() throws IOException {
	a = get_parameter("a");
	b = get_parameter("b");
	c = get_parameter("c");
    }

    public void process_data() {
	double delta = (b*b) - (4*a*c);
	double delta_sqrt = Math.sqrt(delta);

	int quadratics;
	if ((int) delta < 0) {
	    quadratics = 0;
	} else if ((int) delta == 0) {
	    quadratics = 1;
	} else {
	    quadratics = 2;
	}

	switch (quadratics) {
	case 0:
	    break;
	case 1:
	    x1 = (-b - delta_sqrt) / 2*a;
	    break;
	case 2:
	    x1 = (-b - delta_sqrt) / 2*a;
	    x2 = (-b + delta_sqrt) / 2*a;
	    break;
	}
    }

    public void display_result() {
	if (!Double.isNaN(x1)) {
	    if (!Double.isNaN(x2))
		System.out.printf("Given a=%.2f and b=%.2f and c=%.2f the solutions are (%.2f, %.2f)\n", a, b, c, x1, x2);
	    else
		System.out.printf("Given a=%.2f and b=%.2f and c=%.2f the solution is (%.2f)\n", a, b, c, x1);
	} else {
	    System.out.printf("Delta less than 0, there are no solutions.");
	}
    }
}


public class Main2 {
    public static void main(String[] args) throws IOException {
	Equation equation = new Equation();
	equation.read_data();
	equation.process_data();
	equation.display_result();
    }
}
