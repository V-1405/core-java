class BMTC {
    
	String routeName;
    int numberOfBuses;
    boolean isOperating;

    BMTC() 
	{
        System.out.println("BMTC object created.");
    }
}

class BMTCRunner{

    public static void main(String[] args) 
	{
		BMTC bmtc = new BMTC();
        System.out.println("Default values for BMTC: " + bmtc.routeName + ", " + bmtc.numberOfBuses + ", " + bmtc.isOperating);
	}
}