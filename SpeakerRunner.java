class SpeakerRunner{


    public static void main(String[] args) {
        
		Speaker speaker = new Speaker();
        speaker.brand = "Sony";
        speaker.size = 1238;
        speaker.cost = 7869.456;
		speaker.output = "Fine";
		
		speaker.printDetails();
		
		
		System.out.println("=====================================");
		
		
		Speaker speaker1 = new Speaker();
        speaker1.brand = "JDL";
        speaker1.size = 12038;
        speaker1.cost = 7869.4596;
		speaker1.output = "Fine";
		
		speaker1.printDetails();
		
		System.out.println("=====================================");
		
		
		Speaker speaker2 = new Speaker();
        speaker2.brand = "JDL";
        speaker2.size = 2038;
        speaker2.cost = 789.4596;
		speaker2.output = "Fine";
		
		speaker2.printDetails();
		
    }
}
