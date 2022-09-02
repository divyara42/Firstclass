package Javabasics;

public class MethodOverloading {
	// Method Overloading 
			//1. Method name should be same
			//2. Methods should be in same class 
			// 1.1 Parameters should different 
			 //  1.2 Count of parameters are not same OR 
			 //  1.3 position of parameters should be different  
	
	public void method1() {
		System.out.println("No paramethor method");
	}
	public void method1(int a) {
		System.out.println("one integer paramaeter: " +a );
	}
	public void method1(String rani) {
		System.out.println("one String parameter: " + rani);
	}
	public void method1(String rani , int c) {
		System.out.println("one String and one Integer:"  + rani + " " + c);
	}
	public void method1(int rani, String c) {
		System.out.println("one Integer and one String:"  + rani + " " + c);
	}
	
	 public void add(int a , int c) {
		System.out.println(a+c); 
	 }
     public void add(int a, int c, int rani) {
    	 System.out.println(a+rani+c);
		 
	 }
			
	public static void main(String[] args) {
				
       MethodOverloading mol = new MethodOverloading();
       mol.add(2, 6);
       mol.add(2, 3, 6);
       mol.method1();
       mol.method1("sudha");
       mol.method1(3);
       mol.method1(4, "sudha");
       mol.method1("sudha", 8);
       
       
       
	}

}
