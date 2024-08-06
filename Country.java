class Country {
    
	
	String name;
    String continent;
    State state;


    Country(String name, String continent, State state) 
	
	{
        this.name = name;
        this.continent = continent;
        this.state = state;
    }



    public void printDetails() 
	
	{
        System.out.println("Country: " + name);
		System.out.println("Continent: " + continent);
		
        state.printDetails();
    }
}