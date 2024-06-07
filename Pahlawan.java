import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pahlawan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pahlawan extends karakter
{
    /**
     * Act - do whatever the Pahlawan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Pahlawan(){
        GreenfootImage myImage = getImage();
        int mynewHeight = (int)myImage.getHeight()/3;
        int mynewWidth = (int)myImage.getWidth()/3;
        myImage.scale(mynewWidth, mynewHeight);
    
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5,getY());
        }
        
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5,getY());
        }
        
        if(Greenfoot.isKeyDown("up")){
            this.jump();
        }
        BolaApi bolaapi = (BolaApi) getOneIntersectingObject(BolaApi.class);
        if( bolaapi != null){
            getWorld().removeObject(bolaapi);
            Latar.health.add(-1);
            Greenfoot.playSound("damagee.mp3");
        }
        
        this.checkKeyPress();
        this.falling();
        this.checkFalling();
    }
     private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("space") )
        {
            shoot();
        }
    }

    private void shoot()
    {
        peluru peluru = new peluru();
        getWorld().addObject(peluru, getX(), getY());
        Greenfoot.playSound("tembakann.mp3");
    }
}
