import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for ��
 * 50������ �ݺ��ϼ���.
 * �������� ����ϼ���.
 * 3�� ����϶��� ¦�̶�� ����ϼ���
 * System.out.println("¦");
 * �Ǻ���ġ������ ����Ͻÿ�. �� 10���� �ݺ��ϼ���.
 * 
 */
public class Loop15 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			// i ���� 5�̸�(if���ǹ�) �����
			// if (i == 5) {
			// ¦���� ����ϼ���
			if (i % 3 == 0) {
				
				System.out.println("¦");
				
				continue;
			}
			System.out.println(i);

		}

	}

}
