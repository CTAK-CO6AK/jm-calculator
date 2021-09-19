package me.ctak_co6ak.calculator;

import me.ctak_co6ak.calculator.ParseResult.NumberType;

public class Calculator {

	private InputParser parser = new InputParser();
	
	public String calculate(String input)
	{
		ParseResult parseResult = parser.parse(input);
		int firstNumber = parseResult.getA();
		int secondNumber = parseResult.getB();
		if(!InputValidator.isNumberInRange(firstNumber, 1, 10))
		{
			throw new IllegalArgumentException("First number is not in the range [1-10]: " + firstNumber);
		}
		if(!InputValidator.isNumberInRange(secondNumber, 1, 10))
		{
			throw new IllegalArgumentException("Second number is not in the range [1-10]: " + secondNumber);
		}
		int result = parseResult.getOperation().calculate(firstNumber, secondNumber);
		if(parseResult.getNumberType() == NumberType.ROMAN)
			return RomanNumberConverter.arabicToRoman(result);
		else
			return String.valueOf(result);
	}

}
