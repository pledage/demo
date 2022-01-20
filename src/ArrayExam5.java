import java.util.Scanner;

/*
 * 국,영,수 총합, 성적 처리 프로그램을 작성 하시오
 */
public class ArrayExam5 {
	/*
	 * 배열은 같은 타입만 저장이 된다.
	 * 한번생성된 배열은 길이를 늘리거나 줄일수 없다.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int [] grade = new int[5];
	    System.out.println(grade.length);//length 데이터 길이를 나타내준다.
	    System.out.println("국어성적을 입력하세요.");
		grade[0] = scan.nextInt();
		System.out.println("영어성적을 입력하세요.");
		grade[1] = scan.nextInt();
		System.out.println("수학성적을 입력하세요.");
		grade[2] = scan.nextInt();
		grade[3] = grade[0] +grade[1] + grade[2];
		grade[4] = grade[3] /3;
		System.out.printf("국어:%d, 영어:%d, 수학:%d",grade[0], grade[1], grade[2] );
		System.out.printf("총점:%d, 평균:%d", grade[3], grade[4] );
		
	}

}
