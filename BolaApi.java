import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BolaApi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BolaApi extends Amunisi
{
    /**
     * Act - do whatever the BolaApi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public BolaApi(){
        GreenfootImage myImage = getImage();
        int mynewHeight = (int)myImage.getHeight()/2;
        int mynewWidth = (int)myImage.getWidth()/2;
        myImage.scale(mynewWidth, mynewHeight);
    }
    public void act()
    {
        move(2);
        turn(Greenfoot.getRandomNumber(1));
    }
}
