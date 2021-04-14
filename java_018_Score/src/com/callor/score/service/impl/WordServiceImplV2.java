package com.callor.score.service.impl;

import java.util.Arrays;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV2 extends WordServiceImplV1 {

	@Override
	public void viewWord() {
		
		Random rnd = new Random();
		
		WordVO word = this.getWord();
		String strEng = word.getEnglish();
		
		String[] strWords = strEng.split(""); // 알파벳 단위로 나뉘어서 배열에 담김
		
		int winCount = 0;
		int lossCount = 0;
		while(true) {
			for(int i = 0 ; i < 100 ; i++) {
				
				int index1 = rnd.nextInt(strWords.length);
				int index2 = rnd.nextInt(strWords.length);
				
				String temp = strWords[index1];
				strWords[index1] = strWords[index2];
				strWords[index2] = temp;
				
			}
			
			System.out.println("=".repeat(50));
			System.out.println(word.toString());
			System.out.println("-".repeat(50));
			System.out.println("다음 단어를 올바르게 배열하시오");
			System.out.println(Arrays.toString(strWords));
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			String strInput = scan.nextLine();
			
			if(strInput.equalsIgnoreCase(word.getEnglish())) {
				System.out.println("맞았습니다. 참 잘했어용");
				winCount++;
				System.out.println("=".repeat(50));
			} else {
				System.out.println("힌트 : " + word.getKorea());
				System.out.println("다시한번 생각해 보세요");
				lossCount++;
				System.out.println("=".repeat(50));
			}
			System.out.printf("지금까지 성공한 개수 : %d\n", winCount);
			System.out.printf("지금까지 실패한 개수 : %d\n", lossCount);
			
		}
		
	}
	
	
	
}
