/*
 * 주어진 배열의 항목에서 최대값을 구해보세요.(for문을 이용하세요)
 * {1, 5, 3, 8, 2}
 * 결과값은 8
 */
public class ArrayExam11 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int max = -99999999;//Integer.MIN
		int [] arr = {-1, 5, 3, 8, 2};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			
		}
		System.out.println(max);
		
	
		//int [] i = {1, 5, 3, 8, 2};
		//int max = 0;
		
		//for (int i =0; i < arr.length; i++ ) {
		    	//if(i < max);{
		    		//System.out.println(max);
		    	//}
			//}
		
			
		}
			
			
		
	}





