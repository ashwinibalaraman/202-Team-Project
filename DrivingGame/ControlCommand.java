/**
 * Write a description of class ControlCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlCommand implements Command
{
    private Receiver rec;

    /**
     * Constructor for objects of class BackCommand
     */
    public ControlCommand()
    {
    }

    
    public void setReceiver(ConcreteReceiver r)
    {
        // put your code here
        this.rec = r;
    }
    public void execute(){
        this.rec.doAction();
    }
}
