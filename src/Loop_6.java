/*
 * for ��
 * ���� �ð��� ����غ�����
 * 
 */
public class Loop_6 {

	public static void main(String[] args) {
	    int sec = (60*60*14)+(32*60);
		//System.out.println(sec);//��ü��
		
		while (true) {
			
			sec++;

			System.out.print((sec)/(60*60)+"��");//��
			System.out.print(((sec)%(60*60))/60 + "��");//��
			System.out.println(((sec)%(60*60))%60 + "��");//��
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
