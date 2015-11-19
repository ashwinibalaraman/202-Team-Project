import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReceiverControls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiverControls extends ConcreteReceiver
{
    public void doAction() //This is actual action which should happen on click on Play Button
    {
         if(Greenfoot.mouseClicked(getWorld().getObjects(ControlsButton.class).get(0))){
            World infoworld = new InfoWorld();
             Greenfoot.setWorld(infoworld);                        
        }
    } 
}
