package exercise3;

import java.io.*;
import java.util.Scanner;

class Sort {
    public int[] read_data(int[] numbers, int len) throws IOException {
	Scanner scanner = new Scanner(System.in);

	for (int i = 0; i < len; i++) {
	    System.out.printf("n %d: ", (i+1));
	    int num = Integer.parseInt(scanner.nextLine());
	    numbers[i] = num;
	}
	return numbers;
    }

    public int[] process_data(int[] numbers, int len) {
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

    public void display_result(int[] numbers, int len) {
	System.out.println("\nResult after sorting:");
	for (int i = 0; i < len; i++) {
	    if (i+1 == len)
		System.out.printf("%d\n", numbers[i]);
	    else
		System.out.printf("%d, ", numbers[i]);
	}
	System.out.println();
    }
}


public class Main3 {
    public static void main(String[] args) throws IOException {
	int len = 6;
	int[] numbers = new int[len];

	Sort sort = new Sort();
	numbers = sort.read_data(numbers, len);
	numbers = sort.process_data(numbers, len);
	sort.display_result(numbers, len);
    }
}
