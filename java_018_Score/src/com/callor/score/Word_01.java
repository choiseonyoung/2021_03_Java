package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {

	public static void main(String[] args) {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		String fileName = "src/com/callor/score/word.txt";
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			System.out.println("=".repeat(50));
			while( (reader = buffer.readLine()) != null) {
				String words[] = reader.split(":");
				System.out.printf("%s  %s\n", words[0], words[1]);
			}
			System.out.println("=".repeat(50));
			buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는동안 문제 발생");
		}
		
	}

}
