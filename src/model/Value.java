package model;

public class Value {
	int number;

	public Value(int num) {
		this.number = num;
	}

	public int getNumber(Value v) {
		return v.number;
	}

	public Value setValue(int n) {
		number = n;
		return this;
	}

}
