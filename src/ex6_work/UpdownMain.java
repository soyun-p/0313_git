package ex6_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {  // class A
	public static void main(String[] args) {
		// 1~50 사이의 난수를 발생시켜 Up, Down 체크하기
	    // 단, 값을 입력받는 클래스는 A 클래스. 정답 맞히고 프로그램 종료하는 클래스도 A.
	    // 입력받은 값이 Up인지 Down인지 판단하는 클래스는 B.
	
	    // 입력 : 30
	    // Down
	    // 입력 : 15
	    // Up   -> 맞출 때까지 반복
	    // 입력 : 25
	    // 3회만에 정답
		
		
		Scanner sc = new Scanner(System.in);
		Updown upd = new Updown();
		
		while( true ) {
			System.out.print("입력 : ");
		    int sel = sc.nextInt();
		    
		    boolean res = upd.check(sel);
		    
		    /*
		      if( !res ) { // res == false
		      // 
		      
		      }
		     */
		    
		    if( res ) { // res == true
		    	break;   // result == true 일 때 종료	
		    } // if
		    
		} // while
		
		
	
	} // main
	
	
	
	
	

}
