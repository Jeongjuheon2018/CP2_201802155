package star;
import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int k;
		
		Scanner input = new Scanner(System.in); //�����Է��� ���ڷ� Scanner ����
		for(k=1;k<4;k++) {
		System.out.println("�� ���� �ٷ� ���� ����ұ��?");
		System.out.println("---["+k+"��]---");
		num=input.nextInt();  //Ű���� ���� �Է�
		
		if (k==1) {		//1�� �ﰢ�� ��� ����
			if (num<=0) {	//�Է� ���ڰ� 0 ������ ���
				for(int i=0;i<5;i++) {	
					for(int j=0;j<=i;j++) {
						System.out.print("*");
				}
					System.out.println("");
				}
				}
			else {
				for(int i=0;i<num;i++) {	
					for(int j=0;j<=i;j++) {
						System.out.print("*");
				}
					System.out.println("");
				}
				}
				}		
		
		
		if (k==2) { //2�� �ﰢ�� ��� ����
			if (num<=0) {	//�Է� ���ڰ� 0������ ���
				for(int i=0;i<5;i++) {	
					for(int j=i;j<5;j++) {
						System.out.print("*");
				}
					System.out.println("");
				}
				
				}
			else {
				for(int i=0;i<num;i++) {	
					for(int j=i;j<num;j++) {
						System.out.print("*");
				}
					System.out.println("");
				}
			}
		
		}
		
		if (k==3) {	//3�� ������ ��� ����
			if(num<=0) {
				for(int i=0;i<9;i++) {	
					for(int j=0;j<9;j++)
					{
						if(i<=9/2) // ���ﰢ�� ����
						{
							if(i+j<=9/2-1)//���� �� ����
								System.out.print(" ");
							else if (j-i>=9/2+1)//������ �� ����
								System.out.print(" ");
							else
								System.out.print("*");//*���
						}
						else if(i>9/2)//���ﰢ�� ����
						{
							if (i-j>=9/2+1)//���� �� ����
								System.out.print(" ");
							else if (i+j>=9/2*3+1)//������ �� ����
								System.out.print(" ");
							else
									System.out.print("*");//*���
						}
					}
					System.out.println();//�ٹٲ�
					}
				
					}
			else {
				for(int i=0;i<num;i++) {	
					for(int j=0;j<num;j++)
					{
						if(i<=num/2) // ���ﰢ�� ����
						{
							if(i+j<=num/2-1)//���� �� ����
								System.out.print(" ");
							else if (j-i>=num/2+1)//������ �� ����
								System.out.print(" ");
							else
								System.out.print("*");//*���
						}
						else if(i>num/2)//���ﰢ�� ����
						{
							if (i-j>=num/2+1)//���� �� ����
								System.out.print(" ");
							else if (i+j>=num/2*3+1)//������ �� ����
								System.out.print(" ");
							else
									System.out.print("*");//*���
						}
					}
					System.out.println();//�ٹٲ�
					}
			}
			
		
		}
	}
}
}
		
		
	

