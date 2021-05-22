package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Homepage obj = new Homepage();
		obj.username = "smarttech";
		obj.password = "smarttech123";
		obj.button = "clickit";
		obj.forsale = "forsale";
		obj.homeforsale();
		
		Registration rj = new Registration();
		rj.business = 2;
		rj.businessregistration();
	}
	
	
	
	
	

}
