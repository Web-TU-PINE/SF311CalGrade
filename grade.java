package test;

import java.util.Scanner;

/*
 Recieve 3 input for calcualte grade
 */
public class grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a point midterm
		int a = 0;
		// b point finalterm
		int b = 0;
		// c point class room
		int c = 0;
		int sum = 0;
		System.out.print("Enter your point midterm: ");
		a = sc.nextInt();
		while (a < 0 || 20 < a) {
			System.out.print("Enter your point midterm: ");
			a = sc.nextInt();
		}
		System.out.print("Enter your point finalterm: ");
		b = sc.nextInt();
		while (b < 0 || 20 < b) {
			System.out.print("Enter your point finalterm: ");
			b = sc.nextInt();
		}
		System.out.print("Enter your point class room: ");
		c = sc.nextInt();
		while (c < 0 || 60 < c) {
			System.out.print("Enter your point class room: ");
			c = sc.nextInt();
		}
		sum = a + b + c;
		// System.out.print(a+b+c);
		if (80 <= sum && sum <= 100)
			System.out.println("A");
		else if (75 <= sum && sum <= 79)
			System.out.println("B+");
		else if (70 <= sum && sum <= 74)
			System.out.println("B");
		else if (65 <= sum && sum <= 69)
			System.out.println("C+");
		else if (60 <= sum && sum <= 64)
			System.out.println("C");
		else if (55 <= sum && sum <= 59)
			System.out.println("D+");
		else if (50 <= sum && sum <= 54)
			System.out.println("D");
		else
			System.out.println("F");

	}
}
