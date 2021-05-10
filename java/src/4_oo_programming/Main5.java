package exercise5;

import java.io.*;
import java.util.Scanner;

class Employee {
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
}

class Boss extends Employee {
    int bonus;
}

public class Main5 {
    public static void main(String[] args) {
	Employee e = new Employee("James", "Kowalski", 3000);
	System.out.println("Name: " + e.name);
	System.out.println("Surname: " + e.surname);
	System.out.println("Salary: " + e.salary);

	Boss b = new Boss();
	System.out.println("Name: " + b.name);
	System.out.println("Surname: " + b.surname);
	System.out.println("Salary: " + b.salary);
	System.out.println("Bonus: " + b.bonus);

	b.name = "Ted";
	b.surname = "Cohen";
	b.salary = 10000;
	b.bonus = 2000;

	System.out.println("Name: " + b.name);
	System.out.println("Surname: " + b.surname);
	System.out.println("Salary: " + b.salary);
	System.out.println("Bonus: " + b.bonus);
    }
}
