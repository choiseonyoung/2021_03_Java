package com.callor.app;

import com.callor.app.service.InputServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {

		InputServiceV1 inService = new InputServiceV1();
		
		inService.inputValue("치킨", 0, 10000);

	}

}
