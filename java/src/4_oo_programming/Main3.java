package exercise3;

import java.io.*;
import java.util.Scanner;

class Sort {
    public ArrayList<int> read_data(ArrayList<int> numbers, int len) throws IOException {
	Scanner scanner = new Scanner(System.in);

	for (int i = 0; i < len; i++) {
	    System.out.printf("Number %d.: ", (i+1));
	    int num = Int.parseInt(scanner.nextLine());
	    numbers.add(num);
	}
	return numbers;
    }

    public ArrayList<int> process_data(ArrayList<int> numbers, int len) {
	int i, j, tmp;
	for (i = 1; i <= len-1; i++) {
	    for (j = len-1; j >= i; --j) {
		if (numbers[j-1] > numbers[j]) {
		    tmp = numbers[j-1];
		    numbers[j-1] = numbers[j];
		    numbers[j] = tmp;
		}
	    }
	}
	return numbers;
    }

    public void display_result(ArrayList<int> numbers, int len) {
	System.out.println("\nResult after sorting:");
	for (int i = 0; i < len; i++) {
	    System.out.printf("%d, ", numbers[i]);
	}
    }
}


public class Main2 {
    public static void main(String[] args) throws IOException {
	// length of array
	int len = 6;

	// One can use Array<>, but ArrayList is easier to being extended
	ArrayList<int> numbers = new ArrayList<int>();

	Sort sort = new Sort();
	numbers = sort.read_data(numbers, len);
	numbers = sort.process_data(numbers, len);
	sort.display_result(numbers, len);
    }
}
