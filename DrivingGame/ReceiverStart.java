import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ReceiverStart extends ConcreteReceiver
{
    public void doAction(){
        if(Greenfoot.mouseClicked(getWorld().getObjects(StartButton.class).get(0))){
             World carworld = new CarWorld();
             Greenfoot.setWorld(carworld);
                        
        }
    }
      
}
