import java.io.IOException;
import java.util.Scanner;

/*
 * ��,��,�� ����, ���� ó�� ���α׷��� �ۼ� �Ͻÿ�
 */
public class ArrayExam6 {
	/*
	 * �迭�� ���� Ÿ�Ը� ������ �ȴ�. �ѹ������� �迭�� ���̸� �ø��ų� ���ϼ� ����.
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
