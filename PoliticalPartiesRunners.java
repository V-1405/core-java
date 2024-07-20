class PoliticalPartiesRunner {
    
	public static void main(String[] args) 
	{
       
       	   String[] politicalParties = {
            "Bharatiya Janata Party (BJP)",
            "Indian National Congress (INC)",
            "Aam Aadmi Party (AAP)",
            "Communist Party of India (CPI)",
            "All India Trinamool Congress (AITC)"
        };

        printPoliticalParties(politicalParties);
    
	}
	

    public static void printPoliticalParties(String[] politicalParties) {
    
    System.out.println("The Political Parties in India are:");

        for (int party = politicalParties.length-1; party >= 0; party--) {

            System.out.println((party + 1) + ". " + politicalParties[party]);
        }
    }
}