package fibonacci;

public class FibonacciSequence {
	
	public int sequence(int n) {
		if (n>=2) {
			return sequence(n-1) + sequence(n-2);
		} else if (n==1) {
			return 1;
		} else if (n==0) {
			return 0;
		}
		return -1;
	}

	public static void main(String[] args) {
		FibonacciSequence obj = new FibonacciSequence();
		if (args.length == 1) {
			try {
				int n = Integer.parseInt(args[0]);
				System.out.println("The " + n + "th Fibonacci number is " + obj.sequence(n));
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number (integer)");
			}
		} else {
			System.out.println("Please enter one argument");
		}
	}
}