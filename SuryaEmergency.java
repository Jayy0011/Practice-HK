abstract class Hospital 
{
	abstract void emergency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();
}

class SuryaHospital extends Hospital
{
	public SuryaHospital()
	{
		System.out.println("Its Surya Hospital available for Emergency");
	}
	
	void emergency()
	{
		System.out.println("Call 911 for emergency");
	}
	
	void appointment()
	{
		System.out.println("To get appointment with the doctor in Surya hospital");
	}
	
	void admit()
	{
		System.out.println("To Book a bed or to admit to the hospital" );
	}
	
	void billing()
	{
		System.out.println("Amount paid successfully");
	}
}

class SuryaEmergency
{
	public static void main(String[] agrs)
		{
			SuryaHospital Sh1 = new SuryaHospital();
			
			Sh1.emergency();
			Sh1.appointment();
			Sh1.admit();
			Sh1.billing();
		}
}
