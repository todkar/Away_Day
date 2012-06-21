public class Fact {
	public long fact(long inp) {
		long input = inp;
		long factorial = 1;

		while (input > 0) {
			factorial = factorial * input;
			input = input - 1;
		}
		return factorial;
	}
}
