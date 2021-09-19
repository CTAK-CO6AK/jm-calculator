package me.ctak_co6ak.calculator.operations;

public interface Operation {
	public int calculate(int a, int b);

	public static Operation getOperation(String input) {
		switch (input) {
		case "+":
			return new AddOperation();
		case "-":
			return new SubstractOperation();
		case "*":
			return new MultiplyOperation();
		case "/":
			return new DivideOperation();
		default:
			throw new IllegalArgumentException("Invalid operation: " + input);
		}
	}
}
