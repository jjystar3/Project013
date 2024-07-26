package lambda;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 구현클래스
		Hello hello1 = new sayHello();
//		sayHello hello1 = new sayHello();
		hello1.helloPring();
		
		// 익명클래스
		Hello hello2 = new Hello() {

			@Override
			public void helloPring() {
				System.out.println("안녕하세요");
			}
			
		};
		hello2.helloPring();
		
		// 람다식 함수
//		Hello helloEmpty = () -> {}; // 람다식 공백 가능, {} 생략 가능
		Hello hello3 = () -> System.out.println("안녕하세요");
		hello3.helloPring();

	}

}

interface Hello {
	void helloPring();
}

class sayHello implements Hello {

	@Override
	public void helloPring() {
		System.out.println("안녕하세요");
	}
	
}