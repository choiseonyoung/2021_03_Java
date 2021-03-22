package com.callor.controller;

import java.util.Random;

public class Controller_11 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		for(int i = 0; i < 5; i++) {
			int num = rnd.nextInt(100) + 1;
			if (num % 3 == 0) {
				System.out.println(num + "은(는) 3의 배수");
			} else {
				System.out.println(num + "은(는) 3의 배수 아님");
			}
		}

	}

}
