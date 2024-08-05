class Projector {
    String company;
    String type;
    String color;
    double weight;

    {
        company = "Epson";
        type = "LCD";
        color = "White";
        weight = 2.5;
    }

    void printDetails() {
        System.out.println("Projector Details: " + company + ", " + type + ", " + color + ", " + weight);
    }
}

class ProjectorRunner {

public static void main(String[] args)
{
	
	    Projector projector1 = new Projector();
	    projector1.printDetails();
		
		System.out.println("==============================");
		
		
        Projector projector2 = new Projector();
		projector2.company = "Dell";
        projector2.type = "LCD";
        projector2.color = "Black";
        projector2.weight = 8.5;
        projector2.printDetails();
		System.out.println("==============================");
		
        Projector projector3 = new Projector();
		projector3.company = "Sony";
        projector3.type = "LCD";
        projector3.color = "Grey";
        projector3.weight = 45;
        
        projector3.printDetails();
        
}
}