import java.util.Random;
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    private int hp;
    private int strength;
    Random rand = new Random();

    /**
     * Constructor for objects of class Human
     */
    public Elf()
    {
        super();
        this.hp = hp;
        this.strength = strength;
    }
    
    public void setHP()
    {
        hp = (rand.nextInt(15) + 5);
    }
    
    public void setStr()
    {
        strength = (rand.nextInt(20) + 5);
    }
    
   
}