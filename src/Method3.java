import java.util.Scanner;

public class Method3 {

	public static void aaa(int longevity) {
	

		//int longevity = 36;

		int longevityYear = longevity/12;
		if(longevity%12 > 0) {
			longevityYear ++;
		}

		switch (longevityYear) {
		case 1:
			System.out.println("���������� "+(longevity-1)+"�� �Դϴ�.");
			break;
		case 2:
			System.out.println("���������� 15�� �Դϴ�.");
			break;
		case 3:
		case 4:
			System.out.println("���������� 16�� �Դϴ�.");
			break;
		case 5:
		case 6:
			System.out.println("���������� 17�� �Դϴ�.");
			break;
		case 7:
		case 8:
			System.out.println("���������� 18�� �Դϴ�.");
			break;
		case 9:
		case 10:
			System.out.println("���������� 19�� �Դϴ�.");
			break;
		case 11:
		case 12:
			System.out.println("���������� 20�� �Դϴ�.");
			break;
		case 13:
		case 14:
			System.out.println("���������� 21�� �Դϴ�.");
			break;
		case 15:
		case 16:
			System.out.println("���������� 22�� �Դϴ�.");
			break;
		case 17:
		case 18:
			System.out.println("���������� 23�� �Դϴ�.");
			break;
		case 19:
		case 20:
			System.out.println("���������� 24�� �Դϴ�.");
			break;
		default:
			System.out.println("���������� 25�� �Դϴ�.");
			break;
		}

	}

	public static void main(String[] args) {
		for (int i= 0; i < 22; i++)
			aaa((i+1)*12);

	}

}
