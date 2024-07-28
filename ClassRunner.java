class Claw {
    String name;
    int noOfClaws;
    String color = "pink";

    Claw() {
        System.out.println("Created Claw");
    }
}

class Crow {
    String name;
    int noOfCrows;
    String color = "brown";

    Crow() {
        System.out.println("Created Crow");
    }
}

class Clock {
    String name;
    int noOfClocks;
    String color = "purple";

    Clock() {
        System.out.println("Created Clock");
    }
}

class Lollipop {
    String name;
    int noOfLollipops;
    String color = "green";

    Lollipop() {
        System.out.println("Created Lollipop");
    }
}

class Jean {
    String name;
    int noOfJeans;
    String color = "black";

    Jean() {
        System.out.println("Created Jean");
    }
}

class Keyboard {
    String name;
    int noOfKeyboards;
    String color = "black";

    Keyboard() {
        System.out.println("Created Keyboard");
    }
}

class Mountain {
    String name;
    int noOfMountains;
    String color = "green";

    Mountain() {
        System.out.println("Created Mountain");
    }
}

class Stadium {
    String name;
    int noOfStadiums;
    String color = "gray";

    Stadium() {
        System.out.println("Created Stadium");
    }
}

class Spray {
    String name;
    int noOfSprays;
    String color = "white";

    Spray() {
        System.out.println("Created Spray");
    }
}

class ClassRunner {
    public static void main(String[] args) {
        
        Claw claw = new Claw();
        claw.name = "sharpClaw";
        claw.noOfClaws = 5;
        System.out.println("Name of Claw is: " + claw.name);
        System.out.println("No of Claws is: " + claw.noOfClaws);
        System.out.println("Color of Claw is: " + claw.color);
		
		
		System.out.println("========================================================");
        
        Crow crow = new Crow();
        crow.name = "crowy";
        crow.noOfCrows = 3;
        System.out.println("Name of Crow is: " + crow.name);
        System.out.println("No of Crows is: " + crow.noOfCrows);
        System.out.println("Color of Crow is: " + crow.color);
		
		
		System.out.println("========================================================");

        
        Clock clock = new Clock();
        clock.name = "wallClock";
        clock.noOfClocks = 2;
        System.out.println("Name of Clock is: " + clock.name);
        System.out.println("No of Clocks is: " + clock.noOfClocks);
        System.out.println("Color of Clock is: " + clock.color);
		
		
		System.out.println("========================================================");

        
        Lollipop lollipop = new Lollipop();
        lollipop.name = "sweetLollipop";
        lollipop.noOfLollipops = 10;
        System.out.println("Name of Lollipop is: " + lollipop.name);
        System.out.println("No of Lollipops is: " + lollipop.noOfLollipops);
        System.out.println("Color of Lollipop is: " + lollipop.color);
		
		
		System.out.println("========================================================");

     
        Jean jean = new Jean();
        jean.name = "denimJean";
        jean.noOfJeans = 7;
        System.out.println("Name of Jean is: " + jean.name);
        System.out.println("No of Jeans is: " + jean.noOfJeans);
        System.out.println("Color of Jean is: " + jean.color);
		
		
		System.out.println("========================================================");

        
        Keyboard keyboard = new Keyboard();
        keyboard.name = "mechanicalKeyboard";
        keyboard.noOfKeyboards = 4;
        System.out.println("Name of Keyboard is: " + keyboard.name);
        System.out.println("No of Keyboards is: " + keyboard.noOfKeyboards);
        System.out.println("Color of Keyboard is: " + keyboard.color);
		
		
		System.out.println("========================================================");

        
        Mountain mountain = new Mountain();
        mountain.name = "everest";
        mountain.noOfMountains = 1;
        System.out.println("Name of Mountain is: " + mountain.name);
        System.out.println("No of Mountains is: " + mountain.noOfMountains);
        System.out.println("Color of Mountain is: " + mountain.color);
		
		
		System.out.println("========================================================");

       
        Stadium stadium = new Stadium();
        stadium.name = "olympicStadium";
        stadium.noOfStadiums = 3;
        System.out.println("Name of Stadium is: " + stadium.name);
        System.out.println("No of Stadiums is: " + stadium.noOfStadiums);
        System.out.println("Color of Stadium is: " + stadium.color);
		
		
		System.out.println("========================================================");

      
        Spray spray = new Spray();
        spray.name = "airFreshener";
        spray.noOfSprays = 2;
        System.out.println("Name of Spray is: " + spray.name);
        System.out.println("No of Sprays is: " + spray.noOfSprays);
        System.out.println("Color of Spray is: " + spray.color);
    }
}