package ex1_param;

public class ParamMain {
	public static void main(String[] args) {
		
		ParamTest pt = new ParamTest();
		
		
		int num = 100;
		
		// paramInt 클래스에 num을 파라미터로 보내서 n에 대입 후 해당 클래스 실행.
		pt.paramInt( num ); 
		
		
		System.out.println(num); 
		// 100 출력. paramInt 클래스를 실행한 게 아니라 원래 num 값을 출력??(질문)
		
		
		// void는 원본에 영향 주지 않음. 원본에 영향을 주려면 return 사용.
		
		String str = "홍길동";
		pt.paramString( str );
		System.out.println(str); // "홍길동" 출력.
		// String은 원래 객체이기 때문에, 원본의 복사본이 아니라 주소가 넘어간다.
		// String 이외의 객체를 파라미터로 보내면 메모리 주소가 넘어간다.
		
		
		int[] arr = {10};
		pt.paramArr(arr);
		System.out.println(arr[0]);  // 500출력.
		// 배열은 객체이기 때문에 파라미터로 넘어갈 때 원본의 복사본이 아니라 힙 메모리에 저장된 주소가 넘어간다.
		// 따라서 main에서 값을 바꾼 후에 출력하면 바뀐 대로 출력된다.
		
		
		
	} // main

}
