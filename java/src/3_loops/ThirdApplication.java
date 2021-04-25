import java.util.Scanner;

public class ThirdApplication {
    static int[] generate_random_array(int len) {
	int[] range_array = new int[len];
	for (int i = 0; i < range_array.length; i++) {
	    int r = (int) (Math.random() * 100);
	    System.out.println(r);
	    range_array[i] = r;
	}
	return range_array;
    }

    public static void main(String[] args) {
	int n = 5, counter = 0;

	int[] numbers = generate_random_array(n);

	int _min = numbers[0];
	int _max = numbers[0];

	while (counter < n) {
	    if (numbers[counter] < _min)
		_min = numbers[counter];
	    if (numbers[counter] > _max)
		_max = numbers[counter];
	    counter++;
	}

	System.out.printf("min number: %d\n", _min);
	System.out.printf("max number: %d\n", _max);
    }
}
