import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		System.out.println("=========Game Menu=========");
		System.out.println("1.가위\t2.바위\t3.보\t9.종료");
		System.out.println("===========================");
		System.out.println("입력하세요 >>>");
		
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		
		int com = (int)(Math.random()*3)+1;
		
		if (user != 9) {
			System.out.println("User:"+user);
			System.out.println("Com:"+com);
		}
		
		if((user == 1 && com == 1) || (user == 2 && com == 2)  || (user == 3 && com == 3)) {
			System.out.println("비겼습니다");
	}else if((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
		System.out.println("이겼습니다");
	}else if((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {
		System.out.println("졌습니다");
	}else if(user==9) {
		System.out.println("종료");
	}

}
}
