class CapitalCity {
    
	
	String name;
    int population;

    CapitalCity(String name, int population) 
	
	{
        this.name = name;
        this.population = population;
    }

    public void printDetails() 
	{
        System.out.println("Capital City: " + name);
		System.out.println("Population: " + population);
    }
}