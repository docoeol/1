public class IfTest2 {

	public static void main(String[] args) {
	
	  //난수생성 Math.random()  0.0 이상 1.0 미만 
	  //1부터 6까지의 난수생성
		
	 int n = (int)(Math.random()*6)+1;
	 System.out.println(n);
	 
	 
	 switch(n) { 
	 case 1:
		 System.out.println("1번이 나왔습니다.");
		 break;
	 case 2:
		 System.out.println("2번이 나왔습니다.");
	 	 break;
	 case 3:
		 System.out.println("3번이 나왔습니다.");
		 break;
	 case 4:
		 System.out.println("4번이 나왔습니다.");
		 break;
	 case 5:
		 System.out.println("5번이 나왔습니다.");
	 	 break;
	 case 6:
		 System.out.println("6번이 나왔습니다.");
		 break;	
	 default:
		 System.out.println("해당되는 값이 존재하지 않습니다.");
		 break;
	}
}
}