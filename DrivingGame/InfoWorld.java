import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoWorld extends World
{

    private MenuButton bb;
    private ConcreteCommand bc;
    public InfoWorld(){
        super(500,600,1);
        bb = new MenuButton("BACK");
        bc = new ConcreteCommand();
        addObject(bb,236,getHeight()-63);
        click();
    }
    
    public void click()
    {
        bc.setReceiver(new Receiver() 
                {                    
                    public void doAction() //This is actual action which should happen on click on Play Button
                    {
                      if(Greenfoot.mouseClicked(bb))
                      {
                         World welcomeworld = new WelcomeWorld();
                         Greenfoot.setWorld(welcomeworld);
                      }
                }
            });
        bb.setCommand(bc);
    }
}
