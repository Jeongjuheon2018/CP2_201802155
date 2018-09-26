package star;
import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int k;
		
		Scanner input = new Scanner(System.in); //문자입력을 인자로 Scanner 생성
		for(k=1;k<4;k++) {
		System.out.println("몇 개의 줄로 별을 출력할까요?");
		System.out.println("---["+k+"번]---");
		num=input.nextInt();  //키보드 숫자 입력
		
		if (k==1) {		//1번 삼각형 모양 구조
			if (num<=0) {	//입력 숫자가 0 이하일 경우
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
		
		
		if (k==2) { //2번 삼각형 모양 구조
			if (num<=0) {	//입력 숫자가 0이하일 경우
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
		
		if (k==3) {	//3번 마름모 모양 구조
			if(num<=0) {
				for(int i=0;i<9;i++) {	
					for(int j=0;j<9;j++)
					{
						if(i<=9/2) // 정삼각형 영역
						{
							if(i+j<=9/2-1)//왼쪽 위 공백
								System.out.print(" ");
							else if (j-i>=9/2+1)//오른쪽 위 공백
								System.out.print(" ");
							else
								System.out.print("*");//*찍기
						}
						else if(i>9/2)//역삼각형 영역
						{
							if (i-j>=9/2+1)//왼쪽 밑 공백
								System.out.print(" ");
							else if (i+j>=9/2*3+1)//오른쪽 밑 공백
								System.out.print(" ");
							else
									System.out.print("*");//*찍기
						}
					}
					System.out.println();//줄바꿈
					}
				
					}
			else {
				for(int i=0;i<num;i++) {	
					for(int j=0;j<num;j++)
					{
						if(i<=num/2) // 정삼각형 영역
						{
							if(i+j<=num/2-1)//왼쪽 위 공백
								System.out.print(" ");
							else if (j-i>=num/2+1)//오른쪽 위 공백
								System.out.print(" ");
							else
								System.out.print("*");//*찍기
						}
						else if(i>num/2)//역삼각형 영역
						{
							if (i-j>=num/2+1)//왼쪽 밑 공백
								System.out.print(" ");
							else if (i+j>=num/2*3+1)//오른쪽 밑 공백
								System.out.print(" ");
							else
									System.out.print("*");//*찍기
						}
					}
					System.out.println();//줄바꿈
					}
			}
			
		
		}
	}
}
}
		
		
	

