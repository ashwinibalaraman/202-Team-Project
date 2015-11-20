/**
 * Write a description of class ControlsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlsButton extends Button 
{
    ControlCommand ccommand;
    public ControlsButton(String text){
        super(text);
    }
    public void setCommand(ControlCommand cmd){
        ccommand = cmd;
    }
	public  void invoke(){
	    ccommand.execute();	    
	}
}
