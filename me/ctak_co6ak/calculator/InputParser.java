package me.ctak_co6ak.calculator;

import me.ctak_co6ak.calculator.ParseResult.NumberType;
import me.ctak_co6ak.calculator.operations.*;

public class InputParser {

	public ParseResult parse(String input) {
		ParseResult result = new ParseResult();

		String[] split = input.split(" ");
		if (split.length != 3)
			throw new IllegalArgumentException("Invalid input syntax. Usage: A [+-*/] B");
		
		NumberType numberType = parseNumberType(split[0]);
		NumberType secondNumberType = parseNumberType(split[2]);
		
		if(numberType != secondNumberType)
			throw new IllegalArgumentException(String.format("Number types does not match: First - %s, second - %s",numberType, secondNumberType));
		
		result.setNumberType(numberType);
		
		result.setA(parseNumber(split[0], numberType));
		result.setOperation(Operation.getOperation(split[1]));
		result.setB(parseNumber(split[2], numberType));

		return result;
	}

	private int parseNumber(String input, NumberType numberType) {
		switch (numberType) {
		case ARABIC:
			return Integer.parseInt(input);
		case ROMAN:
			return RomanNumberConverter.romanToArabic(input);
		default:
			throw new IllegalArgumentException("Number type is not valid: " + numberType.toString());

		}
	}

	private NumberType parseNumberType(String input) {
		return Character.isLetter(input.charAt(0)) ? NumberType.ROMAN : NumberType.ARABIC;
	}
}
