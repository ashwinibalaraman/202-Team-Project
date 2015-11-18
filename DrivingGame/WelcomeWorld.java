import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  WelcomeWorld is the first page user sees when running the game.
 * 
 * @author Spoorthy Bhaktavatsala 
 */
public class WelcomeWorld extends World
{
    private MenuButton sb;
    private ConcreteCommand sc;
    private MenuButton cb;
    private ConcreteCommand cc;
    /**
     * Constructor for objects of class WelcomeWorld.
     * 
     */
    public WelcomeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        sb = new MenuButton("START");
        sc = new ConcreteCommand();
        addObject(sb,450,getHeight()-450);
        cb = new MenuButton("CONTROLS");
        cc = new ConcreteCommand();
        addObject(cb,450,getHeight()-500);
        setup();        
    }
    
    private void setup(){
        sc.setReceiver(new Receiver() 
                {                    
                    public void doAction() //This is actual action which should happen on click on Play Button
                    {
                     if(Greenfoot.mouseClicked(sb)){
                         World carworld = new CarWorld();
                         Greenfoot.setWorld(carworld);
                        
                    }
                }
            });
        sb.setCommand(sc);
        cc.setReceiver(new Receiver() 
                {                    
                    public void doAction() //This is actual action which should happen on click on Play Button
                    {
                     if(Greenfoot.mouseClicked(cb)){
                        World infoworld = new InfoWorld();
                         Greenfoot.setWorld(infoworld);                        
                    }
                }
            });
        cb.setCommand(cc);
        
    }
}