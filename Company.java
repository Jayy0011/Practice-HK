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
class  Company
{
	public static void main(String[] args) throws IOException
	{
		Console cns		  = System.console();
		System.out.print("Enter Username : ");
		String usn  = cns.readLine();
		
		System.out.print("Enter Password : ");
		String pwd = new String(cns.readPassword());
		
		if(!(usn.equalsIgnoreCase("HK")&& pwd.equals("NiT")))
			{
		Employee e1  =  new Employee();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scn		  = new Scanner(System.in);
		
		
		e1.eno				= Integer.parseInt(args[0]);
		e1.ename			= args[1];
		
		System.out.print("Enter dept : ");
		e1.dept				= br.readLine();
		
		System.out.print("Enter Salary : ");
		e1.salary			= Double.parseDouble(br.readLine());
		
		System.out.print("Enter mobile : ");
		e1.mobile			= scn.nextLong(); scn.nextLine(); 
		
		System.out.print("Enter email : ");
		e1.email			= scn.nextLine();
		
		e1.gender			= System.getProperty("gender").charAt(0);
		e1.workingStatus	= Boolean.parseBoolean(System.getProperty("workingStatus"));
		
		System.out.println("The Employee Values are :");
		System.out.println("   Eno\t\t\t :"+			e1.eno);
		System.out.println("   Ename\t\t :"+			e1.ename);
		System.out.println("   Dept  \t\t:"+			e1.dept);
		System.out.println("   Salary\t\t :"+			e1.salary);
		System.out.println("   Mobile\t\t :"+			e1.mobile);
		System.out.println("   E-mail\t\t :"+			e1.email);
		System.out.println("   Gender\t\t :"+			e1.gender);
		System.out.println("   Working Status\t :"+ (e1.workingStatus ? "Working": "NotWorking"));
	}else{
		System.out.println("Invalid Username and Password");
	}
	}
}
