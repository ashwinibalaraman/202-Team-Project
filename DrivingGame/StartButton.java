import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Button
{
    PlayCommand pcommand;
    public StartButton(String text){
        super(text);
    }
    public void setCommand(PlayCommand cmd){
        pcommand = cmd;
    }
	public  void invoke(){
	    pcommand.execute();	    
	}   
}
