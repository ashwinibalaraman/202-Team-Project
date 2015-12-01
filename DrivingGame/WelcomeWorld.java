import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  WelcomeWorld is the first page user sees when running the game.
 * 
 * @author Spoorthy Bhaktavatsala 
 */
public class WelcomeWorld extends World
{
    private StartButton sb;
    private ControlsButton cb;    
    private HIghScoreButton hb;
    private ChoosecarButton ccb;
    
    /**
     * Constructor for objects of class WelcomeWorld.
     * 
     */
    public WelcomeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        sb = new StartButton("START");        
        addObject(sb,450,getHeight()-550);
        
        cb = new ControlsButton("CONTROLS");        
        addObject(cb,450,getHeight()-500);
        
        hb = new HIghScoreButton("HIGH SCORE");        
        addObject(hb,450,getHeight()-450);
        
        ccb = new ChoosecarButton("CHOOSE CAR");       
        addObject(ccb,450,getHeight()-150);
        
        setup();        
    }
    
    private void setup(){
       
        PlayCommand sc = new PlayCommand(); 
        ControlCommand cc = new ControlCommand();
        HighCommand hc = new HighCommand();
        ChoosecarCommand ccc = new ChoosecarCommand();
        
        ReceiverStart sr = new ReceiverStart();
        addObject(sr,0,0);
        sc.setReceiver(sr);
        sb.setCommand(sc);
        
        ReceiverControls cr = new ReceiverControls();
        addObject(cr,0,0);        
        cc.setReceiver(cr);
        cb.setCommand(cc);
        
        ReceiverHigh hr = new ReceiverHigh();
        addObject(hr,0,0);        
        hc.setReceiver(hr);
        hb.setCommand(hc);
        
        
        ReceiverChoosecar ccr = new ReceiverChoosecar();
        addObject(ccr,0,0);
        ccc.setReceiver(ccr);
        ccb.setCommand(ccc);
        
    }
}
