package com.won.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import com.won.model.GoalVO;

public class TimeSet {

	public int[] goalTime(GoalVO goal) {

		LocalDateTime currentDay = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		SimpleDateFormat month = new SimpleDateFormat("MM");
		SimpleDateFormat day = new SimpleDateFormat("dd");

		String formatted = currentDay.format(formatter);

		int goalWaitDay; // 목표 달성까지
		int goalPrice; // 목표금액
		int currentCompletionPrice; // 현재 목표 달성금액
		int goalPrecent; // 목표 달성률

		Date goalDate = goal.getG_goalDate();

		String goalYear = year.format(goalDate);
		String goalMonth = month.format(goalDate);
		String goalDay = day.format(goalDate);

		LocalDateTime endDT = LocalDateTime.of(Integer.parseInt(goalYear), Integer.parseInt(goalMonth), Integer.parseInt(goalDay), 0, 0, 0); // 여기에 목표날짜 받아오기..

		Period diff = Period.between(currentDay.toLocalDate(), endDT.toLocalDate());

		goalWaitDay = diff.getYears() + diff.getMonths() + diff.getDays();
		goalPrice = goal.getG_goalAmount(); // 목표 금액 받아오기
		currentCompletionPrice = goal.getG_currentAmount(); // 현재 달성 금액 받아오기
		goalPrecent = (int) ((float) currentCompletionPrice / (float) goalPrice * 100);
		
		System.out.println(formatted + " 기준\n" + "목표 달성까지 " + goalWaitDay + "일\n" + "목표 금액 " + goalPrice + "원\n"
				+ "현재 달성 금액 " + currentCompletionPrice + "원\n" + "목표 달성률 " + goalPrecent + "%");
		
		int dayArr[] = {goalWaitDay,goalPrecent};
		
		return dayArr;
		

	}

}
