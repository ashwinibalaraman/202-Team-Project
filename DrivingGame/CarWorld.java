import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWorld extends World
{
    private int counter;
    //private int lives;
    //private int score;
    private boolean pause;
     /**
     * Constructor for objects of class CarWorld.
     * 
     */
    public CarWorld()
    {
        super(600, 600, 1);

        setPaintOrder(ScoreBoard.class, Dot.class, Path.class, Car.class, Bomb.class, Vehicle.class, Person.class, PedestrianCrossing.class,EndLine.class, Line.class, Counter.class, Lives.class, Background.class, Fuel.class);
        Greenfoot.playSound("BackgroundMusic.mid");
        //lives = 3;
        //score = 0;
        pause = true;
        Car car = new Car();
        addObject(car,305,550);
        addObject(new Counter(car),100,550);
        addObject(new Lives(car),50,50);
        addObject(new Lives(car),100,50);
        addObject(new Lives(car),150,50);
        addObject(new Dot(), 25, 395);
        addObject(new Path(), 25, 250);
        addObject(new Line(),300,0);
        addObject(new Line(),300,90);
        addObject(new Line(),300,180);
        addObject(new Line(),300,270);
        addObject(new Line(),300,360);
        addObject(new Line(),300,450);
        addObject(new Line(),300,540);
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+450, Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+450, Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+450, Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+450, Greenfoot.getRandomNumber(600));
        addObject(new Background(), Greenfoot.getRandomNumber(150)+450, Greenfoot.getRandomNumber(600));
        //addObject(new Information(),300,300);
        pause = false; //start game
    }
    public void act()
    {
       if(pause == false)
       {
          chanceToVehicle();
          chanceToBackground();
          setCounter();
          chanceToPedestrianCrossing();
          chanceToFuel();
       }
    }
    public void chanceToBackground()
    {
       if(Greenfoot.getRandomNumber(50)<1)
       {
          addObject(new Background(), Greenfoot.getRandomNumber(150), 0);
       }
       if(Greenfoot.getRandomNumber(50)<1)
       {
          addObject(new Background(), Greenfoot.getRandomNumber(150)+450, 0);
       }
    }
    public void chanceToVehicle()
    {
       if(Greenfoot.getRandomNumber(100)<1)
       {
          addObject(new Vehicle(), Greenfoot.getRandomNumber(185)+215, 0);
       }
    }
    
    public void chanceToFuel()
    {
       if(Greenfoot.getRandomNumber(100)<1)
       {
          addObject(new Fuel(), Greenfoot.getRandomNumber(185)+215, 0);
       }
    }
    
    public void setCounter()
    {
       counter++;
       if (counter == 23)
       {
         addObject(new Line(),300,0);
         counter = 0;
       }
    }
    public void chanceToPedestrianCrossing()
    {
       if (Greenfoot.getRandomNumber(1000)<1)
       {
          addObject(new PedestrianCrossing(), 220, 0);
          addObject(new PedestrianCrossing(), 280, 0);
          addObject(new PedestrianCrossing(), 340, 0);
          addObject(new PedestrianCrossing(), 400, 0);
          addObject(new Person(), 180, 0);
       }
    }
    /*public int getScore()
    {
       return score;
    }
    public void addScore(int scoreToAdd)
    {
       score += scoreToAdd;
    }
    public int getLives()
    {
       return lives;
    }
    public void collided()
    {
       lives--;
    }*/
    public boolean getPause()
    {
       return pause;
    }
    public void pauseGame(boolean paused)
    {
       pause = paused;
    }
}
