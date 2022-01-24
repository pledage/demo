/*
 * 계산기 프로그램을 작성하시오.
 * 임의의 두수를 입력 받아 +-* / % 를 수행하시오.
 * 출력값은 : 4 + 2 = 6
 * 4 -2 =2
 */
public class Method6 {
	public static void add(int i, int j) {

		System.out.println(i + " + " + j + " = " + (i + j));
		return;
	}
	public static void minus(int i, int j) {

		System.out.println(i + " - " + j + " = " + (i - j));
		return;
	}
	public static void multiply(int i, int j) {

		System.out.println(i + " * " + j + " = " + (i * j));
		return;
	}
	public static void divide(int i, int j) {

		System.out.println(i + " / " + j + " = " + (i / j));
		return;
	}
	public static void remainder(int i, int j) {

		System.out.println(i + " % " + j + " = " + (i % j));
		return;
	}
	
	

	public static void main(String[] args) {
		int i = 4;
		int j = 2;
		add(i, j);// 더하기
		minus(i, j);// 빼기
		multiply(i, j);// 곱하기
		divide(i, j);// 나누기
		remainder(i, j);// 나머지

	}

}
