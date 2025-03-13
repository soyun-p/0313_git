package ex1_param;

public class ParamTest {
	
	public void paramInt( int n ) { 
	// n -> main에서 온 num 값을 n에 저장하여 paramInt클래스 내부에서 사용.
		
		System.out.println("정수 : " + ++n);
		
	} // paramInt()
	
	
	
	
	
	public void paramString( String s ) {
		
		s += "hello";
		System.out.println("문자열 : " + s);
		
	} // paramString()
	
	
	
	
	
	public void paramArr( int[] arr ) {
		
		arr[0] = 500;
		System.out.println("배열 : " + arr[0]);
		
	} // paramArr()
	
	

}
