package game;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChocholateJar chocolatejar = new ChocholateJar();
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		System.out.println("게임을 시작합니다.");
		System.out.println("항아리에는 14개의 아이템이 있습니다.");
		System.out.println(chocolatejar.status());
		System.out.println("1~3개의 아이템을 꺼낼 수 있으며 칠리를 꺼내면 패배합니다.");
		System.out.println("시작!!");

		int i = 0, number, take;
		while (true) {
			i++;
			System.out.println("+------" + i + "번쨰 턴! ------+");
			System.out.print("몇 개를 뽑을까요?(1~3) ");
			number = scan.nextInt();

			if (number == 1) {
				System.out.println("플레이어는 1개의 초콜릿을 꺼냈습니다.");
				chocolatejar.takeItem(1);
				System.out.println(chocolatejar.status());
				take = random.nextInt(1000)%3+1;
				chocolatejar.takeItem(take);
				if(chocolatejar.getChochlate() == 0 && chocolatejar.getChilli() == 1) {
					System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
					System.out.println(chocolatejar.status());
					System.out.println("컴퓨터 승리!");
					break;
				}
				if(chocolatejar.getChilli()==0 && chocolatejar.getChochlate()==0) {
					System.out.println("플레이어 승리!");
					break;
				}
				System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
				System.out.println(chocolatejar.status());

			}
			if (number == 2) {
				System.out.println("플레이어는 2개의 초콜릿을 꺼냈습니다.");
				chocolatejar.takeItem(2);
				System.out.println(chocolatejar.status());
				take = random.nextInt(1000)%3+1;
				chocolatejar.takeItem(take);
				if(chocolatejar.getChochlate() == 0 && chocolatejar.getChilli() == 1) {
					System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
					System.out.println(chocolatejar.status());
					System.out.println("컴퓨터 승리!");
					break;
				}
				if(chocolatejar.getChilli()==0 && chocolatejar.getChochlate()==0) {
					System.out.println("플레이어 승리!");
					break;
				}
				System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
				System.out.println(chocolatejar.status());

			}
			if (number == 3) {
				System.out.println("플레이어는 3개의 초콜릿을 꺼냈습니다.");
				chocolatejar.takeItem(3);
				System.out.println(chocolatejar.status());
				take = random.nextInt(1000)%3+1;
				chocolatejar.takeItem(take);
				if(chocolatejar.getChochlate() == 0 && chocolatejar.getChilli() == 1) {
					System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
					System.out.println(chocolatejar.status());
					System.out.println("컴퓨터 승리!");
					break;
				}
				if(chocolatejar.getChilli()==0 && chocolatejar.getChochlate()==0) {
					System.out.println("플레이어 승리!");
					break;
				}
				System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
				System.out.println(chocolatejar.status());

			}

		}
	}

}
