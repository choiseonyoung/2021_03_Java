package com.callor.apps;

public class App_06 {

	public static void main(String[] args) {

		/* int money = 3723560;

		System.out.println("============================");
		System.out.println("급여수령액 : " + money);
		System.out.println("============================");

		System.out.printf("50,000 원권\t%2d매\n", money / 50000);
		System.out.printf("10,000 원권\t%2d매\n", (money % 50000) / 10000);
		System.out.printf(" 5,000 원권\t%2d매\n", ((money % 50000) % 10000) / 5000);
		System.out.printf(" 1,000 원권\t%2d매\n", (((money % 50000) % 10000) % 5000) / 1000);
		System.out.printf("   500 원권\t%2d매\n", ((((money % 50000) % 10000) % 5000) % 1000) / 500);
		System.out.printf("   100 원권\t%2d매\n", (((((money % 50000) % 10000) % 5000) % 1000) % 500) / 100);
		System.out.printf("    50 원권\t%2d매\n", ((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50);
		System.out.printf("    50 원권\t%2d매\n", (((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10);
		System.out.println("============================"); 
		*/

		/* 		
		int money = 3723560;

		System.out.println("============================");
		System.out.println("급여수령액 : " + money);
		System.out.println("============================");

		System.out.printf("50,000 원권\t%2d매\n", money / 50000);
		int m = money / 50000;
		money -= (m * 50000);
		System.out.printf("10,000 원권\t%2d매\n", money / 10000);
		money -= ((money/1000)*);
		System.out.printf(" 5,000 원권\t%2d매\n", ((money % 50000) % 10000) / 5000);
		System.out.printf(" 1,000 원권\t%2d매\n", (((money % 50000) % 10000) % 5000) / 1000);
		System.out.printf("   500 원권\t%2d매\n", ((((money % 50000) % 10000) % 5000) % 1000) / 500);
		System.out.printf("   100 원권\t%2d매\n", (((((money % 50000) % 10000) % 5000) % 1000) % 500) / 100);
		System.out.printf("    50 원권\t%2d매\n", ((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50);
		System.out.printf("    50 원권\t%2d매\n", (((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10);
		System.out.println("============================");

	}
	*/

		int nPay = 3_723_560; // 금액
		int nPaper = 50_000; // 최고액면가 화폐
		
		// 정수 = 정수 / 정수 : 소수점이하가 잘린다
		// 몫을 구하여 액면가액 만큼 개수를 계산
		int nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		
		// 액면가액만큼 개수를 구했으면
		// nPay에서 액면가액 금액만큼을 빼고 이후에 계산
		// 3723560 % 50000 => 5만원권 * 매수 만큼을 3723560에서 뺀 값이 된다.
		// nPay = nPay - (nPaper * nCount)
		// nPay = nPay % nPaper;
		nPay %= nPaper;
		nPaper /= 5;
		System.out.println(nPay);
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
	}
}
