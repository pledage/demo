
public class Operator4 {

	public static void main(String[] args) {
		//���������� ++, --
		int i = 0;
		i++;
		--i;
		System.out.println(++i);
		
		//���������� !
		boolean b =false;
		System.out.println(!b);
		
		//�񱳿����� >, >=, <, <=, ==< != ����� boolean
		int m = 10, n = 5;
		System.out.println(m > n);
		System.out.println(m >= n);
		System.out.println(m < n);
		System.out.println(m <= n);
		System.out.println(m == n);
		System.out.println(m != n);
		System.out.println("----------------------------");
		
		//��������( and[&&] , or[||], not[!])
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println("----------------------------");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println("----------------------------");
		System.out.println(! false);
		System.out.println(! true);
		
		//��Ʈ������ and[&] , or[|], not [~], xor[^] shift[<<], [>>],[ >>>]
		byte bitNum1 = 15;
		byte bitNum2 = 3;
		System.out.println(bitNum1 & bitNum2);
		System.out.println(bitNum1 | bitNum2);
		System.out.println(bitNum1 ^ bitNum2);
		System.out.println( ~ bitNum2);
		System.out.println(bitNum2 << 2);
		System.out.println(bitNum2 >> 1);
		System.out.println(bitNum2 >>> 1);
		
	}

}
