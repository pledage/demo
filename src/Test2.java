import java.util.HashSet;

/*
 * �ζ� 
 */
public class Test2 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			HashSet<Integer> hs = new HashSet<Integer>();
	
			while (true) {
				hs.add((int) (Math.random() * 45) + 1);
				
				if (hs.size() == 6) {
					break;// �ݺ����� ����������.
				}
			}
			//2022-01-15�� �ζ�1���ȣ 6�� ���
			System.out.println(hs);
			
		}
	}
}
