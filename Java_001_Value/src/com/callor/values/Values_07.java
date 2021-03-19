package com.callor.values;

public class Values_07 {

	public static void main(String[] args) {
		/*
		 * 어떤 수를 3으로 나눈 나머지가 0이면 그 어떤 수는 당연히 3의 배수이다
		 * 하지만, 나머지가 0이 아닌 경우는 정확히 이러한 값이다 라고 표현하기가 어렵다
		 * 즉, 결정하기가 어렵다
		 * 정확히 결정된 값(3의 배수)이 아니다 라고 표현
		 */
		System.out.println((33 % 3) == 0 ? "3의 배수" : "3의 배수가 아니다");

		/*
		 * 이론적으로는 맞는 코드이지만,
		 * 논리적으로 어떤 값을 찾고자할 때 불확실성이 포함된 코드는 가급적 사용하지 않는 것이 좋다
		 * 불확실성이 내재된 코드
		 * == 프로젝트의 중요한 부분에서 틀린 결과가 포함될 수 있다. (이런 코드는 지양)
		 */
		System.out.println( (33 % 3 ) > 0 ? "3의 배수가 아니다" : "3의 배수");
	}

}
