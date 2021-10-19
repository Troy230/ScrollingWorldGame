import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class swordsman extends Actor
{
    
    public void act()
    
    {
        move (1);
        if (Greenfoot.isKeyDown("D"))
            move (2);
        if (Greenfoot.isKeyDown("A"))
            move (-2);
    
    }
}
