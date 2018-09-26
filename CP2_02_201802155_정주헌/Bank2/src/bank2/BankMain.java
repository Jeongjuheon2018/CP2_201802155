package bank2;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("������", 300000L, 0.1);
		long money; 
		int month;
		
		System.out.println("���� ���ΰ� "+account.getName()+"�̰�, �ܾ���"+account.getbalance()+"�Դϴ�.\n");
		
		//�Ա� �ó�����
		money = 100000; //10���� �Ա�
		account.deposit(money);
		System.out.println("���¿�"+money+"���� �Ա��Ͽ�, �ܾ���"+account.getbalance()+"���� �Ǿ����ϴ�.");
		
		//��� �ó�����
		money = 100000; //10���� ���
		if (account.withdraw(money)<0) {
			System.out.println("�ܾ��� �����Ͽ� ����� �� �����ϴ�.");
		}
		else {
			System.out.println("���¿�"+money+"���� ����Ͽ�, �ܾ���"+account.getbalance()+"���� �Ǿ����ϴ�.");
		}
	
		
		
		
		//���� �ó�����
		money = 10000; //�ſ� 10000��
		month = 12; //12����
		System.out.println("�ſ� "+money+"����"+month+"���� �����ϸ�, �ܾ���"+account.installmentSavingPredict(month, money)+"���� �ɰ��Դϴ�.");
	
		//���� ���� �ó�����
		money = 2000000;
		month = 24;
		System.out.println(money+"����"+month+"���� ���� �����ϸ�, �ܾ���"+account.fixedDepositPredict(month, money)+"���� �ɰ��Դϴ�.");
	}

}
