import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.awt.Font;

/**
 * Counter that displays a number.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class Counter extends Actor
{
    public static int value = 0;
    public static int target = 0;
    public static String text;
    public static int stringLength;
    public Counter()
    {
        this("");
    }
    public Counter(String prefix)
    {
        value = 0;
        target = 0;
        text = prefix;
        stringLength = (text.length() + 2) * 16;

        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        
        updateImage();
    }
    public void act()
    {
       target = ((CarWorld) getWorld()).getScore();
       if(value > target)
       {
          value = 0;
          updateImage();
       }
       updateImage();
    }
    public void add(int score)
    {
        target += score;
    }
    public int getValue()
    {
        return value;
    }
    /**
     * Make the image
     */
    public void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + target, 1, 18);
    }
}
