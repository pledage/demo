/*
 * 문자열 String 클래스
 * 
 */
public class StringExam {

	public static void main(String[] args) {
	    String str = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));//문자와 문자열 비교한뒤 같은거다 라고 알려 준다.문자열에서는 == 말고 equals (레퍼런스에서 비교할때)를 쓴다
		System.out.println(str2);

	}

}
