package week1.day2;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public double mul(double a, double b) {
		return a * b;
	}
	public int div(int a, int b) {
		int divide = a / b;
		return divide;
	}
	public static void main(String[] args) {
		Calculator Value = new Calculator();
		System.out.println(Value.add(1, 5));
		System.out.println(Value.sub(100, 20));
		System.out.println(Value.mul(5.2, 2.5));
		System.out.println(Value.div(10, 10));

	}
}
