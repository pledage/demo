import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for 문
 * 50번까지 반복하세요.
 * 삼육구를 출력하세요.
 * 3의 배수일때는 짝이라고 출력하세요
 * System.out.println("짝");
 * 피보나치수열을 출력하시오. 총 10번만 반복하세요.
 * 
 */
public class Loop16 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 50) {
			// i 값이 5이면(if조건문) 멈춰라
			// if (i == 5) {
			// 짝수만 출력하세요

			i++;

			if (i % 3 == 0) {

				System.out.println("짝");

				continue;

			}

			System.out.println(i);
			

		}

	}

}
