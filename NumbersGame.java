import java.util.*;
class NumbersGame 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
			
			int[] a=new int[3];
			
			for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
			}
			int greatest=a[0];
			if(a[1]>greatest){
			 greatest=a[1];
			}
			if(a[2]>greatest){
				greatest=a[2];
			}
			System.out.println(greatest);
	}
}
