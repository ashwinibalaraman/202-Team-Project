import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ReceiverStart extends ConcreteReceiver
{
    public ReceiverStart(){
        
    }
    public void doAction(){
        if(Greenfoot.mouseClicked((StartButton)getWorld().getObjects(StartButton.class).get(0))){
             World carworld = new CarWorld();
             Greenfoot.setWorld(carworld);
                        
        }
    }
      
}
