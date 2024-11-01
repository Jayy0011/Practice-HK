class RectangleTest {
		private double length;
		private double breadth;
		
		public double getLength(){
			return length;
		} 
		public double getBreadth(){
			return breadth;
		} 
		public void setLength(double l){
		 if(l>0){
			length=l;
			
		 }else{
			length=0;
		 }
		}
		
		public void setBreadth(double b){
		  if(b>0){
			breadth=b;
			
		  }else{
			breadth=0;
		  }
		}
		public double area(){
			return length*breadth;
		}
}
	
	public class Rectangle{
	  public static void main(String[] args) {
		 RectangleTest r=new RectangleTest();
		 
		 r.setLength(10.5);
		 r.setBreadth(5.5);
		 
		 System.out.println("Area"+r.area());
		 System.out.println("Length"+r.getLength());
		 System.out.println("Breadth"+r.getBreadth());
	  }
    }