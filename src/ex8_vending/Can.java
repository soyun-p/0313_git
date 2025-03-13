package ex8_vending;

public class Can { 
	
	// 음료수 관리(private로 선언한 음료수의 가격이나 이름을 세터, 게터로 새롭게 저장하고 그 값을 불러오기)
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	} // 새롭게 저장된 이름 출력, 불러오기

	public void setName(String name) {
		this.name = name;
	} // private로 선언된 이름에 새로운 이름 저장.

	public int getPrice() {
		return price;
	} // 새롭게 저장된 가격 출력, 불러오기

	public void setPrice(int price) {
		this.price = price; // setPrice클래스에 있는 price에 
	} // private으로 선언된 가격에 새로운 가격 저장.





}
