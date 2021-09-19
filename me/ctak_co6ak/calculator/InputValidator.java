package me.ctak_co6ak.calculator;

import java.util.regex.Pattern;

public class InputValidator {

	public static boolean isValidRomanNumber(String input)
	{
		Pattern pattern = Pattern.compile("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"); //проверяем число
        return pattern.asPredicate().test(input);
	}
	
	public static boolean isNumberInRange(int number, int min, int max)
	{
		return number >= min && number <=max;
	}

}
