/*
 * for 문
 * 2022년 부터 본인의 생년까지 반복해서 출력해보세요.
 * 
 */
public class Loop_3 {

	public static void main(String[] args) {
		int myAge = 1996;
		int i = 2022;
		while ( i >= myAge ) {
			System.out.printf("년도 %d, 나이 %d %n",i,i-(1983-1));
			i--;
		}
			
		

	}

}
