/*
 * 
 */
public class ArrayExam10 {

	public static void main(String[] args) {
		int [] i = new int[2];
		int [] j = null;// 기본값.
		j = i;
		i[0] = 1;
		j[0] = 2;
		i = null;
		System.gc();//가비지 컬랙터.
		//System.out.println(i[0]);
		System.out.println(j[0]);
	}

}



