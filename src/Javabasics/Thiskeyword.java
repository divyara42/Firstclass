package Javabasics;

public class Thiskeyword {

	  // This keyword is used when ever we have confusion between local variable and global variable OR
	   // Class variable and method variable 
	  // It refers to current reference of class 
	   int age;
	   public Thiskeyword(int age) {
		   this.age =age;
		   System.out.println("I am in parameterized Constructor: "+ age);
	   }
	public static void main(String[] args) {
		Thiskeyword TK = new Thiskeyword(32);
      
	}

}
