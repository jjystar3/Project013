package lambda;

public class Quiz01 {

	public static void main(String[] args) {

		// 구현클래스
		MyNumber bigNum = new BiggerNumber();
		System.out.println(bigNum.max(4, 8));

		// 익명클래스
		MyNumber bigNum1 = new MyNumber() {

			@Override
			public int max(int x, int y) {
				return x > y ? x : y;
			}

		};
		System.out.println(bigNum1.max(4, 8));

		// 람다식 함수
		MyNumber bigNum2 = (x, y) -> x > y ? x : y;
		System.out.println(bigNum2.max(7, 2));

	}

}

//함수형 인터페이스
@FunctionalInterface
interface MyNumber {
	int max(int x, int y);
}

class BiggerNumber implements MyNumber {

	@Override
	public int max(int x, int y) {
		// 삼항연산자
		return x > y ? x : y;
	}

}