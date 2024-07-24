class AutoDriver {
    
	String name;
    int experience;
    boolean hasLicense;

    AutoDriver() 
	{
        System.out.println("AutoDriver object created.");
    }
}

class AutoDriverRunner{

    public static void main(String[] args) 
	{
		AutoDriver autoDriver = new AutoDriver();
        System.out.println("Default values for AutoDriver: " + autoDriver.name + ", " + autoDriver.experience + ", " + autoDriver.hasLicense);
    }
}
