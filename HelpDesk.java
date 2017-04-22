import cs1.Keyboard;

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> data;
    private static ArrayList<String> _listOfServices;

    public HelpDesk(){
	data = new ArrayPriorityQueue<Ticket>;
	constructServiceList();
    }
	
    private static void constructServiceList(){
	_listOfServices.add("password reset");
	_listOfServices.add("dispatch tech");
	_listOfServices.add("reinstall operating system");
	_listOfServices.add("moral support and a hug");
    }

    public String passwordReset(){
	_solved = true;
    }

    public String dispatchTech(){
	_solved = true; //not sure if this is valid here
	return "Okay. You can return to your desk, and I'll send someone over to see if they can fix the problem";
    }

    public String reinstallOp(){
	_solved = true;
	return "I reinstalled your operating system, so it should basically start over as a new machine now. Let me know if you have any other problems";
    }

    public String moralSupport(){
	_solved = true;
	return "Take a deep breath. Everything is working. It's all okay. *gives hug*";
    }
    


}
