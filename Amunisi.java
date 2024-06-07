import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Amunisi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amunisi extends Actor
{
    /**
     * Act - do whatever the Amunisi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int JumlahMakanMusuh = 0;
    public void act()
    {
        setLocation(getX()-10, getY());
        move(3);
        if(getX() <= 5 || getX() >= getWorld().getWidth()){
            getWorld().removeObject(this);
            return;
        }
        eat();
        checkCollision();
    }
    public void eat(){
        Actor tengkorak;
        tengkorak = getOneObjectAtOffset(0,0,tengkorak.class);
        if(tengkorak != null){
            World world;
            world = getWorld();
            world.removeObject(tengkorak);
            addScore();
            JumlahMakanMusuh++;
        }
    }
    public void addScore(){
        if (!getWorld().getObjects(Counter.class).isEmpty()){
            ((Counter) getWorld().getObjects(Counter.class).get(0)).add(50);
        }
    }
    
    private void checkCollision()
    {
        // Implementasi logika tabrakan dengan objek lain jika diperlukan
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
