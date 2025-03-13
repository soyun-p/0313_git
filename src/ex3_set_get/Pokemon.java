package ex3_set_get;

public class Pokemon {
	
	private String attri = "전기";
	private String name = "피카츄";
	
	// attri 바꾸기 위한 세터
	public void setAttri( String a ) {
		// attri = a;
		this.attri = attri;
		
	} // setAttri()
	
	public String getAttri() {
		return attri;
		
	} // getAttri()
	
	
	public void setName( String name ) {
		// name = name;  :  변수 이름이 똑같으면 지역변수 우선이라서 맨 위 private name으로 간주하기 때문에 변수 구별이 어려워진다.
		// 이때 사용하는 것이 this 이다.
		this.name = name;  // this.name ==> 가장 가까운 클래스의 name을 의미.
		
	} // setName()
	
	
	public String getName() {
		return name;
		
	} // getName()

}
