package me.ctak_co6ak.calculator;

import me.ctak_co6ak.calculator.operations.Operation;

public class ParseResult {
	public enum NumberType {
		ARABIC,
		ROMAN
	};
	
	private NumberType numberType;
	private Operation operation;
	private int a, b;
	
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public void setNumberType(NumberType numberType) {
		this.numberType = numberType;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setA(int a) {
		this.a = a;
	}
	public Operation getOperation() {
		return operation;
	}
	public NumberType getNumberType() {
		return numberType;
	}
	public int getB() {
		return b;
	}
	public int getA() {
		return a;
	}
}
