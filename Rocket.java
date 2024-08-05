class Rocket {
    String country;
    int speed;
    int fuelCapacity;
    int noOfThrusters;

    public void setCountry(String country) 
	{
        this.country = country;
    }

    public void setSpeed(int speed) 
	{
        this.speed = speed;
    }

    public void setFuelCapacity(int fuelCapacity) 
	{
        this.fuelCapacity = fuelCapacity;
    }

    public void setNoOfThrusters(int noOfThrusters) 
	{
        this.noOfThrusters = noOfThrusters;
    }

    public void printDetails() 
	
	{
        System.out.println("Rocket Country: " + country);
        System.out.println("Rocket Speed: " + speed);
        System.out.println("Rocket Fuel capacity: " + fuelCapacity);
        System.out.println("Rocket no of Thrusters: " + noOfThrusters);
		
		
    }
}