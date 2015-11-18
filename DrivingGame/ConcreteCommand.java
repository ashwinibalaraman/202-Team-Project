/**
 * Write a description of class StartCommand here.
 * 
 * @author Spoorthy 
 * @version (a version number or a date)
 */
public class ConcreteCommand  implements Command
{
    // instance variables - replace the example below with your own
    private Receiver rec;

    /**
     * Constructor for objects of class StartCommand
     */
    public ConcreteCommand()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setReceiver(Receiver r)
    {
        // put your code here
        this.rec = r;
    }
    public void execute(){
        this.rec.doAction();
    }
    
}
