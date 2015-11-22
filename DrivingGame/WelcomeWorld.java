import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  WelcomeWorld is the first page user sees when running the game.
 * 
 * @author Spoorthy Bhaktavatsala 
 */
public class WelcomeWorld extends World
{
    private StartButton sb;
    private PlayCommand sc;
    private ControlsButton cb;
    private ControlCommand cc;
    private HIghScoreButton hb;
    private HighCommand hc;
    private ReceiverStart sr;
    private ReceiverControls cr;
    private ReceiverHigh hr;
    private ChoosecarButton ccb;
    private ChoosecarCommand ccc;
    private ReceiverChoosecar ccr;
    
    
    /**
     * Constructor for objects of class WelcomeWorld.
     * 
     */
    public WelcomeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        sb = new StartButton("START");
        sc = new PlayCommand();
        addObject(sb,450,getHeight()-550);
        cb = new ControlsButton("CONTROLS");
        cc = new ControlCommand();
        addObject(cb,450,getHeight()-500);
        hb = new HIghScoreButton("HIGH SCORE");
        hc = new HighCommand();
        addObject(hb,450,getHeight()-450);
        ccb = new ChoosecarButton("CHOOSE CAR");
        ccc = new ChoosecarCommand();
        addObject(hb,450,getHeight()-150);
        
        setup();        
    }
    
    private void setup(){
        /*sc.setReceiver(new Receiver() 
                {                    
                    public void doAction() //This is actual action which should happen on click on Play Button
                    {
                     if(Greenfoot.mouseClicked(sb)){
                         World carworld = new CarWorld();
                         Greenfoot.setWorld(carworld);
                        
                    }
                }
            });*/
        sr = new ReceiverStart();
        addObject(sr,0,0);
        sc.setReceiver(sr);
        sb.setCommand(sc);
        cr = new ReceiverControls();
        addObject(cr,0,0);        
        cc.setReceiver(cr);
        hr = new ReceiverHigh();
        addObject(hr,0,0);        
        hc.setReceiver(hr);
        hb.setCommand(hc);
        /*cc.setReceiver(new Receiver() 
                {                    
                    public void doAction() //This is actual action which should happen on click on Play Button
                    {
                     if(Greenfoot.mouseClicked(cb)){
                        World infoworld = new InfoWorld();
                         Greenfoot.setWorld(infoworld);                        
                    }
                }
            });*/
        cb.setCommand(cc);
        ccr = new ReceiverChoosecar();
        addObject(ccr,0,0);
        ccc.setReceiver(ccr);
        ccb.setCommand(ccc);
        
    }
}
