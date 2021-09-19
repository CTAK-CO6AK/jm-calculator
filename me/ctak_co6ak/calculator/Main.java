package me.ctak_co6ak.calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		String input = scanner.nextLine();
		scanner.close();
		String result = calculator.calculate(input);
		System.out.println(result);
	}

}
