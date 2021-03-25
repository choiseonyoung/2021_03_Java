package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] num = new int[20];
		int j = 0;
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = rnd.nextInt(51)+50;
		}
		
		for(int i = 0 ; i < num.length; i++) {
			for (j = 2 ; j < num[i] ; j++) {
				if (num[i] % j == 0) {
					System.out.println("소수 아님");
					break;
				} else if ( j == num[i]-1 ) {
					System.out.printf("소수 %d\n", num[i]);
				}
			}
		}

	}

}
