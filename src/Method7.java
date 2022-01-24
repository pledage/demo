/*
 * 계산기 프로그램을 작성하시오.
 * 임의의 두수를 입력 받아 +-* / % 를 수행하시오.
 * 출력값은 : 4 + 2 = 6
 * 4 -2 =2
 */
public class Method7 {
	/*
	 * public static void add(int i, int j) {
	 * 
	 * System.out.println(i + " + " + j + " = " + (i + j)); return; } public static
	 * void minus(int i, int j) {
	 * 
	 * System.out.println(i + " - " + j + " = " + (i - j)); return; } public static
	 * void multiply(int i, int j) {
	 * 
	 * System.out.println(i + " * " + j + " = " + (i * j)); return; } public static
	 * void divide(int i, int j) {
	 * 
	 * System.out.println(i + " / " + j + " = " + (i / j)); return; } public static
	 * void remainder(int i, int j) {
	 * 
	 * System.out.println(i + " % " + j + " = " + (i % j)); return; }
	 */

	public static void main(String[] args) {
		int i = 4;
		int j = 2;
		int res = 0;
		double res2 =0;
		res = add(i,j);
		System.out.println(i + " + " + j + " = " + res);
		add(i, j);// 더하기
		System.out.println(i + " - " + j + " = " + res);
		minus(i, j);// 빼기
		System.out.println(i + " * " + j + " = " + res);
		multiply(i, j);// 곱하기
		System.out.println(i + " / " + j + " = " + res2);
		divide(i, j);// 나누기
		System.out.println(i + " % " + j + " = " + res);
		remainder(i, j);// 나머지
		
	}

	private static int remainder(int i, int j) {
		return i % j;
		
	}

	private static double divide(int i, int j) {
		return i / j;
		
		
	}

	private static int multiply(int i, int j) {
		return i * j;
		
	}

	private static int add(int i, int j) {
		return i + j;

	}
	private static int minus(int i, int j) {
		return i - j;

	}

}
