import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		System.out.println("======메뉴=====");
		System.out.println("1. 가정용(litter당 50원");
		System.out.println("2. 상업용(litter당 45원");
		System.out.println("3. 공업용(litter당 30원");
		System.out.println("=> 메뉴 선택후 사용량을 입력하세요.");
		System.out.println("-----------------------------------");
		System.out.println("메뉴를 선택하세요 =>");

		Scanner scanner = new Scanner(System.in);

		int code = scanner.nextInt();
		int fare = 0; // 사용요금
		double tax = 0; // 세금
		System.out.println("사용량을 입력하세요>>");

		int use = scanner.nextInt(); // 사용량

		if (code == 1) {
			fare = use * 50;
			System.out.println("사용요금 = " + fare);
			System.out.println("총수도요금 = " + fare * 0.05);
		} else if (code == 2) {
			fare = use * 45;
			System.out.println("사용요금 = " + fare);
			System.out.println("총수도요금 = " + fare * 0.05);

		} else if (code == 3) {
			fare = use * 30;
			System.out.println("사용요금 = " + fare);
			System.out.println("총수도요금 = " + fare * 0.05);
		} else {

			System.out.println("올바르지 않은 메뉴 입니다. ");

		}

	}

}
