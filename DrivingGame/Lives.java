import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.awt.Font;

/**
 * Counter that displays a number.
 * 
 * @version 1.0.1
 */
public class Lives extends ConcreteObserver
{
    public static int valueLives = 3;
    public Lives(ConcreteSubject car)
    {
        super(car);
        this.subject.attach(this);
        valueLives = 3;
    }
    
    
    public void act()
    {
        
         if(((Car) getWorld().getObjects(Car.class).get(0)).getState() == "Collided"){
            valueLives = ((CarWorld) getWorld()).getLives();
            checkValueLives();
        }

       
       
    }
    public void checkValueLives()
    {
       if(getX() == 150)
       {
          if(valueLives == 2)
          {
             getWorld().removeObject(this);
          }
       }
       else if(getX() == 100)
       {
          if(valueLives == 1)
          {
             getWorld().removeObject(this);
          }
       }
       else if(getX() == 50)
       {
          if(valueLives == 0)
          {
             Greenfoot.stop();
             getWorld().addObject(new ScoreBoard(),300,300);
          }
       }
    }
}
