package com.callor.var;

public class Variable_05 {

	public static void main(String[] args) {
	
		int intNum = 1;
		int intSum = 0;
		
		intSum += intNum; // 1
		
		intNum ++; // 2
		intSum += intNum; // inSum = 1 + 2
		
		intNum ++;
		intSum += intNum;
	}

}
