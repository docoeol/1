import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

	static ArrayList<Account> arrayAccount = new ArrayList<Account>();

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택>");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				desposit();
			} else if (selectNo == 4) {
				whithdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");

		System.out.println("계좌번호:");
		String ano = scan.next();

		System.out.println("계좌주:");
		String owner = scan.next();

		System.out.println("초기입금액");
		int balance = scan.nextInt();

		Account newAccount = new Account(balance, ano, owner);

		arrayAccount.add(newAccount);

		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	public static void accountList() {

		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");

		for (Account account : arrayAccount) {

			System.out.println(account.getAno());
			System.out.println("");
			System.out.println(account.getOwner());
			System.out.println("");
			System.out.println(account.getBalance());
			System.out.println();
		}

	}

// 예금하기
	public static void desposit() {

		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.println("계좌번호:");
		String ano = scan.next();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}

		System.out.print("예금액: ");
		int money = scan.nextInt();
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공되었습니다.");

	}

	private static Account findAccount(String ano) {

		for (Account ac : arrayAccount) {
			String dbAno = ac.getAno();
			if (dbAno.equals(ano))
				return ac;
		}

		return null;
	}

	public static void whithdraw() {

		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.print("계좌번호:");
		String ano = scan.next();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;

		}
		System.out.print("출금액: ");
		int money = scan.nextInt();
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다.");

	}
}
