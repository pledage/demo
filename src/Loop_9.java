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
public class Loop_9 {

	public static void main(String[] args) {
		int i = 0;
		while ( i < 5 ) {
			int j = 0;
			while ( j <= i ) {
				System.out.print("��");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
