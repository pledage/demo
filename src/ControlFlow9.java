/*
 *亜是[1],郊是[2],左[3] 溌昔 覗稽益轡聖 拙失馬獣神
 * 砧誤税 政煽亜 績税税 葵聖 識澱馬食 衣引研 窒径馬澗 覗稽益轡
 * 1:
 * @author smart00
 */
public class ControlFlow9 {

	public static void main(String[] args) {
		int user1 = (int)(Math.random()*3)+1;// 沙昔
		int user2 = (int)(Math.random()*3)+1;// 雌企号
		
		if (user1 == 1) {
			System.out.println("亜是.");
		}else if (user1 == 2) {
			System.out.println("郊是.");
		}else if (user1 == 3) {
			System.out.println("左.");
		}
		
		if (user2 == 1) {
			System.out.println("亜是.");
		}else if (user2 == 2) {
			System.out.println("郊是.");
		}else if (user2 == 3) {
			System.out.println("左.");
		}
		
		if (user1 == 1 && user2 == 1) {
			System.out.println("搾医柔艦陥.");
		} else if (user1 == 1 && user2 == 2) {
			System.out.println("ばば.");
		} else if (user1 == 1 && user2 == 3) {
			System.out.println("ぞぞ.");
		} else if (user1 == 2 && user2 == 1) {
			System.out.println("ぞぞ.");
		} else if (user1 == 2 && user2 == 2) {
			System.out.println("搾医柔艦陥.");
		} else if (user1 == 2 && user2 == 3) {
			System.out.println("ばば.");
		} else if (user1 == 3 && user2 == 1) {
			System.out.println("ばば.");
		} else if (user1 == 3 && user2 == 2) {
			System.out.println("ぞぞ.");
		} else if (user1 == 3 && user2 == 3) {
			System.out.println("搾医柔艦陥.");
		}

	}
}


