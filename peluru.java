import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends Amunisi
{
    /**
     * Act - do whatever the peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public peluru(){
        GreenfootImage myImage = getImage();
        int mynewHeight = (int)myImage.getHeight()/6;
        int mynewWidth = (int)myImage.getWidth()/6;
        myImage.scale(mynewWidth, mynewHeight);
    }
}
