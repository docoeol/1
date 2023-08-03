import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
	
		
		int midScore;
		int finalScore;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("중간고사 점수 입력");
		midScore = scan.nextInt();
		System.out.println("기말고사 점수 입력");
		finalScore = scan.nextInt();
		
		System.out.println("학기 전 홍팍이의 중간 점수");
		System.out.println(midScore);
		System.out.println("학기 전 홍팍이의 기말 점수");
		System.out.println(finalScore);
		
		
		
	
	}

}
