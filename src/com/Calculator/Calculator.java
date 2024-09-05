package com.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	void add() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter First Digit");
			int num1 = Sc.nextInt();
			System.out.println("Enter Second Digit");
			int num2 = Sc.nextInt();
			int sum = num1 + num2;
			System.out.println("Addition is : " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	void sub() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter First Digit");
			int num1 = Sc.nextInt();
			System.out.println("Enter Second Digit");
			int num2 = Sc.nextInt();
			int sum = num1 - num2;
			System.out.println("Substraction is : " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	void mul() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter First Digit");
			int num1 = Sc.nextInt();
			System.out.println("Enter Second Digit");
			int num2 = Sc.nextInt();
			int sum = num1 * num2;
			System.out.println("Multipication is : " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	void div() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter First Digit");
			int num1 = Sc.nextInt();
			System.out.println("Enter Second Digit");
			int num2 = Sc.nextInt();
			try {
				int sum = num1 / num2;
				System.out.println("Division is : " + sum);
			} catch (ArithmeticException e) {
				System.out.println("Inflinity");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	void modulo() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter First Digit");
			int num1 = Sc.nextInt();
			System.out.println("Enter Second Digit");
			int num2 = Sc.nextInt();
			int sum = num1 % num2;
			System.out.println("Modulo is : " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	void prime() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Digit");
			int num = Sc.nextInt();
			if (num % 2 == 0) {
				System.out.println("Given Number is Prime Number");
			} else {
				System.out.println("Given Number is Not Prime Number");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	void natural() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Digit");
			int num = Sc.nextInt();
			int i = 1;
			int sum = 0;
			while (i <= num) {
				sum = sum + i;
				i++;
			}
			System.out.println("Natural Number is : " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	void palidrome() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Digit");
			int num = Sc.nextInt();
			int rev = 0;
			int temp = num;
			while (num > 0) {
				int digit = num % 10;
				rev = rev * 10 + digit;
				num = num / 10;
			}
			if (temp == rev) {
				System.out.println("Given Number is Palindrome");
			} else {
				System.out.println("Given Number is Not Palindrome");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	void arms() {
		Scanner Sc = new Scanner(System.in);
		try {
			System.out.println("Enter Digit");
			int num = Sc.nextInt();
			int temp = num;
			int sum = 0;
			int cnt = 0;
			while (temp > 0) {
				cnt++;
				temp /= 10;
			}
			temp = num;
			while (temp > 0) {
				int digit = temp % 10;
				sum += Math.pow(digit, cnt);
				temp /= 10;
			}
			if (sum == num) {
				System.out.println("Given Number is Armstrong");
			} else {
				System.out.println("Given Number is Not Armstrong");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Value");
		}
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		while (true) {
			System.out.println("Enter your choice :");
			System.out.println("Welcome To Calculator \n1.Add\n2.Sub\n3.Mul\n4.Div\n5.Modulo\n6.Prime\n7.Natural\n8.Palindrome\n9.Armstrong\n10.Exit");
			int num = Sc.nextInt();

			switch (num) {
			case 1:
				c1.add();
				break;

			case 2:
				c1.sub();
				break;

			case 3:
				c1.mul();
				break;

			case 4:
				c1.div();
				break;

			case 5:
				c1.modulo();
				break;

			case 6:
				c1.prime();
				break;

			case 7:
				c1.natural();
				break;

			case 8:
				c1.palidrome();
				break;

			case 9:
				c1.arms();
				break;

			case 10:
				System.out.println("Exiting.....");
				System.exit(0);
				break;

			default:
				System.out.println("Invalide Digit");
				break;
			}
		}
	}
}
