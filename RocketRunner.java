class RocketRunner{
	
	public static void main(String[] args)
	
	{

        Rocket rocket1 = new Rocket();
        rocket1.setCountry("USA");
        rocket1.setSpeed(25000);
        rocket1.setFuelCapacity(5000);
        rocket1.setNoOfThrusters(3);
		
		rocket1.printDetails();
		
		System.out.println("============================");
        
        Rocket rocket2 = new Rocket();
        rocket2.setCountry("Russia");
        rocket2.setSpeed(24000);
        rocket2.setFuelCapacity(4500);
        rocket2.setNoOfThrusters(4);
		
		rocket2.printDetails();

		
		System.out.println("============================");

        
        Rocket rocket3 = new Rocket();
        rocket3.setCountry("India");
        rocket3.setSpeed(23000);
        rocket3.setFuelCapacity(4000);
        rocket3.setNoOfThrusters(2);
        
        rocket3.printDetails();
		
	}
		
}