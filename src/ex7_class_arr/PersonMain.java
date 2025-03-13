package ex7_class_arr;

public class PersonMain {
	public static void main(String[] args) {
		
		Person[] person = new Person[2]; // 2명의 사람 입력할 배열
		//person[0] = new Person();
		//person[1] = new Person();  // 이 작업이 있어야 배열 안에 Person클래스만 접근 가능하게 됨.
		
		// 그러나 이를 사람 수대로 반복하려면 너무 번거롭기 때문에 for문을 이용한다.
		
		// 클래스를 배열화하면 메모리 할당을 위한 주소만 배치 받기 때문에
		// 실제로 메모리 할당을 받으려면 각 인덱스별로 명시적 객체 생성을 수행해줘야 한다.
		for(int i = 0; i < person.length; i++) {
			person[i] = new Person();
		} // for
		
		
		person[0].setName("홍길동");  
		person[0].setAge(20);        // set~( ~ ) : 값 입력, 저장
		
		person[1].setName("박길동");
		person[1].setAge(22);        
		
		
		
		// 홍길동 / 20
		// 박길동 / 22
		
		for(int i = 0; i < person.length; i++) {
			// get~( ~ ) : 저장된 값 출력, 불러오기
			System.out.println( person[i].getName() + " / " + person[i].getAge() );	
		} // for
		
		
		
	} // main

}
