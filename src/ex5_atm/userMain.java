package ex5_atm;

import java.util.Scanner;

public class userMain {
	public static void main(String[] args) {
		
		// 1. 입  금
		// 2. 출  금
		// 3. 잔액확인
		// etc. 종료
		
		// >> 1
		// --- 입금 ---
		// 입금액 : 1000 (키보드)
		// 입급성공
		// -----------
		// 다시 메뉴 화면으로//>> 3
		// 잔액 : 1000
		// -----------
		// >> 2
		
		
		Scanner sc = new Scanner(System.in);
		
		Atm atm = new Atm();
		
		int choice;
		 
		
		while( true ) {
			
			System.out.println("1. 입  금");
		    System.out.println("2. 출  금");
		    System.out.println("3. 잔액확인");
		    System.out.println("etc. 종료");
		    System.out.print(">> ");
			
		    int select = sc.nextInt();
			
			
		    switch( select ) {
		    case 1: // 입금
		    	System.out.print("입금액 : ");
			    atm.deposit(sc.nextInt());
			    break;
			
		    case 2: // 출금
		    	System.out.println("---출금---");
			    System.out.print("출금액 : ");
			    int money = atm.withdraw( sc.nextInt() );
			    break;
			
		    case 3:  // 잔액
		    	System.out.println( "잔액 : " + atm.balance() );
			    break;
			
		    default:
			    System.out.println("종료합니다.");
			    return;
			    // void도 리턴 쓸 수 있으나, 특정 값을 반환하는 목적이 아니고 메인 메서드를 강제로 종료할 때 사용.
			    
		    } // switch
		    
		    System.out.println("-----------");
		    
		} // while
		
		
		
		
		
		
		
	} // main

}
