import java.util.ArrayList;

public class ArrayPriorityQueue<T> implements PriorityQueue<T>{

    //instance vars
    private ArrayList<T> queue;
    
    //constructors
    public ArrayPriorityQueue(){
        queue = new ArrayList<T>();
    }
    
    //methods
    //removeMin returns the integer with highest priority(smallest integer) which should
    //always be at the end of the queue. 
    public T removeMin(){
        return queue.remove(queue.size()-1);
    }

    //add insert int x based on its priority. x should go before ints with higher priority
    //and also ints of same priority(because of the LILO aspect of queues).
    public void add( T x ){
        int index = 0;
        if (isEmpty()){
            queue.add(x); 
        }
        else{ 
            while ((index < queue.size()) && (((Comparable)x).compareTo(queue.get(index)) <= 0 )){
		index++;
            }
            queue.add(index, x);
        }
    }

    //isEmpty returns true if an the queue is empty and false otherwise
    public boolean isEmpty(){
        return queue.size() == 0;
    }
    //peekMin returns the int with highest priority by returning the value from the end
    //of the list
    public T peekMin(){
        return (T)queue.get(queue.size()-1);
    }
    //toString method
    public String toString(){
        String retStr = "end -->";
        for(int x = 0; x < queue.size(); x++){
            retStr += queue.get(x) + " ";
        }
        retStr += "--> front";
        return retStr;
    }


    //main method
    public static void main (String[] args){

        ArrayPriorityQueue<Integer> nums = new ArrayPriorityQueue<Integer>();

        System.out.println("Empty? before adding anything: " + nums.isEmpty());
    
        nums.add(7);
        nums.add(7);
        nums.add(1);
        nums.add(9);
        nums.add(21);
        nums.add(12);
        nums.add(5);
        nums.add(21);
        nums.add(21);
        nums.add(16);

        System.out.println("Empty? after adding everything: " + nums.isEmpty());
        System.out.println(nums);
        System.out.println("========================================");

        nums.removeMin();
        nums.removeMin();
        nums.removeMin();
        nums.removeMin();

        System.out.println("After dequeueing 4 times, first item should be 9");
        System.out.println(nums);
        
        nums.removeMin();
        nums.removeMin();
        nums.removeMin();
        nums.removeMin();
        nums.removeMin();
        nums.removeMin();
        System.out.println("Queue should be empty: ");
        System.out.println(nums);
        
        
        System.out.println("Dequeueing from empty queue should yield error...");
        System.out.println( nums.removeMin());
    }
}

