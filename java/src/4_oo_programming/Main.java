package exercise;

import java.io.*;
import java.util.Scanner;

class Rectangle {

    double x, y, area;

    public void read_data() throws IOException {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Give me 'x': ");
	x = Double.parseDouble(scanner.nextLine());

	System.out.println("Give me 'y': ");
	y = Double.parseDouble(scanner.nextLine());
    }

    public void process_data() {
	area = x * y;
    }

    public void display_result() {
	System.out.printf("Given x=%.2f and y=%.2f, the area is %.2f\n", x, y, area);
    }

    public static void main(String[] args) throws IOException {
	Rectangle rectangle = new Rectangle();
	rectangle.read_data();
	rectangle.process_data();
	rectangle.display_result();
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
	Rectangle rectangle = new Rectangle();
	rectangle.read_data();
	rectangle.process_data();
	rectangle.display_result();
    }
}
