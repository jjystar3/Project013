package lambda;

public class Quiz01 {

	public static void main(String[] args) {

//		MyNumber bigNum = new BiggerNumber();
		
		// 익명클래스
		MyNumber bigNum = new MyNumber() {

			@Override
			public int max(int x, int y) {
				return x > y ? x : y;
			}
			
		};
		
		System.out.println(bigNum.max(4, 8));
		
		// 람다식 함수
		MyNumber bigNum2 = (x, y) ->  x > y ? x : y;
		
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
		return x > y ? x : y; //삼항연산자
	}

}