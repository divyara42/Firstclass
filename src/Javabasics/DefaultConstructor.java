package Javabasics;

public class DefaultConstructor {
     
	int a ;    // integer value is 0
	boolean b;  // boolean value is false 
	
	public DefaultConstructor() {
		
	}
	public static void main(String[] args) {
		DefaultConstructor DC = new DefaultConstructor();
		System.out.println("a = " + DC.a);
		System.out.println("b = " + DC.b); 
	}

}
