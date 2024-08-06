class Company {
    
	int id;
    String name;
    String location;
    SoftwareEngineer softwareEngineer;

    Company(int id, String name, String location, SoftwareEngineer softwareEngineer) 
	
	{
        this.id = id;
        this.name = name;
        this.location = location;
        this.softwareEngineer = softwareEngineer;
    }

    public void printDetails() 
	
	{
        System.out.println("Company ID: " + id);
		System.out.println("Company Name: " + name);
		System.out.println("Company Location: " + location);
		System.out.println("Software Engineer: " + softwareEngineer);
		
        softwareEngineer.printDetails();
    }
}