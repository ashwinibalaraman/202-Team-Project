import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 */ 

public class Car extends ConcreteSubject
{
    private Actor collidedVehicle;
    private Actor collidedPerson;
    private Actor collidedBackground;
    private Actor collidedFuel;
    private int counter = 0;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyAndMove();
        createBomb();
        checkCollision();
        click();
    }
    public void checkKeyAndMove()
    {
       if(((CarWorld) getWorld()).getPause() == false)
       {
          if(getX()<500)
          {
             if (Greenfoot.isKeyDown("right"))    
             {
                setLocation( getX()+2, getY() );
             }
             if (Greenfoot.isKeyDown("left"))    
             {
                setLocation( getX()-2, getY() );
             }
          }
          else
          {
             if (Greenfoot.isKeyDown("right"))    
             {
                //setLocation( getX()+(1/5), getY() );
                setLocation( 500, 550 );
             }
             if (Greenfoot.isKeyDown("left"))    
             {
                setLocation( getX()-(1/5), getY() );
             }
          }
          if(getX()>215)
          {
             if (Greenfoot.isKeyDown("right"))    
             {
                setLocation( getX()+2, getY() );
             }
             if (Greenfoot.isKeyDown("left"))    
             {
                setLocation( getX()-2, getY() );
             }
          }
          else
          {
             if (Greenfoot.isKeyDown("right"))    
             {
                setLocation( getX()+(1/5), getY() );
             }
             if (Greenfoot.isKeyDown("left"))    
             {
                setLocation( getX()-(1/5), getY() );
             }
          }
       }
    }
    public void createBomb()
    {
       if(((CarWorld) getWorld()).getPause() == false)
       {
          if(counter == 0)
          {
             if (Greenfoot.isKeyDown("space"))
             {
                getWorld().addObject(new Bomb(),getX(),getY());
                counter = 150;
             }
          }
          else
          {
             counter--;
          }
       }
   }
    public void checkCollision()
    {
        collidedVehicle = getOneIntersectingObject(Vehicle.class);
        collidedPerson = getOneIntersectingObject(Person.class);
        collidedBackground = getOneIntersectingObject(Background.class);
        collidedFuel = getOneIntersectingObject(Fuel.class);
        if (collidedVehicle != null)
        {
       
           getWorld().removeObject(collidedVehicle);
           ((CarWorld) getWorld()).collided();
           Greenfoot.playSound("Explosion.wav");
           setState("Collided");
        }
        if (collidedPerson != null)
        {
           setState("Collided");
           getWorld().removeObject(collidedPerson);
           ((CarWorld) getWorld()).collided();
           Greenfoot.playSound("Explosion.wav");
        }
        if(collidedBackground != null)
        {
     
           getWorld().removeObject(collidedBackground);
           ((CarWorld) getWorld()).collided();
           Greenfoot.playSound("Explosion.wav");
        }
        if(collidedFuel != null)
        {
            setState("CollidedFuel");

           getWorld().removeObject(collidedFuel);
           Greenfoot.playSound("Explosion.wav");
        }
    }
    public void click()
    {
       if(Greenfoot.mouseClicked(null))
       {
          if(((CarWorld) getWorld()).getPause() == false)
          {
             ((CarWorld) getWorld()).pauseGame(true);
             //getWorld().addObject(new Information(),300,300);
          }
       }
    }
}
