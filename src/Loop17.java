import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for ��
 * 1���� 10������ ���� �߿���
 * 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���
 * ��°��: 3+6+9+=18 �� ��°��: 3+6+9=18�� ����ϼ���.
 */
public class Loop17 {

	public static void main(String[] args) {
		// int j = 0;
		int sum = 0;
		int max = 30;
		for (int i = 1; i <= max; i++) {
			// i ���� 5�̸�(if���ǹ�) �����
			// if (i == 5) {
			// ¦���� ����ϼ���
			if (i % 3 == 0) {
				// System.out.println("i");
				// continue;
				// j = j + i;
				// System.out.println(i);
				sum += i;
				System.out.print(i);
				// System.out.print("+");
				if (i != (max-(max%3))) {
					System.out.print("+");
				}
				
			}
		}
		// System.out.println(j);
		// System.out.println(sum);
		System.out.print("=" + sum);

	}

}
