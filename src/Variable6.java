
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
		 * i����20, j����10
		 */
		System.out.println("i����" + i);
		System.out.println("j����" + j);
	}
}