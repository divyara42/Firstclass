package Javabasics;

public class Constructor {
	
	  // Constructor name should same as a class name
	  // Constructor is helps you to create an object of a class
	 // Constructor can not have return value 
	// It is initialize the variables
	 // it is invoked at the time of object creation time.
	// It will take parameters.
	// Constructor has 3 types No-args Constructor,Default, parameterized constructor.
	public Constructor () {
		System.out.println(" I am in NO-Arg Constructor");
	}
	
	public Constructor (int a, int b) {
	  System.out.println("I am in Parameterized Constructor");	
	}

	public static void main(String[] args) {
		
      Constructor cd = new Constructor();
      Constructor cd2 = new Constructor(2, 4);
	}

}
