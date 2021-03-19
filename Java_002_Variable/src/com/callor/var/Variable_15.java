package com.callor.var;

public class Variable_15 {

	public static void main(String[] args) {
		
		int intSum = 0, intNum = 0;

		
		/*
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		intSum += ((((++intNum)%2)==0) ? intNum : 0);
		*/
		
		
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		
		System.out.println(intSum);
	}

}
