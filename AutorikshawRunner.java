class Autorikshaw {
    
	String model;
    String licensePlate;
    boolean isAvailable;

    Autorikshaw() 
	{
        System.out.println("Autorikshaw object created.");
    }
}

class AutorikshawRunner{

    public static void main(String[] args) 
	{
		Autorikshaw autorikshaw = new Autorikshaw();
        System.out.println("Default values for Autorikshaw: " + autorikshaw.model + ", " + autorikshaw.licensePlate + ", " + autorikshaw.isAvailable);
	}
}