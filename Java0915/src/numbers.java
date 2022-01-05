import java.util.Arrays;

public class numbers {

	// 접근 제한자 : 기능에 접근할 수 있는 범위를 설정하는 키워드
	// private : 메소드가 정의된 파일 안에서만 사용가능
	// public : 외부 파일에서 사용가능
	public static boolean isPrime(int base) {
		// 기존에 작성한 메소드를 활용

		return getDivisors(base).length == 2;
	}

	public static int[] getDivisors(int base) {

		int[] array = new int[base];

		int index = 0;
		for (int i = 1; i <= base; i++) {
			if (isDivisor(base, i)) { // 약수 성립

				array[index++] = i;

			}
		} // Arrays.copyOf() : 배열을 원하는 길이까지 복제
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
