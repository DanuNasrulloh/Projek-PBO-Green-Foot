import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class karakter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class karakter extends Actor
{
    /**
     * Act - do whatever the karakter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int verticalSpeed = 0;
    public void act()
    {
        // Add your action code here.
    }
    public void falling()
    {
        this.setLocation(this.getX(), this.getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + 1;
    }
    
    public boolean onGround(){
        Actor groundBelow;
        groundBelow = this.getOneObjectAtOffset(0,50, Lantai.class);
        
        if(groundBelow != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void checkFalling(){
        if (this.onGround() == true){
            verticalSpeed = 0;
        }
        else{
            this.falling();
        }
    }
    public void jump(){
        verticalSpeed = -8;
        this.falling();
    }
}