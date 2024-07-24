class AirCondition {
    
	String brand;
    int temperature;
    boolean isOn;

    AirCondition() 
	{
        System.out.println("AirCondition object created.");
    }
}

class AirConditionRunner{

    public static void main(String[] args) 
	{
		AirCondition airCondition = new AirCondition();
        System.out.println("Default values for AirCondition: " + airCondition.brand + ", " + airCondition.temperature + ", " + airCondition.isOn);
	}
}











