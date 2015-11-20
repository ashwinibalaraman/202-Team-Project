/**
 * Write a description of class BackCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackCommand implements Command 
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
