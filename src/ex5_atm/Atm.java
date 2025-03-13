package ex5_atm;

import java.util.Scanner;

public class Atm {
	
	private int money;  // 해당 변수를 바꾸지 않을 것이므로 private로 선언.
	
	
	// 입금 메서드
	public void deposit( int money ) {
		
		System.out.println("---입금---");	
		this.money += money;  // 입금 
		
		System.out.println("입금 성공!");
		
	} // inputMoney()
	
	
	
	
	// 출금 메서드 : 출금액을 반환액으로 간주.
	public int withdraw( int money ) {
		
		if( this.money - money < 0) { // 잔액 부족할 때
			System.out.println("잔액부족");
			return 0;	
		} // if
		
		this.money -= money; // 기존에 저장된 money에서 빼는 것.
		System.out.println("출금 성공!");
		return money;
		
	} // outputMoney()
	
	
	
	
	// 잔액 확인 메서드(잔액 값을 반환해야 하므로)
	public int balance() {
		return money;  // 헷갈릴 만한 money가 없기 때문에 this 사용하지 않아도 괜찮다.
		
	} // restMoney()

	
	
	
	
}
