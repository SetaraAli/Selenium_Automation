package Java_Inheritance;

public class TestClass {
	
public static void main(String[] args) {
	
	ClassTwo obj = new ClassTwo();
     obj.Father = "Mr. Haque";  
	 obj.Mother = "Mrs. Haque";
	 obj.District = "Khulna"; 
	 obj.MyName = "SixStar";
	 obj.GetLearnerPermit();
	 
	 ClassThree sad = new ClassThree();
	 sad.BrotherAge = 29;
	 sad.GetAge();
	
}
}
