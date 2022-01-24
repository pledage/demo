/*
 * @author smart00
 * 
 * 연차프로그램을(년별) 작성하시오.
 * 연차프로그램을(월별) 작성하시오.
 */
public class ControlFlow7 {

	public static void main(String[] args) {
		
		//int i = 1*12+1;//근무개월수
		
		//60*60*24
		//int i = 27;//근무개월수
		//int mon =i/12;
		//60*60*24
		//int i = 3;

		//if (i - 1 <= 1) {
		//	System.out.println("1일");
		//} else if (i - 1 <= 2) {
		//	System.out.println("2일");
		
		//} 
		 int longevity =-10;//나는 1년차다.
		 if(longevity<1) {
			 System.out.println("usage:양수값을 입력하셔야합니다.");
			 return;
		 }
			switch (longevity) {
			case 1:System.out.println("연차갯수가 11개 입니다.");
				break;
			case 2:System.out.println("연차갯수가 15개 입니다.");
				break;
			case 3:
			case 4:System.out.println("연차갯수가 16개 입니다.");
			    break;
			case 5:
			case 6:System.out.println("연차갯수가 17개 입니다.");
			    break;
			case 7:
			case 8:System.out.println("연차갯수가 18개 입니다.");
			    break;
			case 9:
			case 10:System.out.println("연차갯수가 19개 입니다.");
			    break;
			case 11:
			case 12:System.out.println("연차갯수가 20개 입니다.");
			    break;
			case 13:
			case 14:System.out.println("연차갯수가 21개 입니다.");
			    break;
			case 15:
			case 16:System.out.println("연차갯수가 22개 입니다.");
			    break;
			case 17:
			case 18:System.out.println("연차갯수가 23개 입니다.");
			    break;
			case 19:
			case 20:System.out.println("연차갯수가 24개 입니다.");
			    break;
			default:System.out.println("연차갯수가 25개 입니다.");
				break;
			}

		}

	}

