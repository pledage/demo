/*
 * �־��� �迭�� �׸񿡼� �ִ밪�� ���غ�����.(for���� �̿��ϼ���)
 * {1, 5, 3, 8, 2}
 * ������� 8
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





