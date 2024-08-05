class Paper {
    double thickness;
    String size;
    String quality;
    String color;

    Paper(double thickness, String size, String quality, String color) 
	{
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

    void printDetails() 
	{
        System.out.println("Paper Details: " + thickness + ", " + size + ", " + quality + ", " + color);
    }
}

class PaperRunner{
	
	public static void main(String[] args)
	{
		
		
		Paper paper1 = new Paper(0.1, "A4", "High", "White");
        Paper paper2 = new Paper(0.2, "A3", "Medium", "Yellow");
        Paper paper3 = new Paper(0.15, "A5", "Low", "Blue");
        
        paper1.printDetails();
        paper2.printDetails();
        paper3.printDetails();
	}
}