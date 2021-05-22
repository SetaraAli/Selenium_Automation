package abstraction;

public class ImplementInterface implements MyInterface{
	
public static void main(String[] args) {
	
	ImplementInterface obj = new ImplementInterface();
	obj.getUID();
	obj.typePW();
	obj.clickSubmit();
	
	
}
	
	
	@Override
	public void getUID() {
    System.out.println("startech");
		
	}

	@Override
	public void typePW() {
		
		 System.out.println("password123");
	}

	@Override
	public void clickSubmit() {
		
		 System.out.println("click submit");
	}

}
