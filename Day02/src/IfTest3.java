import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
	

		Scanner scanner = new Scanner(System.in);
		
	
	
		System.out.println("숫자를 입력하세요 : ");
		int n = scanner.nextInt();
		
		if((n%2!=0)) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");	
		}
		
	
		
		
		
	}

}