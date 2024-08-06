class CountryRunner {
	
	
	public static void main(String[] args) 
	
	{

        CapitalCity capitalCity1 = new CapitalCity("Mumbai", 20411000);


        State state1 = new State("Maharashtra", "Marathi", capitalCity1);


        Country country1 = new Country("India", "Asia", state1);


        country1.printDetails();
    }
}