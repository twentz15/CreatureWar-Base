import java.util.Random;
/**
 * Write a description of class Hman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private int hp;
    private int strength;
    Random rand = new Random();

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super();
        this.hp = (rand.nextInt(25) + 5);
        this.strength = (rand.nextInt(13) + 5);
    }
    
    public void setHP()
    {
        hp = (rand.nextInt(25) + 5);
    }
    
    public void setStr()
    {
        strength = (rand.nextInt(13) + 5);
    }
    
   
}
