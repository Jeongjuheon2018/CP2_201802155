package bank2;

public class BankAccount {
	int acountNumber; //���¹�ȣ
	String Name; //�̸�
	long balance; //�ܾ�,�ʱ�ݾ�
	double interestRate; //������
	
	public BankAccount(String Name, long balance, double interestRate) {		//�����ڸ� ���� �̸�, �ʱ�ݾ�, ������ ����
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
	public long deposit (long money) {		//�Ա� �޼ҵ�
		balance+=money;
		return balance;
	}
	
	public long withdraw(long money) {		//��� �޼ҵ�
		balance-=money;
		return balance;
	}
	public int installmentSavingPredict(int month, long money) {		//���� �޼ҵ�
		return (int) (balance + money*0.1/12*(month*(month+1)/2)+money*month);
	}
	
	public long fixedDepositPredict(int month, long money) {		//���� ���� �޼ҵ�
		return balance + (int) ( money+ money*(Math.pow(1+(interestRate/12),month)-1));
	}
}
