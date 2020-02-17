package com.jh.hw.controller;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	// 메뉴에서 실행시킬 메소드들을 모두 작성

	/*
	 * 정수 두 개와 연산자 하나를 키보드로 입력 받아 두 정수는 int변수에, 연산문자는 char에 저장 연산문자가 +이면 두 정수의 합 계산,
	 * -이면 두 정수의 차 계산, x 또는 X이면 두 정수의 곱, /이면 두 정수의 나누기 몫이나 나누는 수(두 번째 수)가 0이면 “0으로
	 * 나눌 수 없습니다.” 출력하고 결과 값은 0으로 처리
	 */
	public void calculator() {
		boolean key = false;
		while(!key) {
			System.out.println("\n===== 간단 계산기 =====");
			System.out.print("첫 번째 정수 : ");
			int num1 = Integer.parseInt(sc.next());

			System.out.print("두 번째 정수 : ");
			int num2 = Integer.parseInt(sc.next());

			System.out.print("연산자(+, -, X, /) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			int result = 0;

			switch (ch) {
			case '+':
				result = num1 + num2;
				System.out.printf("%d + %d = %d\n", num1, num2, result); key = true;
				break;
			case '-':
				result = num1 - num2;
				System.out.printf("%d - %d = %d\n", num1, num2, result); key = true;
				break;

			case 'X':
			case '*':
				result = num1 * num2;
				System.out.printf("%d X %d = %d\n", num1, num2, result); key = true;
				break;

			case '/':
				if (num2 == 0) {
					System.out.println("0 으로 나눌 수 없습니다.");
				} else {
					result = num1 / num2;
				}
				System.out.printf("%d / %d = %d\n", num1, num2, result); key = true;
				break;
			default:
				System.out.println("잘못 입력 하셨습니다. 다시 실행 합니다. \n"); key = false;
			}
		}
	}
	/*
	 키보드로 정수 두 개를 입력 받아 두 정수 중 작은 값을 시작 값으로 큰 값을 종료 값으로 사용 작은 값에서 큰 값까지 정수 합계를 구함
	 */
	public void totalCalculator() {
		System.out.println("\n===== 작은 수에서 큰 수 까지 합계 =====");
		System.out.print("첫 번쨰 정수 : ");
		int num1 = Integer.parseInt(sc.next());
		
		System.out.print("두 번쨰 정수 : ");
		int num2 = Integer.parseInt(sc.next());
		
		int max = num1 > num2 ? num1 : num2;
		int min = num1 < num2 ? num1 : num2;
		int result = 0;
		
		for(int i = min; i <= max; i++) {
			result += i;
		}
		System.out.printf("%d 부터 %d 까지 정수들의 합 : %d\n", min,max,result);
	}
	
	/*
	 * 신상 정보들을 자료형에 맞춰 변수에 기록하고 변수에 기록된 값 출력
	 */
	public void printProfile() {
		System.out.println();
		System.out.println("===== 신상 정보 확인 =====");

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.next());

		System.out.print("성별(한글 영어 다 가능) : ");
		String sex = sc.next().toUpperCase();

		System.out.print("성격 : ");
		String character = sc.next();

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		switch (sex) {
		case "남":
		case "남자":
		case "M":
			System.out.println("성별 : 남자");
			break;
		case "여":
		case "여자":
		case "F":
			System.out.println("성별 : 여자");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}
		System.out.println("성격 : " + character);
	}
	
	/*
	 키보드로 입력 받은 값들을 변수에 기록하여 변수 값을 화면에 출력 점수가 90점 이상이면 A학점,
	 80이상 90미만이면 B, 70이상 80미만이면 C, 60이상 70미만 D, 60미만 F학점을 매김
	 */
	public void printScore() {
		System.out.println("\n===== 학생 정보 확인 =====");
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = Integer.parseInt(sc.next());
		
		System.out.print("반 : ");
		int nClass = Integer.parseInt(sc.next());
		
		System.out.print("번 : ");
		int number = Integer.parseInt(sc.next());
		
		System.out.print("성별(M/F) : ");
		String sex = sc.next().toUpperCase();

		System.out.print("성적 : ");
		double rank = sc.nextDouble();
		char result = ' ';
		switch(sex) {
		case "남":
		case "남자":
		case "M":
			sex = "남학생";
			break;
		case "여":
		case "여자":
		case "F":
			sex = "여학생";
			break;
		default:
			sex = "잘못 입력 함";
			break;
		}
		switch((int)rank/10) {
		case 10:
		case 9:
			result = 'A'; break;
		case 8:
			result = 'B'; break;
		case 7:
			result = 'C'; break;
		case 6:
			result = 'D'; break;
			default : result = 'F'; break;
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %c학점입니다.\n",grade,nClass,number,sex,name,rank,result);
	}
	
	// 정수를 하나 입력 받아 그 수가 양수일 때만 입력된 수를 줄 수로 적용하여 아래와 같이 출력
	public void printStarNumber() {
		System.out.println("===== 별과 숫자 출력 =====");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.next());
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= i; j++) {
					if(j == i) {
						System.out.print(i);
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}else if(num == 0) {
			System.out.println("입력한 숫자는 0이라서 할게 없습니다.");
		}else {
			System.out.println("야수가 아닙니다.");
		}
	}
	// 1부터 100 사이의 정수 중 임의의 정수를 하나 발생시켜 1부터 랜덤 수까지의 합계 출력
	public void sumRandom() {
		System.out.println("===== 난수까지의 합계 ===== ");
		int random = (int)(Math.random() * 100 + 1);
		System.out.println(random);
		int i = 1;
		int sum = 0;
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.printf("while 문 : 1부터 %d까지의 합 : %d\n", random, sum);
		sum = 0;
		
		for(int num = 1; num <= random; num++) {
			sum += num;
		}
		System.out.printf("for 문 : 1부터 %d까지의 합 : %d\n", random, sum);
		
		System.out.println();
	}
	
	// 정수를 하나 입력 받아 그 수가 양수일 때만 그 수의 구구단 출력 단 곱하기 수가 입력 받은 단의 배수일 경우 출력 제외
	public void exceptGugu() {
		System.out.println("===== 구구단 =====");
		System.out.print("정수 : ");
		int dan = Integer.parseInt(sc.next());
		int result = 0;
		for(int i = 1; i < 10; i++) {
			if((i % dan) != 0) {
				result = dan * i;
				System.out.printf("for 문  %d X %d = %d\n",dan,i , result);
			}
		}
		int su = 1;
		result = 0;
		while(su < 10) {
			if(su % dan !=0) {
				result = su * dan;
				System.out.printf("while 문  %d X %d = %d\n",dan,su , result);
			}
			su++;
		}
		
	}
	
	/*
	두 개의 주사위가 만들어낼 수 있는 모든 경우의 수를 랜덤으로 정하고
	랜덤으로 정해진 두 주사위 눈의 합이 입력된 수와 같은 경우 “맞췄습니다“ 출력,
	입력 값과 다르면 “틀렸습니다“ 출력하여 맞출 때까지 반복
	값을 맞추면 “계속 하시겠습니까? (y/n) : “가 출력되고
	‘y’ 또는 ‘Y’ 입력 시 새로운 랜덤 수가 정해지고 처음부터 다시 시작, ‘n’ 또는 ‘N’ 입력 시 종료
	*/
	public void diceGame() {
		String answer = "";
		int random1 = 0;
		int random2 = 0;
		int result = 0;
		int sum = 0;
		do {
			if (answer.equals("Y") || answer.equals("")) {
				random1 = (int) (Math.random() * 6 + 1);
				random2 = (int) (Math.random() * 6 + 1);
				result = random1 + random2;
			}
			System.out.print("주사위 두개의 합을 맞춰보세요(1~12입력) : ");
			sum = Integer.parseInt(sc.next());

			if (result == sum) {
				System.out.println("정답입니다.");
				System.out.print("계속 하시겠습니까?(y/n) : ");
				answer = sc.next().toUpperCase();
				
				if(!answer.equals("Y") || !answer.equals("N")) {
				while(!(answer.equals("Y") || answer.equals("N"))) {
					System.out.println("잘못 입력 하셨습니다.");
					System.out.print("다시 입력 해주세요 : ");
					answer = sc.next().toUpperCase();
				}
				}				
			} else {
				System.out.println("틀렸습니다.");
				answer = "땡";
			}
		} while (!answer.equals("N") || answer.equals("Y"));
		System.out.println("종료합니다.");
	}
	

}
