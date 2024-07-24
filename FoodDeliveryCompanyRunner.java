class FoodDeliveryCompany {
    
	String companyName;
    int numberOfDeliveryAgents;
    boolean isOperating;

    FoodDeliveryCompany() 
	{
        System.out.println("FoodDeliveryCompany object created.");
    }
}

class FoodDeliveryCompanyRunner{

    public static void main(String[] args) 
	{
		FoodDeliveryCompany foodDeliveryCompany = new FoodDeliveryCompany();
        System.out.println("Default values for FoodDeliveryCompany: " + foodDeliveryCompany.companyName 
		                       + ", " + foodDeliveryCompany.numberOfDeliveryAgents + ", " + foodDeliveryCompany.isOperating);
	}
}