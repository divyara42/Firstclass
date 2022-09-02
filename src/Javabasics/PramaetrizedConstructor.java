package Javabasics;

public class PramaetrizedConstructor {

	
	 String fruits ;
	 
	 public PramaetrizedConstructor(String fru) {
		 fruits = fru;
		 System.out.println(fruits + " healthy Fruits");
	 }
	
	public static void main(String[] args) {
		PramaetrizedConstructor PC = new PramaetrizedConstructor("Apple");
		PramaetrizedConstructor pc2 = new PramaetrizedConstructor("Banana");
		PramaetrizedConstructor pc3 = new PramaetrizedConstructor("Orange");
		
		
		

	}

}
