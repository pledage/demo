/*
 * ����ó�����α׷��� �ۼ��Ͻÿ�.
 * ��������� 90���̻��̸� A, 80���̻��̸� B, 70�� �̻��̸� C, 
 * 70�� �̸��̸� F �� ����Ͻÿ�.
 * �� : ���� ������ 59���̸� F�� ��µ˴ϴ�.
 * if, switch�� �̿��Ͽ� ���� ���α׷� �Ͻÿ�.
 * @author smart00
 * 
 * �������α׷��� �ۼ��Ͻÿ�.
 */
public class ControlFlow6 {

	public static void main(String[] args) {
		
		int i = 100;
		

			switch (i/10) {
			case 10:System.out.println("A"); break;
			case 9:System.out.println("A"); break;
			case 8:System.out.println("B"); break;
			case 7:System.out.println("C"); break;
			
			default:
				System.out.println("F");
			}

		}

	}

