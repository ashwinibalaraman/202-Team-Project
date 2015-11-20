import greenfoot.*;
/**
 * Write a description of class ConcreteObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteObserver extends Actor implements Observer
{
    
    protected String observerState="";
    protected ConcreteSubject subject;
    
    /**
     * Constructor for objects of class ConcreteObserver
     */
    public ConcreteObserver(ConcreteSubject subject)
    {
        // initialise instance variables
        this.subject = subject;
    }

    public void update(){
    }
}
