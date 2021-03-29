package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	// NullPointerException
	// JDK 또는 여러가지 클래스를 가져와 사용하는 경우 매우 자주 만나는 Exception
	// 클래스를 사용하여 객체를 "선언만" 아직 사용할 준비가 되어있지 않다
	// 사용할 준비가 되어있지 않다 == 생성, 초기화가 안되었다.
	Scanner scan;
	
	int[] kor;
	int[] eng;
	int[] math;
	int[] sum;
	float[] avg;

	// Service 클래스에서 배열의 개수를 고정하지 말고
	// 최초로 객체를 생성할 때 필요한 개수를 매개변수로 전달하고
	// 전달받은 매개변수(members)의 값을 사용하여 배열을 만들자
	public ScoreServiceV1(int members) {
		// scan 객체를 생성(초기화)하기
		// 객체를 선언하고 생성하는 코드가 없으면 사용하는 과정에서 NullpointerException이 발생
		scan = new Scanner(System.in);
		kor = new int[members];
		eng = new int[members];
		math = new int[members];
		sum = new int[members];
		avg = new float[members];
	}

	public void makeScores() {
		// 무한 반복문을 사용하여 국어점수가 0 ~ 100 범위를 벗어나면
		// 메시지를 보여주고 다시 정수를 입력받도록 한다
		// 만약 정상적인 범위(0 ~ 100)을 입력하면
		// 반복문을 종료하고, 다음 코드가 실행되도록 한다
		while(true) {
			System.out.println("국어점수를 입력하세요( 0 ~ 100 )");
			System.out.println(">> ");
			int score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println();
			} else {
				break;
			}
		}
	}
		
	// public : 전체, 공룔, 모두, 누구나
	// 객체.addNum() 형식으로 method를 호출하여 명령을 실행할 수 있도록 하는 Keyword
	public void addNum() {
		this.inputScore();
		
		// 현재 method 코드의 끝이다 라는 선언
		// method 선언 키워드가 void 이면 return 명령을 생략할 수 있다.
		return;
	}
	// private : 개인적인, 현재 클래스에서만 method를 호출하여 명령을 실행할 수 있도록 하는 Keyword
	// 객체.inputScore() 형식으로 사용 불가
	// 외부에 공개하지 않고, 현재클래스의 코드에서만 호출할 수 있도록 제한하는 Keyword
	// Integer : void keyword 대신 정수를 선언하는 키워드를 사용하여 method 선언하기
	// method 코드 끝에 반드시 return 명령문이 있어야 한다
	
	// 여기에서 사용된 Integer 키워드는 변수를 선언하는 용도의 키워드가 아니고
	// return type 키워드라고 한다.
	// method의 코드내에 "return 값;" 형식의 코드가 반드시 있어야 함을 선언하는 것
	
	// return type이 void 형(type)일 경우는
	// return 명령문이 생략되거나 return 명령문만 단독으로 사용할 수 있다
	
	// return type이 void 형이 아닌 경우
	// return 명령문은 반드시 코드내에 적절한 위치에 있어야 하고
	// return 값 형식으로 사용해야 한다.
	private Integer inputScore() {
			return null;
	}
	
	public String names() {
		return "홍길동"; // return "";
	}
	public int add() {
		return 0;
	}
	public float addFloat() {
		return 0.0f;
	}
	public long addLong() {
		return 0;
	}
	public boolean yesNo() {
		return false;
	}
	public boolean noYes() {
		return true;
	}
		/* System.out.println("0 ~ 100점 성적을 입력하세요");
		for (int i = 0; i < kor.length; i++) {
			System.out.printf("%d번 학생\n", i + 1);
			
			System.out.print("국어 >> ");
			kor[i] = scan.nextInt();
			while (kor[i] < 0 || kor[i] > 100) {
				System.out.println("0 ~ 100 사이의 값을 입력하세요");
				kor[i] = scan.nextInt();
				if ( kor[i] >= 0 && kor[i] <= 100 ) {
					break;
				}
			}
			
			System.out.print("영어 >> ");
			eng[i] = scan.nextInt();
			while (eng[i] < 0 || eng[i] > 100) {
				System.out.println("0 ~ 100 사이의 값을 입력하세요");
				eng[i] = scan.nextInt();
				if ( eng[i] >= 0 && eng[i] <= 100 ) {
					break;
				}
			}
			
			System.out.print("수학 >> ");
			math[i] = scan.nextInt();
			while (math[i] < 0 || math[i] > 100) {
				System.out.println("0 ~ 100 사이의 값을 입력하세요");
				math[i] = scan.nextInt();
				if ( math[i] >= 0 && math[i] <= 100 ) {
					break;
				}
			}
		} 
	} */

	public void sum() {
		for (int i = 0; i < kor.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
		}
	}

	public void avg() {
		for (int i = 0; i < kor.length; i++) {
			avg[i] = ((float) sum[i] / 3);
		}
	}

	public void list() {
		System.out.println(LinesService.dLines(50));
		System.out.println("\t\t 성적 리스트");
		System.out.println(LinesService.sLines(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < kor.length; i++) {
			System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", i + 1, kor[i], eng[i], math[i], sum[i], avg[i]);
		}
		System.out.println(LinesService.dLines(50));
	}

}
