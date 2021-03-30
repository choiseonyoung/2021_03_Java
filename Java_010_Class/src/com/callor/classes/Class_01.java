package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int r = rnd.nextInt(51) + 50;
		int nCount;
		
		System.out.printf("생성된 난수 : %d\n", r);
		
		nCount = 0;
		for(int i = 2; i < r ; i++ ) {
			if ( r % i == 0 ) {
				nCount++;
			}
		}
		
		System.out.println("약수의 개수 : " + nCount);
		
		int[] ran = new int[nCount];
		
		int index = 0;
		for(int i = 2; i < r ; i++ ) {
			if ( r % i == 0 ) {
				ran[index++] = i;
			}
		}
		
		System.out.println(Arrays.toString(ran));
		
	}
	
}
