
public class Festival0922_01 {

	public static void main(String[] args) {
		
		int base = 5;
		int n =3;
		int result = powerN(base, n);
		System.out.println("��� Ȯ�� : " + result);

	}
	public static int powerN(int base, int n) {
		
		double result = Math.pow(base,n);		
				return (int)result;
		
	}

}
