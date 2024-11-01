class Student 
{
	private int sno;
	private String sname;
	
	void setSno(int sno){
		this.sno = sno;
	}
	int getSno(){
		return this.sno;
		}
	
	void setSname(String sname){
		this.sname=sname;
	}
	String getSname(){ 
		return this.sname;
		}
	
	void display(){
		System.out.println("Sno :"+ sno);
		System.out.println("Sname :"+ sname);
	}
}

class GetterSetter
{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setSno(101);
		s1.setSname("Jagan");
		
		s2.setSno(102);
		s2.setSname("Soumya");
		
		System.out.println(s1.getSno()+" "+ s1.getSname());
		System.out.println(s2.getSno()+" "+ s2.getSname());
		
		s1.setSno(103);
		s1.setSname("Jay");
		
		s2.setSno(104);
		s2.setSname("Suraj");
		
		s1.display();
		s2.display();
	}
}
