import java.io.IOException;
import java.util.Scanner;

/*
 * 국,영,수 총합, 성적 처리 프로그램을 작성 하시오
 */
public class ArrayExam6 {
	/*
	 * 배열은 같은 타입만 저장이 된다. 한번생성된 배열은 길이를 늘리거나 줄일수 없다.
	 */

	public static void main(String[] args) throws IOException {
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		// System.out.println(arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.println(arr[i][j]);

		}

	}

}
