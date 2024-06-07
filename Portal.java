import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Penghias
{
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        eatApi();
    }
    public void eatApi(){
        Actor BolaApi;
        Actor tengkorak;
        BolaApi = getOneObjectAtOffset(0,0,BolaApi.class);
        if(BolaApi != null){
            World world;
            world = getWorld();
            world.removeObject(BolaApi);
        }
        tengkorak = getOneObjectAtOffset(0,0,tengkorak.class);
        if(tengkorak != null){
            World world;
            world = getWorld();
            world.removeObject(tengkorak);
        }
    }
}
