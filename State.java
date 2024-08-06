class State {
    
	String name;
    String language;
    CapitalCity capitalCity;


    State(String name, String language, CapitalCity capitalCity) 
	
	{
        this.name = name;
        this.language = language;
        this.capitalCity = capitalCity;
    }


    public void printDetails() 
	
	{
        System.out.println("State: " + name);
		System.out.println("Language: " + language);
		
        capitalCity.printDetails();
    }
}