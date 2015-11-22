import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fuel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuel  extends Actor
{
    private GreenfootImage image1;
    private Actor collided;
    public Fuel()
    {
       image1 = new GreenfootImage("fuel.png");
       randomImage();
       setRotation(0);
    }
    /**
     * Act - do whatever the Fuel wants to do. This method is called whenever
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
          //collided = getOneIntersectingObject(PedestrianCrossing.class);
          /*if (collided == null)
          {
             setLocation(getX(), getY()+Greenfoot.getRandomNumber(3)+5);
          }
          else
          {
             setLocation(getX(), getY()+Greenfoot.getRandomNumber(4));
          }*/
          setLocation(getX(), getY()+Greenfoot.getRandomNumber(3)+5);
       }
    }
    public void randomImage()
    {
       if (Greenfoot.getRandomNumber(4)<1)
       {
          setImage(image1);
       }
       
    }
    public void check()
    {
        collided = getOneIntersectingObject(Fuel.class);
       if (collided != null){
           getWorld().removeObject(this);
        }
       else if (getY()>=(getWorld().getHeight()-1))
        {
           getWorld().removeObject(this);
        }
        //getWorld().removeObject(this);
    }
}
