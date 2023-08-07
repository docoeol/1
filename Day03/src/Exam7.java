
public class Exam7 {

	public static void main(String[] args) {

		
		
		int array[] = {1, 5, 3, 8, 2};
		
		int max = array[0]; //최대값
	
				
		for(int i=0;i<array.length;i++) {
//		    if(max<array[i]) {
//			
//			max = array[i];
//		    }
		max=Math.max(max, array[i]);
		}
				
		System.out.println("최대값 : "+max);
		
		
		
		
			}
		
	}


