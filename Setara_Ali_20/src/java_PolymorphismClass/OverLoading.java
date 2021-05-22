package java_PolymorphismClass;



public class OverLoading {
	
	void employe() {
		
	}
		
		void employe(int i) {
			
	}
		public static void main(String[] args) {
			OverLoading ovd = new OverLoading();
			ovd.employe();
			System.out.println("I have business");
			ovd.employe(1);
			System.out.println("I lost my business:"+1);
		}

}
