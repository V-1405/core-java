class CabCompany {
   
    String companyName;
    int numberOfCabs;
    boolean isOperating;

    CabCompany() 
	{
        System.out.println("CabCompany object created.");
    }
}

class CabCompanyRunner{

    public static void main(String[] args) 
	{
		CabCompany cabCompany = new CabCompany();
        System.out.println("Default values for CabCompany: " + cabCompany.companyName + ", " + cabCompany.numberOfCabs + ", " + cabCompany.isOperating);
	}
}