package com.callor.app.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);

		String fileName = "src/com/callor/app/mydata.txt";

		// 2개의 난수로 4칙연산을 수행
		// 뺄샘과 나눗셈은 반드시 큰 수 - 작은 수, 큰 수 / 작은 수
		if(num1<num2)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int sum = num1 + num2;
		int minus = num1 - num2;
		int times = num1 * num2;
		int div = num1 / num2;

		FileWriter fileWriter = null;
		PrintWriter out = null;try
		{
			// FileWriter 클래스의 객체만으로도 파일에 기록할 수 있지만
			// 상당히 복잡하고 불편한 코드를 만들어야 한다
			// (그래서) PrintWriter 클래스의 객체를
			// FileWriter 클래스의 객체와 연결하여
			// System.out의 print 관련 method와 똑같은 방법으로 파일에 Text들을 저장한다.

			// OS <-> FileWriter <-> PrintWriter가 서로 연결되어 데이터를 파일에 기록한다
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);

			out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			out.printf("%d / %d = %d\n", num1, num2, num1 / num2);

			out.flush();
			out.close();
			
			// PrintWriter를 닫으면 FileWriter도 같이 닫히기 때문에 일부러 close하지 않아도 무방하다
			fileWriter.close();
			
			System.out.println("작업 완료");

		}catch(IOException e) {
			System.out.println(fileName + "파일을 생성할 수 없음");
		}
		
	}

	

}
