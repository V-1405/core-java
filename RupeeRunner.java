class Rupee{
	
	String currencyName;
	double amount;
	boolean isInCirculation;
	
	Rupee()
	{
		System.out.println("Created Rupee");
	}
}

class RupeeRunner{

    public static void main(String[] args) 
	{
        
        Rupee rupee = new Rupee();
        System.out.println("Default values for Rupee: " + rupee.amount + ", " + rupee.currencyName + ", " + rupee.isInCirculation);
	}	
}