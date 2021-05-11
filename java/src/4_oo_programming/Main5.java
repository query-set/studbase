package exercise5;

import java.io.*;
import java.util.Scanner;


interface Thirteen {
    int getThirteenValue();
}


class Employee implements Thirteen {
    String name;
    String surname;
    int salary;

    public Employee() {
	name = "";
	surname = "";
	salary = 0;
    }

    public Employee(String n, String su, int s) {
	name = n;
	surname = su;
	salary = s;
    }

    public int getThirteenValue() {
	return (int)(salary * 1.2);
    }
}

class Boss extends Employee implements Thirteen {
    int bonus;

    public int getThirteenValue() {
	return (int)(salary * 1.5);
    }
}

public class Main5 {
    public static void main(String[] args) {
	Employee e = new Employee("James", "Kowalski", 3000);
	System.out.println("-- Employee");
	System.out.println("Name: \t\t" + e.name);
	System.out.println("Surname: \t" + e.surname);
	System.out.println("Salary: \t" + e.salary);
	System.out.println("Thirteen: \t" + e.getThirteenValue());
	System.out.println();

	Boss b = new Boss();
	System.out.println("-- Empty boss instance");
	System.out.println("Name: \t" + b.name);
	System.out.println("Surname: \t" + b.surname);
	System.out.println("Salary: \t" + b.salary);
	System.out.println("Bonus: \t\t" + b.bonus);
	System.out.println("Thirteen: \t" + b.getThirteenValue());
	System.out.println();

	b.name = "Ted";
	b.surname = "Cohen";
	b.salary = 10000;
	b.bonus = 2000;

	System.out.println("-- Fulfilled boss instance");
	System.out.println("Name: \t\t" + b.name);
	System.out.println("Surname: \t" + b.surname);
	System.out.println("Salary: \t" + b.salary);
	System.out.println("Bonus: \t\t" + b.bonus);
	System.out.println("Thirteen: \t" + b.getThirteenValue());
    }
}
