import greenfoot.*;
/**
 * Write a description of interface Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    
    void attach(Observer obj);
    void detach(Observer obj);
    void notifyAllObservers();
}
