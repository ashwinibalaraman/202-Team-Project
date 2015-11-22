import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChoosecarButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChoosecarButton extends Button
{
    ChoosecarCommand choosecommand;
    public ChoosecarButton(String text){
        super(text);
    }
    public void setCommand(ChoosecarCommand cmd){
        choosecommand = cmd;
    }
	public  void invoke(){
	    choosecommand.execute();	    
	}    
}
