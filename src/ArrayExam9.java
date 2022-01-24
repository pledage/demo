/*
 * n*n*마방진
 */
public class ArrayExam9 {

	public static void main(String[] args) {
		// 마방진 수
		
		int cube = 3;
		int sum = 0;
		int chkNUm = 0;
		
		//전체합을 구하자
		for(int i = 1; i <= (cube*cube); i++) {
			sum += i;
		}
		chkNUm = (sum/(cube*cube))*cube;
		//System.out.println(chkNUm);
		
		int[][] arr = { 
				{2,7,6}, 
				{9,5,1}, 
				{4,3,8} 
			  };
		//1
		int rowCntChk = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				rowCntChk += arr[i][j];
			}
		}
		if(rowCntChk != (chkNUm*cube)) {
			System.out.println("오답");
			return;
		}
		int colCntChk = 0;
		//세로값 15체크
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++ ) {
				colCntChk += arr[j][i];
			}
		}
		if(colCntChk!=(chkNUm*cube)) {
			System.out.println("오답");
			return;
		}
		int leftTop = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i == j) {
					leftTop += arr[j][i];
				}				
			}
		}
		if(leftTop != chkNUm) {
			System.out.println("오답");
			return;
		}
		int rightTop = 0;
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i + j == cube-1 ) {
					rightTop += arr[j][i];
				}				
			}
		}
		if(rightTop != chkNUm) {
			System.out.println("오답");
			return;
		}
		System.out.println("정답입니다.축하축하");
	}

}



