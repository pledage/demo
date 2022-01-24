import java.util.Scanner;

/*
 * @author smart00
 * 
 * 
 * 연차프로그램을(월별) 작성하시오.
 */
public class ControlFlow11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("년차를 입력하세요.");

		int longevity = 1;// 나는 20개월차다.

		do {
			System.out.println("usage:양수값을 입력하셔야합니다.");
			longevity = scan.nextInt();
		} while (longevity < 1);
		
		int longevityYear = longevity/12;
		if(longevity%12 > 0) {
			longevityYear ++;
		}

		switch (longevityYear) {
		case 1:
			System.out.println("연차갯수가 "+(longevity-1)+"개 입니다.");
			break;
		case 2:
			System.out.println("연차갯수가 15개 입니다.");
			break;
		case 3:
		case 4:
			System.out.println("연차갯수가 16개 입니다.");
			break;
		case 5:
		case 6:
			System.out.println("연차갯수가 17개 입니다.");
			break;
		case 7:
		case 8:
			System.out.println("연차갯수가 18개 입니다.");
			break;
		case 9:
		case 10:
			System.out.println("연차갯수가 19개 입니다.");
			break;
		case 11:
		case 12:
			System.out.println("연차갯수가 20개 입니다.");
			break;
		case 13:
		case 14:
			System.out.println("연차갯수가 21개 입니다.");
			break;
		case 15:
		case 16:
			System.out.println("연차갯수가 22개 입니다.");
			break;
		case 17:
		case 18:
			System.out.println("연차갯수가 23개 입니다.");
			break;
		case 19:
		case 20:
			System.out.println("연차갯수가 24개 입니다.");
			break;
		default:
			System.out.println("연차갯수가 25개 입니다.");
			break;
		}

	}

}
