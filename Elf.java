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
    public Elf(int hp, int str)
    {
        super();
        super.setHP(hp);
        super.setStrength(str);

    }
    
    public int damage()
   {
       int randElfDam = rand.nextInt(10);
       
       if(randElfDam == 5)
       {
           return super.damage() * 2;
       }
       return super.damage();
   }
}