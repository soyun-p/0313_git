package ex2_set_get;

public class Computer {
	
	private String company = "sany";
	int ssd = 512;
	int ram = 32;
	
	public void setCompany( String com ) {
		
		company =  com;
		
	} // setCompany()
	
	
	public String getCompany() {
		return company;
	} // getCompany()

}
