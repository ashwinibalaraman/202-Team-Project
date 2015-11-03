import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle  extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private Actor collided;
    private Actor collidedVehicle;
    public Vehicle()
    {
       image1 = new GreenfootImage("ambulance.png");
       image2 = new GreenfootImage("rocket.png");
       image3 = new GreenfootImage("car03.png");
       image4 = new GreenfootImage("car01.png");
       randomImage();
       setRotation(90);
    }
    /**
     * Act - do whatever the Vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveDown();
        check();
    }
    public void moveDown()
    {
       if(((CarWorld) getWorld()).getPause() == false)
       {
          collided = getOneIntersectingObject(PedestrianCrossing.class);
          if (collided == null)
          {
             setLocation(getX(), getY()+Greenfoot.getRandomNumber(3)+5);
          }
          else
          {
             setLocation(getX(), getY()+Greenfoot.getRandomNumber(4));
          }
       }
    }
    public void randomImage()
    {
       if (Greenfoot.getRandomNumber(4)<1)
       {
          setImage(image1);
       }
       else if (Greenfoot.getRandomNumber(4)<1)
       {
          setImage(image2);
       }
       else if (Greenfoot.getRandomNumber(4)<1)
       {
          setImage(image3);
       }
       else
       {
          setImage(image4);
       }
    }
    public void check()
    {
        collided = getOneIntersectingObject(Vehicle.class);
        if (collided != null || getY()>=(getWorld().getHeight()-1))
        {
           getWorld().removeObject(this);
        }
    }
}
