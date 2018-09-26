package bank2;

public class BankAccount {
	int acountNumber; //계좌번호
	String Name; //이름
	long balance; //잔액,초기금액
	double interestRate; //이자율
	
	public BankAccount(String Name, long balance, double interestRate) {		//생성자를 통해 이름, 초기금액, 이자율 설정
		this.Name = Name;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getName() {
		return Name;
	}
	public long getbalance( ) {
		return balance;
	}
	public long deposit (long money) {		//입금 메소드
		balance+=money;
		return balance;
	}
	
	public long withdraw(long money) {		//출금 메소드
		balance-=money;
		return balance;
	}
	public int installmentSavingPredict(int month, long money) {		//적금 메소드
		return (int) (balance + money*0.1/12*(month*(month+1)/2)+money*month);
	}
	
	public long fixedDepositPredict(int month, long money) {		//정기 에금 메소드
		return balance + (int) ( money+ money*(Math.pow(1+(interestRate/12),month)-1));
	}
}
