import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TombolReset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolReset extends Tombol
{
    /**
     * Act - do whatever the TombolReset wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TombolReset(){
        GreenfootImage myImage = getImage();
        int mynewHeight = (int)myImage.getHeight()/1;
        int mynewWidth = (int)myImage.getWidth()/1;
        myImage.scale(mynewWidth, mynewHeight);
    
    }
    public void act()
    {
    if (Greenfoot.mousePressed(this)) {
        // Menyusutkan gambar tombol saat ditekan
        getImage().scale((int) Math.round(getImage().getWidth() * 0.9),
        (int) Math.round(getImage().getHeight() * 0.9));
                
        // Menunggu beberapa saat sebelum mengganti dunia
        Greenfoot.delay(5);
        
        // Membuat instansiasi dunia baru (misalnya, Latar)
        Greenfoot.setWorld(new Start());
    }
    }
}
