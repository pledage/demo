import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for ��
 * �Ǻ���ġ������ ����Ͻÿ�. �� 10���� �ݺ��ϼ���.
 * 
 */
public class Loop13 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			// i ���� 5�̸�(if���ǹ�) �����
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}
