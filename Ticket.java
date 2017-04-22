public class Ticket implements Comparable<Ticket>{

    private int _iD;
    private String _description;
    private int _priority; //0 is most important
    private String _name;
    private String _solution;
    public boolean _solved;


    public Ticket(String name, int iD, int priority, String description){
	_name = name;
	_iD = iD;
	_priority = priority;
	_description = description;
    }

    private int getPriority(){
	return _priority;
    }

    private int getID(){
	return _iD;
    }

    public int compareTo(Ticket other){
	return _priority - other.getPriority();
    }


    public boolean equals(Ticket other){
	return _iD == other.getID();
    }

    

}
