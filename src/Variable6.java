
public class Variable6 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		// start
		int k = j;
		j = i;
		i = k;
		// end
		/*
		 * i값은20, j값은10
		 */
		System.out.println("i값은" + i);
		System.out.println("j값은" + j);
	}
}