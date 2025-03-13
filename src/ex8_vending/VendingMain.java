package ex8_vending;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		
		// insert coin : (키보드에서 입력) 1000
		// fanta - 1000
		// orange - 800
		// coke -900
		
		// >> coke을(를) 선택했습니다.
		// 100원이 반환됩니다.
		
		
		// can 클래스 -> 음료수 관리(배열에 이름과 가격 저장)
		// 먹을 수 있는 음료수 판단 후 해당 음료수 목록만 출력
		// 선택한 음료수 주고 잔돈 반환
		
		
		// 돈 입력
		
		Scanner sc = new Scanner(System.in); 
		
		Vending ven = new Vending();
		ven.init();      // 음료 목록 초기화 클래스 실행
		
		System.out.println("insert coin : ");
		int money = sc.nextInt();     // 사용자 금액 입력
		
		ven.showDrink( money );  // 먹을 수 있는 음료 목록 출력 클래스 실행
		
		System.out.println(">> ");
		String select = sc.next();  // 먹고 싶은 음료수 선택
		
		ven.outDrink(select);   // 선택한 음료수 제공 및 잔돈 반환 클래스 실행
		
		
		
		
		
		
		
	} // main

}
