class  VarShadow1{

	int x = 10;
	int y = 20;

	void m1(int a, int b){
		x = a;
		y = b;
	}

	void m2(int x, int y){
		x = x;
		y = y;
	}

	void m3(int x, int y){
		this.x = x;
		this.y = y;
	}

	
	public static void main(String[] args) {
		
		VarShadow1 t1 =new VarShadow1();
		System.out.println(t1.x + "..."+t1.y);

		t1.m1(30, 40);
		System.out.println(t1.x + "..."+t1.y);
		
		t1.m2(50, 60);
		System.out.println(t1.x + "..."+t1.y);
		
		t1.m3(70, 80);
		System.out.println(t1.x + "..."+t1.y);
	}
}
