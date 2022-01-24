/*
 * 성적처리프로그램을 작성하시오.
 * 취득점수가 90점이상이면 A, 80점이상이면 B, 70점 이상이면 C, 
 * 70점 미만이면 F 를 출력하시오.
 * 예 : 나의 점수가 59점이면 F가 출력됩니다.
 * if, switch를 이용하여 각각 프로그램 하시오.
 * @author smart00
 * 
 * 연차프로그램을 작성하시오.
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

