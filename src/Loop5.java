/*
 * for 문
 * 2022년 1월달 일자를 출력하시오(1~31) 반복해서 출력해보세요
 * 
 */
public class Loop5 {

	public static void main(String[] args) {
		for (int j = 1; j <= 12; j++) {
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
			
			System.out.print(j + "월 ");
			for (int i = 1; i <= lastdayOfMonth; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
