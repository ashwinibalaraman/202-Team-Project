/**
 * Write a description of class StartCommand here.
 * 
 * @author Spoorthy 
 * @version (a version number or a date)
 */
public class PlayCommand  implements Command
{
    // instance variables - replace the example below with your own
    private Receiver rec;// changed from concrete receiver to Receiver

    /**
     * Constructor for objects of class StartCommand
     */
    public PlayCommand()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setReceiver(ConcreteReceiver r)
    {
        // put your code here
        this.rec = r;
    }
    public void execute(){
        this.rec.doAction();
    }
    
}
