/*
 * ���ڿ� String Ŭ����
 * 
 */
public class StringExam {

	public static void main(String[] args) {
	    String str = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));//���ڿ� ���ڿ� ���ѵ� �����Ŵ� ��� �˷� �ش�.���ڿ������� == ���� equals (���۷������� ���Ҷ�)�� ����
		System.out.println(str2);

	}

}
