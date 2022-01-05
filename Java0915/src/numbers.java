import java.util.Arrays;

public class numbers {

	// ���� ������ : ��ɿ� ������ �� �ִ� ������ �����ϴ� Ű����
	// private : �޼ҵ尡 ���ǵ� ���� �ȿ����� ��밡��
	// public : �ܺ� ���Ͽ��� ��밡��
	public static boolean isPrime(int base) {
		// ������ �ۼ��� �޼ҵ带 Ȱ��

		return getDivisors(base).length == 2;
	}

	public static int[] getDivisors(int base) {

		int[] array = new int[base];

		int index = 0;
		for (int i = 1; i <= base; i++) {
			if (isDivisor(base, i)) { // ��� ����

				array[index++] = i;

			}
		} // Arrays.copyOf() : �迭�� ���ϴ� ���̱��� ����
		return Arrays.copyOf(array, index);

	}

	public static boolean isDivisor(int base, int divisor) {
		if (base % divisor == 0) {
			return true;
		} else {
			return false;
		}

	}
}
