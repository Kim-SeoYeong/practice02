package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//price >= 0 , price <= 1000 tax = 0.09 * price
		//price > 1000, price <= 4000 tax = 1000*0.09+0.18*(수익-1000)
		//price > 4000, price < 8000 tax = 1000*0.09+3000*0.18+0.27*(price-4000)
		//price >= 8000 tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(price-8000)
		double tax;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해주세요.");
		System.out.print("금익 : ");
		int price = sc.nextInt();
		
		if ((price >= 0) && (price <= 1000)) {
			tax = 0.09 * price;
			System.out.println("소득세는 " + (float)tax);
		} else if ((price > 1000) && (price <= 4000)) {
			tax = 1000 * 0.09 + 0.18 * (price - 1000);
			System.out.println("소득세는 " + (float)tax);
		} else if ((price > 4000) && (price < 8000)) {
			tax = 1000 * 0.09 + 3000 * 0.18 + 0.27 * (price - 4000);
			System.out.println("소득세는 " + (float)tax);
		} else if (price >= 8000) {
			tax = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (price - 8000);
			System.out.println("소득세는 " + (float)tax);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
