package ex8_vending;

public class Vending {
	private int insertMoney;
	
	private Can[] cans = new Can[5];
	private int money;  // private로 선언했지만, 세터를 이용해 값을 바꿀 수 있다.
	
	
	public Vending() {
		
		// 새로운 방식
		
		cans[0] = new Can( "fanta", 1000 );
		cans[1] = new Can( "cider", 1100 );
		cans[2] = new Can( "orange", 1200 );
		cans[3] = new Can( "banana", 1300 );
		cans[4] = new Can( "coke", 1400 );
		
	} // Vending() 생성자 
	
	
	// 음료 목록 초기화
	/*
	public void init() {
		
		/* for(int i = 0; i < cans.length; i++) {
			cans[i] = new Can(  );   // index별 음료수 이름을 저장할 공간 생성
		} // for
		
		cans[0].setName("fanta");
		cans[0].setPrice(1000);
		
		cans[1].setName("cider");
		cans[1].setPrice(1100);
		
		cans[2].setName("orange");
		cans[2].setPrice(1200);
		
		cans[3].setName("banan milk");
		cans[3].setPrice(1300);
		
		cans[4].setName("coke");
		cans[4].setPrice(1400);  // 배열에 음료수들의 이름과 가격 저장.  */
		
		
	// } // init() 
	
	
	
	// 사용자의 금액 확인 후 먹을 수 있는 음료수 목록만 출력
	public void showDrink( int money ) {
		
		this.money = money; // showDrink내의 money에 main 클래스 내부의 money를 저장.
		
		for(int i = 0; i < cans.length; i++) { 
			
			if( cans[i].getPrice() <= money ) { // 입력한 돈이 가격보다 많거나 같을 때
				System.out.printf( "%s - %d원\n", cans[i].getName(), cans[i].getPrice() );
				// 먹을 수 있는 음료수들 차례로 출력.
			} // if
			
		} // for
		
	} // showDrink()
	
	
	
	// 먹고 싶은 음료수를 제공하고 잔액 반환
    public void outDrink( String name ) {
    	
    	for(int i = 0; i < cans.length; i++) {
    		
    		if( cans[i].getName().equals(name) ) { // 배열 내에 있는 음료수 이름과 선택한 음료수 이름이 같을 때
    			System.out.println( cans[i].getName() + "을(를) 선택함" ); 
    			System.out.println("잔돈 : " + (money - cans[i].getPrice()) ); // 잔돈 : (입력한 돈 - 선택한 음료수(이름이 같은 배열 내의 음료수))
    			
    		} // if
    		
    	} // for
    	
    	
    } // outDrink()
	
	
	
	
	
	
	
	

}
