
public class Calculator {

	// 속성
	int num1, num2;

	// 생성자
	// 기본 생성자
	public Calculator() {

	}

	// 인자 생성자 (멤버변수초기화)
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// 1. 메소드 (반환타입 o, 매개변수 o)
	public int plus(int n1, int n2) {

		return n1 + n2;
	}

	// 2. 메소드 (반환타입 X, 매개변수 o)
	public void minus(int n1, int n2) {
		System.out.println(n1 - n2);
	}

	// 3. 반환타입 o, 매개변수 X

	public int multi() {
		return num1 * num2;
	}

	// 4. 반환타입 x, 매개변수 x (반환타입없으면 보이드,, 매개변수 있으면 리턴)

	public void methodInfo() {
		System.out.println("반환타입과 매개변수가 없는 메소드 입니다");
	}

}
