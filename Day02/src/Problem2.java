import java.util.Scanner;

public class Problem2 {

	
	public static void main(String[] args) {
		
	
		
		/*
		for(int i=1;i<=10;i++) {
			if(i == 3 || i==6 || i==9) {
				System.out.print("짝");
				continue;
		}
		
		System.out.printf("%d ",i);
		
		
	  }
	*/  
		
	
		Scanner scanner = new Scanner(System.in);
		
		int money = 100000;
		
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("----------------------------------");		
			System.out.print("선택>");
			int a = scanner.nextInt();
			
			
			if(a == 1) {		
				System.out.print("예금액>");
				int b = scanner.nextInt();
				money += b;
			}
			else if (a == 2) {
				
				System.out.print("출금액>");
				int b = scanner.nextInt();
				money -= b;
			}
			else if (a == 3) {
				
				System.out.println("잔고>"+money);
				
			}
			else if (a == 4) {
				System.out.println("프로그램 종료"); 
				break;
			}
			else {
				System.out.println("없는 번호 입니다."); 
				break;
			}
			
			
			
		}
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
	}
	
}
