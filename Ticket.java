public class Ticket implements Comparable<Ticket>{

    private int _iD;
    private String _description;
    private int _priority; //0 is most important
    private String _name;
    public boolean _solved;


    /*-----------------------CONSTRUCTOR---------------------------*/
    
    public Ticket(String name, int iD, int priority, String description){
	_name = name;
	_iD = iD;
	_priority = priority;
	_description = description;
	_solved = false;
    }
    
    /*--------------------------ACCESSORS---------------------------*/
    
    public int getPriority(){
	return _priority;
    }

    public int getID(){
	return _iD;
    }

    public String getName(){
	return _name;
    }

    public String getDescription(){
	return _description;
    }

    /*-------------------------MUTATORS------------------------------*/

    public void setPriority(int newPriority){
	_priority = newPriority;
    }

    public void setSolved(boolean solved){
	_solved = solved;
    }

    /*----------------------------------------------------------------*/
    
    //compares tickets on the basis of priority
    public int compareTo(Ticket other){
	return _priority - other.getPriority();
    }

    //returns whether two tickets are the same on the basis of the ID number
    public boolean equals(Ticket other){
	return _iD == other.getID();
    }

    public String toString(){
	String retStr = "";
	retStr += _iD + " " + _name;
	return retStr;
    }

}
