package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영문 소문자 이외의 입력값은 고려하지 않음.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳 : ");
		String alpha = sc.nextLine();
		
		switch (alpha) {
		case "a" :
		case "e" :
		case "i" :
		case "o" :
		case "u" :
			System.out.println("모음입니다.");
			break;
		case "b" :
		case "c" :
		case "d" :
		case "f" :
		case "g" :
		case "h" :
		case "j" :
		case "k" :
		case "l" :
		case "m" :
		case "n" :
		case "p" :
		case "q" :
		case "r" :
		case "s" :
		case "t" :
		case "v" :
		case "w" :
		case "x" :
		case "y" :
		case "z" :
			System.out.println("자음입니다.");
			break;
		default :
			System.out.println("잘못된 입력값 입니다.");
			break;
		}
		
		sc.close();
	}

}
