
public class Method5 {
	
	public static void aaa(int i) {
		System.out.println("aaa()함수가 호출되었습니다." + (++i));
		return;
		//System.out.println();
	}
	//static 은 static 이다.
	private static int bbb(int i) {
		i += 1;
		i = i + 1;
		i++;
		return i;
	}

	public static void main(String[] args) {
		int i = 24;
		i = bbb(i);
		System.out.println(i);
	}

}




