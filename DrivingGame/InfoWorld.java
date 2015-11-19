import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoWorld extends World
{

    private HomeButton bb;
    private BackCommand bc;
    public InfoWorld(){
        super(500,600,1);
        bb = new HomeButton("BACK");
        bc = new BackCommand();
        addObject(bb,236,getHeight()-63);
        click();
    }
    
    public void click()
    {
        bc.setReceiver(new ReceiverHome());
        /*bc.setReceiver(new Receiver() 
                {                    
                    public void doAction() //This is actual action which should happen on click on Play Button
                    {
                      if(Greenfoot.mouseClicked(bb))
                      {
                         World welcomeworld = new WelcomeWorld();
                         Greenfoot.setWorld(welcomeworld);
                      }
                }
            });*/
        bb.setCommand(bc);
    }
}
