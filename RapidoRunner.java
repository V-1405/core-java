class Rapido {
    
	String riderName;
    int rideId;
    boolean isAvailable;

    Rapido() 
	{
        System.out.println("Rapido object created.");
    }
}

class RapidoRunner{

    public static void main(String[] args) 
	{
		 Rapido rapido = new Rapido();
        System.out.println("Default values for Rapido: " + rapido.riderName + ", " + rapido.rideId + ", " + rapido.isAvailable);
	}
}