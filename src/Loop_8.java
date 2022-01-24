import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for 문
 * 현재 시간을 출력해보세요
 * 
 */
public class Loop_8 {

	public static void main(String[] args) {
		int odd = 0;// 홀수합
		int even = 0;// 짝수합
		int i = 1;
		while ( i < 11 ) {
			// 홀수이면 odd에 저장
			if (i % 2 == 1) {
				odd += i;
			} else {
				even += i;
			}

		}

		System.out.println("총합:" + (odd + even));
		System.out.println("홀수합:" + odd);
		System.out.println("짝수합:" + even);
		i++;

	}

}
