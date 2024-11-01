/**
* This is instace of object
* It is an user defined Datatype 
* This class is a blueprint 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Console;
import java.util.Scanner;
class  Company1
{
	public static void main(String[] args) throws IOException
	{
		Console cns		  = System.console();
		System.out.print("Enter Username : ");
		String usn  = cns.readLine();
		
		System.out.print("Enter Password : ");
		String pwd = new String(cns.readPassword());
		
		if(usn.equalsIgnoreCase("HK")&& pwd.equals("NiT"))
			{
		Employee e1  =  new Employee();
		
		Scanner scn		  = new Scanner(System.in);
		
		/** 
		* int Flatno;
		 String Location;
		String Lane;
		int Pincode;
		String NearestPlace;
		*/
		
		
		System.out.print("Enter Eno : ");
		e1.eno				=scn.nextInt(); scn.nextLine();
		
		System.out.print("Enter Ename : ");
		e1.ename			=scn.nextLine(); 
		
		System.out.print("Enter dept : ");
		e1.dept				= scn.nextLine();
		
		System.out.print("Enter Salary : ");
		e1.salary			= scn.nextDouble();
		
		System.out.print("Enter mobile : ");
		e1.mobile			= scn.nextLong(); scn.nextLine(); 
		
		System.out.print("Enter email : ");
		e1.email			= scn.nextLine();
		
		System.out.print("Enter Address :");
		e1.A1.Flatno		 = scn.nextInt(); scn.nextLine();
		e1.A1.NearestPlace	 = scn.nextLine();
		e1.A1.Lane			 = scn.nextLine();
		e1.A1.Location		 = scn.nextLine(); 
		e1.A1.Pincode		 = scn.nextInt(); scn.nextLine();
		
		System.out.print("Enter Gender :");
		e1.gender			= scn.next().charAt(0);
		
		System.out.print("Enter Working Status :");
		e1.workingStatus	= scn.nextBoolean();
		
		System.out.println("The Employee Values are :");
		System.out.println("   Eno\t\t\t :"+			e1.eno);
		System.out.println("   Ename\t\t :"+			e1.ename);
		System.out.println("   Dept  \t\t :"+			e1.dept);
		System.out.println("   Salary\t\t :"+			e1.salary);
		System.out.println("   Mobile\t\t :"+			e1.mobile);
		System.out.println("   E-mail\t\t :"+			e1.email);
		System.out.println("   Address\t\t :"+          e1.A1.Flatno +","+ e1.A1.NearestPlace+"," 
														+ e1.A1.Lane+","+ e1.A1.Location+"," + e1.A1.Pincode );
		System.out.println("   Gender\t\t :"+			e1.gender);
		System.out.println("   Working Status\t :"+ (e1.workingStatus ? "Working": "NotWorking"));
	}else{
		System.out.println("Invalid Username and Password");
	}
	}
}
