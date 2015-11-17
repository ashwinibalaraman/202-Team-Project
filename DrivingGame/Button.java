import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * General button Interface implemented by all types of buttons.
 * 
 * @author Spoorthy Bhaktavatsala 
 * @version (a version number or a date)
 */
public class Button extends Actor implements Invoker
{
    private String btnText;
    private Command command;
    
    public Button(String st){
        btnText = st;
        initText();
    }
    
    private void initText(){
        GreenfootImage buttonimage = new GreenfootImage(getImage());
    }
    
        
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void setCommand(Command cmd){
        
    }
	public  void invoke(){
	    
	}
}
