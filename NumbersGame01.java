import java.util.*;
class NumbersGame01 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			int[] a=new int[n];
			
			for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			}
			int greatest=a[0];
			for(int i=1;i<n;i++){
				if(a[i]>greatest){
				greatest=a[i];
				}
			}
			System.out.println(greatest);
	}
}