class ChocolateRunner{
	
	public static void main(String[] args)
	{
		
		Chocolate chocolate1 = new Chocolate();
        chocolate1.printDetails();
		
		System.out.println("================================");

		
        Chocolate chocolate2 = new Chocolate();
		chocolate2.brand = "KitKat";
		chocolate2.price = 90;
		chocolate2.flavour = "Chocolate";
		chocolate2.size = 25;
		
		chocolate2.printDetails();
		
		System.out.println("================================");

		
        Chocolate chocolate3 = new Chocolate();
		chocolate3.brand = "Milky Bar";
		chocolate3.price = 190;
		chocolate3.flavour = "White Chocolate";
		chocolate3.size = 250;
        
        
        chocolate3.printDetails();
	    
 		
	}
}






