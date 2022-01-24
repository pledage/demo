/*
 * 성적처리프로그램을 작성하시오.
 * 취득점수가 90점이상이면 A, 80점이상이면 B, 70점 이상이면 C, 
 * 60점 미만이면 F 를 출력하시오.
 * 예 : 나의 점수가 59점이면 F가 출력됩니다.
 * if, switch를 이용하여 각각 프로그램 하시오.
 * @author smart00
 * 
 */
public class ControlFlow5 {

	public static void main(String[] args) {
		// if 문
		int i =65;
		if (i>=90) 
			System.out.println("A");
		else if (i>=80) 
			System.out.println("B"); 
		else if (i>=70) 
			System.out.println("c");
		else if (i<70) 
			System.out.println("F");
		
			
			}

}
