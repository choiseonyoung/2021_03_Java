package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.service.ScoreService;
import com.csy.standard.InputService;
import com.csy.standard.MenuService;
import com.csy.standard.impl.InputServiceImplV1;
import com.csy.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	Scanner scan;
	protected MenuService menuService;
	protected InputService inService;
	
	public ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
		menuService = new MenuServiceImplV1(null, null);
	}
	
	
	
	@Override
	public void selectMenu() {
		String title = "대한 고등학교 성적 처리 시스템 2021";
		List<String> menuList = new ArrayList<String>();
		menuList.add("학생 정보 등록");
		menuList.add("성적 등록");
		menuList.add("성적 정보 열기");
		menuList.add("성적 정보 저장");
		menuList.add("성적 정보 출력");
		
		menuService = new MenuServiceImplV1(title, menuList);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				return;
			}
			if(menu == 1) {
				
			} else if (menu == 2) {
				inputScore();
			} else if (menu == 3) {
				readScore();
			} else if (menu == 4) {
				saveScore();
			} else if (menu == 5) {
				printScore();
			}
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

}
