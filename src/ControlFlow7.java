/*
 * @author smart00
 * 
 * �������α׷���(�⺰) �ۼ��Ͻÿ�.
 * �������α׷���(����) �ۼ��Ͻÿ�.
 */
public class ControlFlow7 {

	public static void main(String[] args) {
		
		//int i = 1*12+1;//�ٹ�������
		
		//60*60*24
		//int i = 27;//�ٹ�������
		//int mon =i/12;
		//60*60*24
		//int i = 3;

		//if (i - 1 <= 1) {
		//	System.out.println("1��");
		//} else if (i - 1 <= 2) {
		//	System.out.println("2��");
		
		//} 
		 int longevity =-10;//���� 1������.
		 if(longevity<1) {
			 System.out.println("usage:������� �Է��ϼž��մϴ�.");
			 return;
		 }
			switch (longevity) {
			case 1:System.out.println("���������� 11�� �Դϴ�.");
				break;
			case 2:System.out.println("���������� 15�� �Դϴ�.");
				break;
			case 3:
			case 4:System.out.println("���������� 16�� �Դϴ�.");
			    break;
			case 5:
			case 6:System.out.println("���������� 17�� �Դϴ�.");
			    break;
			case 7:
			case 8:System.out.println("���������� 18�� �Դϴ�.");
			    break;
			case 9:
			case 10:System.out.println("���������� 19�� �Դϴ�.");
			    break;
			case 11:
			case 12:System.out.println("���������� 20�� �Դϴ�.");
			    break;
			case 13:
			case 14:System.out.println("���������� 21�� �Դϴ�.");
			    break;
			case 15:
			case 16:System.out.println("���������� 22�� �Դϴ�.");
			    break;
			case 17:
			case 18:System.out.println("���������� 23�� �Դϴ�.");
			    break;
			case 19:
			case 20:System.out.println("���������� 24�� �Դϴ�.");
			    break;
			default:System.out.println("���������� 25�� �Դϴ�.");
				break;
			}

		}

	}

