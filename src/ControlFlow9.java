/*
 *����[1],����[2],��[3] Ȯ�� ���α׷��� �ۼ��Ͻÿ�
 * �θ��� ������ ������ ���� �����Ͽ� ����� ����ϴ� ���α׷�
 * 1:
 * @author smart00
 */
public class ControlFlow9 {

	public static void main(String[] args) {
		int user1 = (int)(Math.random()*3)+1;// ����
		int user2 = (int)(Math.random()*3)+1;// ����
		
		if (user1 == 1) {
			System.out.println("����.");
		}else if (user1 == 2) {
			System.out.println("����.");
		}else if (user1 == 3) {
			System.out.println("��.");
		}
		
		if (user2 == 1) {
			System.out.println("����.");
		}else if (user2 == 2) {
			System.out.println("����.");
		}else if (user2 == 3) {
			System.out.println("��.");
		}
		
		if (user1 == 1 && user2 == 1) {
			System.out.println("�����ϴ�.");
		} else if (user1 == 1 && user2 == 2) {
			System.out.println("�Ф�.");
		} else if (user1 == 1 && user2 == 3) {
			System.out.println("����.");
		} else if (user1 == 2 && user2 == 1) {
			System.out.println("����.");
		} else if (user1 == 2 && user2 == 2) {
			System.out.println("�����ϴ�.");
		} else if (user1 == 2 && user2 == 3) {
			System.out.println("�Ф�.");
		} else if (user1 == 3 && user2 == 1) {
			System.out.println("�Ф�.");
		} else if (user1 == 3 && user2 == 2) {
			System.out.println("����.");
		} else if (user1 == 3 && user2 == 3) {
			System.out.println("�����ϴ�.");
		}

	}
}


