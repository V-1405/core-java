class SoftwareEngineer {
    
	String name;
    int experience;
    String designation;
    double salary;

    SoftwareEngineer(String name, int experience, String designation, double salary) 
	
	{
        this.name = name;
        this.experience = experience;
        this.designation = designation;
        this.salary = salary;
    }

    public void printDetails() 
	{
        System.out.println("Software Engineer Name: " + name );
		System.out.println("Software Engineer Experience: " + experience );
		System.out.println("Software Engineer Designation: " + designation );
		System.out.println("Software Engineer Salary: " + salary );
    }
}