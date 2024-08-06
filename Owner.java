class Owner {
	
	
    String name;
    int age;
    String gender;

    Owner(String name, int age, String gender) 
	
	{
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printDetails() 
	{
        System.out.println("Owner Name: " + name);
		System.out.println("Owner Age: " + age);
		System.out.println("Owner Gender: " + gender);
    }
}