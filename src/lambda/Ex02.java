package lambda;

public class Ex02 {

	public static void main(String[] args) {

//		Calc calc1 = new Calculator();
//		int hap1 = calc1.add(3, 5);
//		System.out.println(hap1);
		
		
		Calc calc = (num1, num2) -> num1 + num2;

		//람다식의 동작 원리
		// 컴파일러가 람다식을 익명클래스로 변환하고, 클래스의 인스턴스를 생성함
		Calc calc2 = new Calc() {

			@Override
			public int add(int num1, int num2) {
				
				return num1 + num2;
			}
			
		};
				
		System.out.println(calc2.add(3, 4));

	}

}
@FunctionalInterface
//함수형 어노테이션을 나타내는 어노테이션. 추상메소드가 한개 이상 추가되는 것을 막음
interface Calc {

	//추상메소드
	int add(int num1, int num2);
	
	//추상메소드가 여러개면 람다식을 대입할 때, 어떤 메소드의 코드인지 알 수 없음
//	int max(int num1, int num2);
}
//
//class Calculator implements Calc {
//
//	@Override
//	public int add(int num1, int num2) {
//		int result = num1 + num2;
//		return result;
//	}
//	
//}