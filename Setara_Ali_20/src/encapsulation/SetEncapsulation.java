package encapsulation;

class SetEncapsulation {
	
	public static void main(String[] args) {
		
		GetCapsulation obj = new GetCapsulation();
		obj.getA();
		obj.getB();
		obj.getC();
		
		obj.setA(100000);
		obj.setB(20000);
		obj.setC(25000.50);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
	}

}
