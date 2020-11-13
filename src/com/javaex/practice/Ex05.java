package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키 : ");
		float height = sc.nextFloat();
		System.out.print("몸무게 : ");
		float kg = sc.nextFloat();	
		
		float result = (height-100) * 0.9f;
		
		if (kg>result) {
			System.out.println("과체중입니다.");
		} else if (kg == result) {
			System.out.println("표준체중입니다.");
		} else if (kg<result) {
			System.out.println("저체중입니다.");
		}
		
		System.out.println("표준체중 : " + result);
		sc.close();
	}

}
