import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TombolStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolStart extends Tombol
{
    /**
     * Act - do whatever the TombolStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public TombolStart() {
        GreenfootImage myImage = getImage();
        int mynewHeight = (int)myImage.getHeight()/2;
        int mynewWidth = (int)myImage.getWidth()/2;
        myImage.scale(mynewWidth, mynewHeight);
    }

    // Override metode act untuk menangani klik tombol
    public void act() {
        if (Greenfoot.mousePressed(this)) {
            // Beralih ke tampilan Latar
            Greenfoot.setWorld(new Latar());
        }
    }
}
