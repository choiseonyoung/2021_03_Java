package com.callor.var;

public class Variable_14 {

	public static void main(String[] args) {
		
		int intSum = 0, intNum = 7;
		
		intSum += (intNum += 2);
		intSum += (intNum += 5);
		intSum += (intNum += 2);
		System.out.printf("Sum:%d, Num:%d", intSum, intNum);

	}

}
