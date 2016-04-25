import java.util.Random;
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private int hp;
    private int strength;
    Random rand = new Random();

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog(int hp, int str)
    {
        super(hp, str);
    }
    
    public void setHP()
    {
        hp = (rand.nextInt(30) + 5);
    }
    
    public void setStr()
    {
        strength = (rand.nextInt(10) + 5);
    }
    
    public int damage()
   {
       return super.damage() + super.damage();
   }
    
   
}
