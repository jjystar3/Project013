package innerclass;

class Outer {
	
	private int a = 10;
	private static int b = 20;
	
	//인스턴스 내부 클래스
	class Inclass {
		int i1 = a;
		int i2 = b;
	}
	
	static class InStaticClass {
//		int i1 = a; //정적클래스에서 인스턴스변수 사용불가
		int i2 = b; // static에서 static 사용은 ok
	}
	
}