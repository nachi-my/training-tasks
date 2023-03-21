package week5;

public class ThrowThrows {
    void division(int num1, int num2) throws ArithmeticException {
		if (num2 == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println("Result of division = " + (num1 / num2));
		}
	}


	public static void main(String[] args) throws ArithmeticException {
		ThrowThrows obj = new ThrowThrows();
		obj.division(10, 0);
	}
}
