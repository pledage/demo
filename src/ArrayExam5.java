import java.util.Scanner;

/*
 * ��,��,�� ����, ���� ó�� ���α׷��� �ۼ� �Ͻÿ�
 */
public class ArrayExam5 {
	/*
	 * �迭�� ���� Ÿ�Ը� ������ �ȴ�.
	 * �ѹ������� �迭�� ���̸� �ø��ų� ���ϼ� ����.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int [] grade = new int[5];
	    System.out.println(grade.length);//length ������ ���̸� ��Ÿ���ش�.
	    System.out.println("������� �Է��ϼ���.");
		grade[0] = scan.nextInt();
		System.out.println("������� �Է��ϼ���.");
		grade[1] = scan.nextInt();
		System.out.println("���м����� �Է��ϼ���.");
		grade[2] = scan.nextInt();
		grade[3] = grade[0] +grade[1] + grade[2];
		grade[4] = grade[3] /3;
		System.out.printf("����:%d, ����:%d, ����:%d",grade[0], grade[1], grade[2] );
		System.out.printf("����:%d, ���:%d", grade[3], grade[4] );
		
	}

}
