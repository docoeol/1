public class Exam2 {

	public static void main(String[] args) {
	
		int charCode = 'A';
		int charCode2 = 11;
	    double charCode3 = 160;
		
		
	 
		if((65<=charCode) && (charCode<=90)) // 65이상이고 90이하
		    System.out.println("대문자이군요");
		
		
		
		if((15<=charCode2) || (charCode3<=160)) // 15이상이고 160이하
			System.out.println("놀이기구 탑승가능 이군요");
		
		
		 if(charCode2%2 == 0 ) 
			 System.out.println("짝수 입니다.");
		 else
			 System.out.println("홀수 입니다. ");
		 
		//3항 연산자로 해결하기
		boolean k ;
		k = (charCode2 % 2) == 0;
		System.out.println(k ? "짝수":"홀수");
	
		//if(k+==true)  ? System.out.println("짝수") : System.out.println("홀수");
		
	}

}
