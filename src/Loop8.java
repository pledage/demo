import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for ��
 * ���� �ð��� ����غ�����
 * 
 */
public class Loop8 {

	public static void main(String[] args) {
		int odd = 0;// Ȧ����
		int even = 0;// ¦����
		for (int i = 1; i < 11; i++) {
			// Ȧ���̸� odd�� ����
			if (i % 2 == 1) {
				odd += i;
			} else {
				even += i;
			}

		}

		System.out.println("����:" + (odd + even));
		System.out.println("Ȧ����:" + odd);
		System.out.println("¦����:" + even);

	}

}
