package lambda;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 구현클래스
		StringConverter strConverter1 = new ToUpperCase();
		System.out.println(strConverter1.convert("hello"));		
		
		// 익명클래스
		StringConverter strConverter2 = new StringConverter() {
			
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
		System.out.println(strConverter2.convert("there"));		

		// 람다식 함수
		StringConverter strConverter3 = (s) -> s.toUpperCase();
		System.out.println(strConverter3.convert("buddy"));		

	}

}

interface StringConverter {

	String convert(String s);

}

class ToUpperCase implements StringConverter {

	@Override
	public String convert(String s) {
		return s.toUpperCase();
	}

}