import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton extends Button
{
    ConcreteCommand command;
    public MenuButton(String text){
        super(text);
    }
    public void setCommand(ConcreteCommand cmd){
        command = cmd;
    }
	public  void invoke(){
	    command.execute();	    
	}   
}
