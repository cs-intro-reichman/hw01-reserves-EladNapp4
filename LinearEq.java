/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {

		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		double num3 = Double.parseDouble(args[2]);

		System.out.println(num1 + " * X + " + num2 + " = " + num3);
		System.out.println("X = " + ((num3 - num2) / num1));
	}
}