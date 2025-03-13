package ex3_set_get;

public class PokeMain {
	public static void main(String[] args) {
		
		Pokemon p1 = new Pokemon();
		p1.setAttri("전기");
		System.out.println(p1.getAttri());
		
		
		Pokemon p2 = new Pokemon();
		p2.setName("피카츄");
		System.out.println(p1.getAttri());
		System.out.println(p1.getName());
		
		
	} // main

}
