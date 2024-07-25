package lambda;

public class Ex01 {

	public static void main(String[] args) {

		//클래스로 인터페이스 구현
		StringConcat stringConcat = new StringConcatImpl();
		stringConcat.makeString("Hello", "World");

		//람다식으로 인터페이스 구현
		StringConcat stringConcat2 = (s1, s2) -> System.out.println(s1 + "," + s2);
		stringConcat2.makeString("Hi", "~~~");

	}

}

interface StringConcat {

	public void makeString(String s1, String s2);
}

class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}

}