/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int a = (int) (Math.random() * (num2 - num1) + num1);
		int b = (int) (Math.random() * (num2 - num1) + num1);
		int c = (int) (Math.random() * (num2 - num1) + num1);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("The minimal generated value was " + Math.min(a, Math.min(b, c)));

	}
}
