import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HIghScoreButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HIghScoreButton extends Button
{   
    HighCommand hcommand;
    HIghScoreButton(String text){
        super(text);
    }
    public void setCommand(HighCommand cmd){
        hcommand = cmd;
    }
	public  void invoke(){
	    hcommand.execute();	    
	}   
}
