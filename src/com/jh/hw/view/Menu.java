package com.jh.hw.view;

import java.util.Scanner;

import com.jh.hw.controller.Function;

public class Menu {
	/*
	 * 1. displayMenu() 메소드에 메뉴 화면이 반복 출력되게 함 2. 메뉴 번호를 입력 받아 해당 번호의 기능이 실행되게 함 3.
	 * 메뉴 1~8번까지의 실행용 메소드는 Function클래스의 메소드 호출 4. 9번 입력 시 “종료합니다.” 출력 후 종료 5. 잘 못 입력
	 * 했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력
	 */
	Function f = new Function();
	Scanner sc = new Scanner(System.in);
	public void displayMenu() {
		int num = 0;
		do {
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은 수에서큰 수 까지 합계");
			System.out.println("3. 신상 정보 확인");
			System.out.println("4. 헉생 정보 확인");
			System.out.println("5. 별과 숫자 출력");
			System.out.println("6. 난수까지의 합계");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");

			num = Integer.parseInt(sc.next());
			
			switch (num) {
			case 1: f.calculator();
				break;
			case 2: f.totalCalculator();
				break;
			case 3: f.printProfile();
				break;
			case 4: f.printScore();
				break;
			case 5: f.printStarNumber();
				break;
			case 6: f.sumRandom();
				break;
			case 7: f.exceptGugu();
				break;
			case 8: f.diceGame();
				break;
			case 9:
				System.out.println("프로그램을 종료 합니다.");
				break;
			default:
				System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요.");
			}
			System.out.println();
		} while (num != 9);
		
	}
}
