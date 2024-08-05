class Speaker {
   
    String brand;
    int size;
    double cost;
    String output;


	
	{
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    
    void printDetails() 
	
	{
        System.out.println("Speaker Brand: " + brand );
		System.out.println("Speaker Size: " + size );
		System.out.println("Speaker Cost: " + cost );
		System.out.println("Speaker Output: " + output );
    }
}