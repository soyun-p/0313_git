package ex2_set_get;

public class ComMain {
	public static void main(String[] args) {
		// String을 제외한 나머지 객체들은 
		
		Computer com1 = new Computer();
		// System.out.println(com1.company);
		System.out.println(com1.ssd);
		System.out.println(com1.ram);
		
		
		System.out.println("---------------------");
		
		
		Computer com2 = new Computer();
		com2.setCompany("ssony");
		com2.ssd = 1024;
		
		String ss = com2.getCompany();
		
		System.out.println(com2.ssd);
		System.out.println(com2.ram);
		// 용량이든 램이든 마음대로 바꿀 수 있지만 그러면 안되는 변수도 있다. 따라서 이에 주의하여 바뀌면 안되는 변수에 private 접근 제한자를 달아준다.
		
		
		
		
		
		
	} // main

}
