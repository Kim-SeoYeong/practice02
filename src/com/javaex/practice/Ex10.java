package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A팀, B팀, C팀으로 구성
		//사번을 3으로 나눠 나머지 0=>A팀, 1=>B팀, 2=>C팀
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번 : ");
		int num = sc.nextInt();
		
		if (num%3 == 0) {
			System.out.println("A팀 입니다.");
		} else if (num%3 == 1) {
			System.out.println("B팀 입니다.");
		} else if (num%3 == 2) {
			System.out.println("C팀 입니다.");
		} else {
			System.out.println("잘못입력하셨습니다. 사번을 확인해주세요.");
		}
		
		sc.close();
	}

}
