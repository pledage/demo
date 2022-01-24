
public class Operator2 {

	public static void main(String[] args) {
		// 산술연산자 + - */ %(나머지값)
		double i= 10;
		int j = 3;
		
		System.out.printf("%f + %d = %2.2f%n",i, j, i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.printf("%.12f",i/j);
		System.out.println(i%j);

	}

}
