import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for ��
 * ��
 * �ڡ�
 * �ڡڡ�
 * �ڡڡڡ�
 * �ڡڡڡڡ�
 * ���� �ð��� ����غ�����
 * 
 */
public class Loop9 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
}
