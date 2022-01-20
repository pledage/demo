

/*
 * for 문
 * 피보나치수열을 출력하시오. 총 10번만 반복하세요.
 * 
 */
public class Loop10 {

	public static void main(String[] args) {
		int m = 0;
		int n = 1;
		int o = 0;
		
//		m = n;
//		n = o;
//		o = m + n;
//		System.out.println(o);
		
		for (int i = 0; i < 7; i++) {
			m = n;
			n = o;
			o = m + n;
			System.out.println(o); 
			}
		
//		m = n;
//		n = o;
//		o = m + n;
//		System.out.println(o);
//		m = n;
//		n = o;
//		o = m + n;
//		System.out.println(o);
//		m = n;
//		n = o;
//		o = m + n;
//		System.out.println(o);
//		m = n;
//		n = o;
//		o = m + n;
//		System.out.println(o);
//		m = n;
//		n = o;
//		o = m + n;
//		System.out.println(o);

		/*
		 * for (int i = 0; i < 10; i++) { System.out.print(i); }
		 */
	}
}
