/*
 * for ��
 * 2022�� 1���� ���ڸ� ����Ͻÿ�(1~31) �ݺ��ؼ� ����غ�����
 * 
 */
public class Loop_5 {

	public static void main(String[] args) {
		int j = 1;
		while ( j <= 12) {
			int lastdayOfMonth = 0;
			switch (j) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastdayOfMonth = 31;
				break;
			case 2:
				lastdayOfMonth = 28;
				break;
			default:
				lastdayOfMonth = 30;
				break;
			}
			
			System.out.print(j + "�� ");
			int i = 1;
			while ( i <= lastdayOfMonth) {
				System.out.print(i + " ");
				 i++;
			}
			System.out.println();
			j++;
		}

	}

}
