import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for 문
 * 피보나치수열을 출력하시오. 총 10번만 반복하세요.
 * 
 */
public class Loop14 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			// i 값이 5이면(if조건문) 멈춰라
			//if (i == 5) {
			//짝수만 출력하세요
			if (i%2 != 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
