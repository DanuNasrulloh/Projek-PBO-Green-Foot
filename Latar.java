import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar extends World
{
    static Health health = new Health("Health = ");
    /**
     * Constructor for objects of class Latar.
     * 
     */
    public Latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(900)<5){
            addObject(new tengkorak(),Greenfoot.getRandomNumber(5)+1,330);
        }
        
         if(Greenfoot.getRandomNumber(900)<5){
            addObject(new BolaApi(),Greenfoot.getRandomNumber(5)+1,330);
        }
        
        if(Latar.health.getValue()==0){
            Greenfoot.setWorld(new game_over());
       }
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lantai lantai = new Lantai();
        addObject(lantai,53,374);
        Lantai lantai2 = new Lantai();
        addObject(lantai2,155,376);
        Lantai lantai3 = new Lantai();
        addObject(lantai3,262,376);
        Lantai lantai4 = new Lantai();
        addObject(lantai4,367,377);
        Lantai lantai5 = new Lantai();
        addObject(lantai5,468,380);
        Lantai lantai6 = new Lantai();
        addObject(lantai6,570,380);
        Lantai lantai7 = new Lantai();
        addObject(lantai7,674,382);
        Lantai lantai8 = new Lantai();
        addObject(lantai8,775,382);
        Penghias penghias = new Penghias();
        addObject(penghias,156,214);
        Portal portal = new Portal();
        addObject(portal,648,285);
        portal.setLocation(664,294);
        Pahlawan pahlawan = new Pahlawan();
        addObject(pahlawan,528,330);
        Penghias penghias2 = new Penghias();
        addObject(penghias2,762,235);
        Penghias penghias3 = new Penghias();
        addObject(penghias3,387,220);

        addObject(health,50,28);
        health.setValue(5);
        Counter counter = new Counter();
        addObject(counter,717,30);
        penghias2.setLocation(743,267);
    }
}
