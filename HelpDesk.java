import cs1.Keyboard;

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> data;
    private int idCounter;
    private static String[] services = {"Reinstall Operating System","Dispatch Tech",
					"Password Reset","Moral Support and a Hug");

    public HelpDesk(){
	data = new ArrayPriorityQueue<Ticket>;
	idCounter = 1;
    }

    public void newTicket(){
	System.out.println("Welcome to the Help Desk! What is your name?");
	String name = Keyboard.readString();

	System.out.println("Hello there " + name "! " + "What can we help with you today?");
	for (int x = 0; x < services.length; x++){
	    System.out.println( (x+1) + ": " + services[x]);
	}
	System.out.println( "5: You cannot solve my problems." );
	
	int description = Keyboard.readInt()-1;
	if (description == 4){
	    System.out.println("We're very sorry we cannot help you today. You may want to visit another help desk.");
	}
	else{
	    while (!(description >= 0 && description < services.length)){
		System.out.println("Please enter a valid number.");
		description = Keyboard.readInt()-1;
	    }
	    Ticket newTicket = new Ticket(name, idCounter, description, services[description]);
	    data.add(newTicket);
	    idCounter++;
	    System.out.println("You have been added to our list. Please wait to be assisted. Your ID number is: " + newTicket.getID());
	}
    }

	    
    public String passwordReset(){
	_solved = true;
    }

    public String dispatchTech(){
	_solved = true; //not sure if this is valid here
	return "Okay. You can return to your desk, and I'll send someone over to see if they can fix the problem";
    }

    public String reinstallOS(){
	_solved = true;
	return "I reinstalled your operating system, so it should basically start over as a new machine now. Let me know if you have any other problems";
    }

    public String moralSupport(){
	_solved = true;
	return "Take a deep breath. Everything is working. It's all okay. *gives hug*";
    }
    


}
