
public class Operator5 {

	public static void main(String[] args) {
		//���Կ����� (=, +=, -=, *=, /=, %= ...)
		int x = 1, y = 2;
		//x += y; //x = x + y;
		x -= y;//x = x - y;
		System.out.println(x);
		
		//���׿����� (���ǹ�) ? ��:����;
		//���輺���� 60�� �̸��̸� ����� �ƴϸ� �н�
		int score = 100;
		String str = (score < 60)? "�����":"�н�";
		System.out.println(str);
	}

}
