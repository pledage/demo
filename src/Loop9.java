import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * for 문
 * ★
 * ★★
 * ★★★
 * ★★★★
 * ★★★★★
 * 현재 시간을 출력해보세요
 * 
 */
public class Loop9 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
