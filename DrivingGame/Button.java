import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
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
        GreenfootImage text = new GreenfootImage(btnText, 22, Color.WHITE, new Color(0,0,0,0));
        if(text.getWidth() > buttonimage.getWidth() - 20){
            buttonimage.scale(text.getWidth() + 20, buttonimage.getHeight());
        }
        
        int xpos = (buttonimage.getWidth() -text.getWidth() ) /2;
        int ypos = (buttonimage.getHeight() -text.getHeight() ) /2;
        buttonimage.drawImage(text, xpos, ypos);
        setImage(buttonimage);
    }
    
        
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            invoke();
        }
       
    }    
    
    public void setCommand(Command cmd){
        command = cmd;
    }
	public  void invoke(){
	    command.execute();	    
	}
}
