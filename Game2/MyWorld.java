import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        swordsman swordsman = new swordsman();
        addObject(swordsman,27,367);
        enemy enemy = new enemy();
        addObject(enemy,557,358);
        arrow arrow = new arrow();
        addObject(arrow,527,358);
        cloud cloud = new cloud();
        addObject(cloud,53,84);
        cloud cloud2 = new cloud();
        addObject(cloud2,139,84);
        cloud cloud3 = new cloud();
        addObject(cloud3,234,83);
        cloud cloud4 = new cloud();
        addObject(cloud4,337,84);
        cloud cloud5 = new cloud();
        addObject(cloud5,437,86);
        cloud cloud6 = new cloud();
        addObject(cloud6,526,80);
        cloud6.setLocation(523,86);
    }
}
