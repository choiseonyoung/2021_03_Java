package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1Ex;

public class Const_01 {

	public static void main(String[] args) {
		
		/*
		 * 인터페이스가 있는 클래스의 객체 생성
		 * = 클래스를 선언(작성)할 때 인터페이스를 impl 했다
		 * 
		 * 인터페이스를 사용하여 객체를 선언하고
		 * 구현체 클래스의 생성자를 호출하여 객체를 생성, 초기화 해야한다
		 * 
		 * 인터페이스는 생성자 메서드가 없다.
		 */
		ScoreService sService = new ScoreServiceImplV1Ex();
		
		/*
		 * List 인터페이스로 3개의 객체를 선언하고
		 * 각각을 Array, Linked, Vector 클래스를 사용하여 생성하였다
		 * strList1, strList2, strList3는
		 * 각각 ArrayList, LinkedList, Vector type으로 데이터형이 다르다
		 * 
		 * 하지만 List interface type으로 선언되었기 때문에
		 * method 등의 연산을 공용으로 사용할 수 있다
		 * 
		 * 이러한 성질을 (클래스의)다형성 이라고 한다.
		 */
		List<String> strList1 = new ArrayList<String>();
		//제일 많이 쓰임. 수시로 데이터가 추가, 삭제되는 경우 굉장히 빠름.
		// 순서에 관계없이 무작위로 추가하고 중간에 빼버리기도 하고 그런 경우
		List<String> strList2 = new LinkedList<String>();
		// 정렬된 데이터들 쓸 때 빠름. 데이터가 순서대로 나열되어 있는 경우에 빠름.
		// 중간에 끼워넣거나 할 때는 겁나 느림
		List<String> strList3 = new Vector<>();
		// 실무에선 거의 안 씀. 셋 중 제일 느려서
		// 특별한 자료형을 써야 할 게 있음 ex) 게임. 캐릭터가 엄청 움직여서
		
		strList1.add("대한민국");
		strList1.add("우리나라");
		
		strList2.add("3 * 4");
		strList2.add("3 / 4");
		
		strList3.add("홍길동");
		strList3.add("이몽룡");
		strList3.add("성춘향");
;		
		// 리스트에 저장된 내용을 출력하는 method 호출하기
		list(strList1);
		list(strList2);
		list(strList3);
	}

	// List의 내용 전체를 Console에 출력하기
	/*
	 * 매개변수 type을
	 * List interface type으로 선언한 method
	 * 
	 * 이 method는 List interface의 자손인
	 * ArrayList, LinkedList, Vector 클래스로 생성된 객체를 매개변수로 받아 연산을 수행할 수 있다.
	 * 
	 * 즉, 한개의 method로 다수 type의 값들을 연산 수행할 수 있다
	 */
	public static void list(List<String> strList) {
		
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(strList.get(i));
		}
		
	}
	
}
