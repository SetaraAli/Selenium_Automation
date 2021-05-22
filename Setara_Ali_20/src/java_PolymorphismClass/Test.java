package java_PolymorphismClass;

public class Test {

	public static void main(String[] args) {
		
		Country obj = new Country();
		obj.getAddress();
		
		 obj = new State();
		 obj.getAddress();
		
		obj = new City();
		obj.getAddress();
	}
}
