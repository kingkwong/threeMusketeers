import cs1.Keyboard;

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> data;
    private int idCounter;
    private static String[] services = {"Reinstall Operating System","Dispatch Tech","Password Reset","Moral Support and a Hug"};

    public HelpDesk(){
	data = new ArrayPriorityQueue<Ticket>();
	idCounter = 1;
    }

    public ArrayPriorityQueue<Ticket> getData(){
	return data;
    }
    
    public void newTicket(){
	System.out.println("Welcome to the Help Desk! What is your name?");
	String name = Keyboard.readString();

	System.out.println("Hello there " + name + "! " + "What can we help with you today?");
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

    public void solveTicket(){
	if (!(data.isEmpty())){
	    Ticket solving = data.removeMin();
	    if (solving.getPriority() == 0){
		System.out.println(reinstallOS());
	    }
	    else if (solving.getPriority() == 1){
		System.out.println(dispatchTech());
	    }
	    else if (solving.getPriority() == 2){
		passwordReset();
	    }
	    else{
		System.out.println(moralSupport());
	    }
	    solving._solved = true;
	}
    }
	
	    
    public static void passwordReset(){
	System.out.println("Okay. We're going to reset your password. Please type your new password.");
	String newPass = Keyboard.readString();
	System.out.println("Okay " + newPass + " is your new password. Have a nice day.");
    }

    public static String dispatchTech(){
	return "Okay. You can return to your desk, and I'll send someone over to see if they can fix the problem";
    }

    public static String reinstallOS(){
	return "I reinstalled your operating system, so it should basically start over as a new machine now. Let me know if you have any other problems";
    }

    public static String moralSupport(){
	return "Take a deep breath. Everything is working. It's all okay. *gives hug*";
    }

    public String toString(){
	return data.toString();
    }

    public static void main(String[] args){

	HelpDesk helper = new HelpDesk();
	helper.newTicket();
	helper.newTicket();
	helper.newTicket();
	helper.newTicket();
	helper.newTicket();
	helper.newTicket();
	System.out.println(helper);
	while (! helper.getData().isEmpty()){
	    helper.solveTicket();
	}

    }
}
