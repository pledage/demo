import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for 문
 * 1부터 10까지의 정수 중에서
 * 3의 배수의 총합을 구하는 코드를 작성하세요
 * 출력결과: 3+6+9+=18 를 출력결과: 3+6+9=18로 출력하세요.
 */
public class Loop17 {

	public static void main(String[] args) {
		// int j = 0;
		int sum = 0;
		int max = 30;
		for (int i = 1; i <= max; i++) {
			// i 값이 5이면(if조건문) 멈춰라
			// if (i == 5) {
			// 짝수만 출력하세요
			if (i % 3 == 0) {
				// System.out.println("i");
				// continue;
				// j = j + i;
				// System.out.println(i);
				sum += i;
				System.out.print(i);
				// System.out.print("+");
				if (i != (max-(max%3))) {
					System.out.print("+");
				}
				
			}
		}
		// System.out.println(j);
		// System.out.println(sum);
		System.out.print("=" + sum);

	}

}
