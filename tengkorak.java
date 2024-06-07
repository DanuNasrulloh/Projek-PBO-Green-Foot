import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tengkorak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tengkorak extends karakter
{
    /**
     * Act - do whatever the tengkorak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public tengkorak(){
        GreenfootImage myImage = getImage();
        int mynewHeight = (int)myImage.getHeight()/6;
        int mynewWidth = (int)myImage.getWidth()/6;
        myImage.scale(mynewWidth, mynewHeight);
    }
    public void act()
    {
        move(1);
        turn(Greenfoot.getRandomNumber(1));
    }
}
