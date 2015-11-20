import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeButton extends Button
{
    BackCommand bcommand;
    public HomeButton(String text){
        super(text);
    }
    
    public void setCommand(BackCommand cmd){
        bcommand = cmd;
    }
	public  void invoke(){
	    bcommand.execute();	    
	}
}
