/**
 * Write a description of class ChoosecarCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChoosecarCommand implements Command
{
    private Receiver rec;   
 
    public void setReceiver(ConcreteReceiver r)
    {
        // put your code here
        this.rec = r;
    }
    public void execute(){
        this.rec.doAction();
    }
}
