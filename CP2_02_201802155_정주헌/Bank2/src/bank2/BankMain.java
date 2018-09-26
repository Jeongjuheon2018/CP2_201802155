package bank2;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("정주헌", 300000L, 0.1);
		long money; 
		int month;
		
		System.out.println("계좌 주인공 "+account.getName()+"이고, 잔액은"+account.getbalance()+"입니다.\n");
		
		//입금 시나리오
		money = 100000; //10만원 입금
		account.deposit(money);
		System.out.println("계좌에"+money+"원을 입금하여, 잔액이"+account.getbalance()+"원이 되었습니다.");
		
		//출금 시나리오
		money = 100000; //10만원 출금
		if (account.withdraw(money)<0) {
			System.out.println("잔액이 부족하여 출금할 수 없습니다.");
		}
		else {
			System.out.println("계좌에"+money+"원을 출금하여, 잔액이"+account.getbalance()+"원이 되었습니다.");
		}
	
		
		
		
		//적금 시나리오
		money = 10000; //매월 10000원
		month = 12; //12개월
		System.out.println("매월 "+money+"원씩"+month+"개월 적금하면, 잔액이"+account.installmentSavingPredict(month, money)+"원이 될것입니다.");
	
		//정기 예금 시나리오
		money = 2000000;
		month = 24;
		System.out.println(money+"원을"+month+"개월 정기 예금하면, 잔액이"+account.fixedDepositPredict(month, money)+"원이 될것입니다.");
	}

}
