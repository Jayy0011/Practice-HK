class A {
	static int a;
	
	static void m1() {
		System.out.println("  SM m1 is executed");	
	}

	static void m2() {
		a = 10;	
	}

	public static void main(String[] args) {
		System.out.println("main start");
	//=====================================
		  A a1 = new A();
		  A a2 = null;
		  
      //calling SM in all 4 ways
		  m1();
		  A.m1();
		  a1.m1();
		  a2.m1();
	 //===============================
		 A a3 = new A();
		 A a4 = null;
		 
		 System.out.println(a1.a + " " + a2.a + " "+ a3.a + " " + a4.a);
		 
			a3.m2(); //calling SM by using one particular object
						//and modifying SV values
		 System.out.println(a1.a + " " + a2.a + " "+ a3.a + " " + a4.a);
		  
	 //=============================== 
		  
		System.out.println("main end");
	}

class B {
	int x;
	
	void m1() {
		System.out.println("  NSM m1 is executed");	
	}

	void m2() {
		x = 10;	
	}














	public static void main(String[] args) {
		System.out.println("main start");
			//m1();	CE:
			//B.m1();
			
			B b1 = new B();
			B b2 = new B();
			B b3 = null;
			
			b1.m1();	//executed for b1 object
			b2.m1();	//executed for b2 objct
			//b3.m1();	//no CE, leads RE: NPE
			
			System.out.println(b1.x + " " + b2.x);
			
				b1.m2(); //executed for only for b1 and 
						  //modifies x variable value in b1 object only
						  
			System.out.println(b1.x + " " + b2.x);
			
		System.out.println("main end");
	}
	

}