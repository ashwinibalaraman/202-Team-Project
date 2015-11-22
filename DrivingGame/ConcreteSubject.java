import greenfoot.*;
import java.util.ArrayList;

/**
 * Write a description of class ConcreteSubject here.
 * 
 * @author shwini Balaraman
 * @version 1.1
 */
public class ConcreteSubject extends Actor implements Subject
{
    
    protected static String subjectState;
    protected ArrayList<Observer> observers = new ArrayList();

    /**
     * Constructor for objects of class ConcreteSubject
     */
    public ConcreteSubject()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getState()
    { 
        // put your code here
        return subjectState;
    }
    
    public void setState(String state)
    {
        subjectState = state;
        notifyAllObservers();
    }
    
    public void attach(Observer obj){
        observers.add(obj);
    }
    
    public void detach(Observer obj){
        observers.remove(obj);
    }
    
    public void notifyAllObservers(){
        for (Observer obs : observers){
            obs.update(this);
        }
        
    }
}
