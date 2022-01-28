/*
 * 성적처리프로그램
 * 변수명 줄때 소문자 시작 숫자 시작안되고 띄어쓰기 안됨.
 * 구조체 클래스의 필드가 된다.
 */
public class StructureExam6 {
	//멤버변수, 필드
	String stdName;
	int coding;

	public static void main(String[] args) {
		StructureExam6 se0 = new StructureExam6();
		se0.stdName = "홍길동";
		se0.coding = 100;
		print(se0);
		
		

		StructureExam6 se1 = new StructureExam6();
		se1.stdName = "안명진";
		se1.coding = 90;
		print(se1);
		
		
		StructureExam6 se2 = new StructureExam6();
		se2.stdName = "이순신";
		se2.coding = 95;
		print(se2);
		
	}
	
	//메소드가 만들어짐
	private static void print(StructureExam6/*타입*/ se/*변수명*/) {
		System.out.println(se.stdName+"의 코딩성적은"+se.coding+"점입니다.");
		
	}

}
