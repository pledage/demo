import java.util.HashSet;

/*
 * 로또 
 */
public class Test2 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			HashSet<Integer> hs = new HashSet<Integer>();
	
			while (true) {
				hs.add((int) (Math.random() * 45) + 1);
				
				if (hs.size() == 6) {
					break;// 반복문을 빠져나간다.
				}
			}
			//2022-01-15일 로또1등번호 6개 출력
			System.out.println(hs);
			
		}
	}
}
