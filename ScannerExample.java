import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		
		String name;
		int age;
		String dept;
		double height;
		
		// 입력 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 데이터 읽어오기
		
		System.out.print("이름을 입력하세요:>>");
		name = scan.next();
		
		System.out.print("나이를 입력하세요:>>");		
		age = scan.nextInt();
		
		System.out.print("키 입력하세요:>>");		
		height = scan.nextDouble();		
		
		System.out.print("전공을 입력하세요:>>");		
		dept = scan.next();
		
		
		System.out.printf("이름:%s, 나이:%d, 키:%5.1f, 전공:%s", name,age,height,dept);
		
	
		
		
		
	}

}
