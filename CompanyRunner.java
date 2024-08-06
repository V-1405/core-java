class CompanyRunner {
	
	
    public static void main(String[] args) 
	
	{

        Owner owner1 = new Owner("Alice", 45, "Female");


        Hotel hotel1 = new Hotel("Sunshine Hotel", owner1);


        hotel1.printDetails();


        SoftwareEngineer se1 = new SoftwareEngineer("John Doe", 5, "Senior Developer", 85000);


        Company company1 = new Company(101, "Tech Solutions", "New York", se1);


        company1.printDetails();
    }
}