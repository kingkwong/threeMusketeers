import cs1.Keyboard;

public class HelpDesk{

    private ArrayPriorityQueue<Ticket> data;
    private static ArrayList<String> _listOfServices;

    public HelpDesk(){

	constructServiceList();
    }
	
    private static void constructServiceList(){
	_listOfServices.add("password reset");
	_listOfServices.add("dispatch tech");
	_listOfServices.add("reinstall operating system");
	_listOfServices.add("moral support and a hug");
    }		    



}
