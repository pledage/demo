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
public class Loop_9 {

	public static void main(String[] args) {
		int i = 0;
		while ( i < 5 ) {
			int j = 0;
			while ( j <= i ) {
				System.out.print("★");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
