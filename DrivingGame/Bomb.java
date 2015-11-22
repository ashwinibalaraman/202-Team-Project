import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb  extends ConcreteSubject
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private Actor collidedVehicle;
    private Actor collidedPerson;
    private Actor collidedBackground;
    public Bomb()
    {
       image1 = new GreenfootImage("explosion.png");
       image2 = new GreenfootImage("explosion-big.png");
    }
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       moveUp();
       check();
    }    
    public void moveUp()
    {
       if(((CarWorld) getWorld()).getPause() == false)
       {
          setLocation(getX(), getY()-4);
       }
    }
    public void check()
    {
       collidedVehicle = getOneIntersectingObject(Vehicle.class);
       collidedPerson = getOneIntersectingObject(Person.class);
       collidedBackground = getOneIntersectingObject(Background.class);
       if(collidedVehicle != null || collidedPerson != null || collidedBackground != null || getY() == 0)
       {
           //Counter counter = new Counter(this);
          setState("CollidedBomb");
          Greenfoot.playSound("Explosion.wav");
          if(collidedVehicle != null)
          {
             //((CarWorld) getWorld()).addScore(50);
             getWorld().removeObject(collidedVehicle);
          }
          if(collidedBackground != null)
          {
             //((CarWorld) getWorld()).addScore(75);
             getWorld().removeObject(collidedBackground);
          }
          if(collidedPerson != null)
          {
             //((CarWorld) getWorld()).addScore(100);
             getWorld().removeObject(collidedPerson);
          }
          
          getWorld().removeObject(this);
       }
    }
}
