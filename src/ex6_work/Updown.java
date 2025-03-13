package ex6_work;

import java.util.Random;

public class Updown {
	private int random = new Random().nextInt(50) + 1;
	private int count = 0;
		
	public boolean result = false;
	
	public boolean check( int n ) {
		count++;
		
		if( n < random ) {
			System.out.println("UP!!");
		}else if( n > random ) {
			System.out.println("DOWN!!");
	    }else {
	    	System.out.println(count + "회만에 정답!!");
	    	result = true; // 이때 while문 멈추고 빠져나온다.
	    }
		
		return result;
		
			
	
	
		
	} // 

}
