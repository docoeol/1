
public class Printer {

	
	// 메소드 오버로딩하기 : 메소드 이름은 같고, 매개변수의 갯수, 자료형은 다르다.
	public static void println(int n) {
		System.out.println(n);
	}
	// println(true)
	public void println(boolean n) {
		System.out.println(n);
	}
	// println(5.7)
	public void println(double n) {
		System.out.println(n);
	}
	// println("홍길동")
	public void println(String n) {
		System.out.println(n);
	}
	
	
	
}
