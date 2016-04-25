import java.util.Random;
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private int hp;
    private int strength;
    Random rand = new Random();

    /**
     * Constructor for objects of class Human
     */
   public Demon(int hp, int str)
   {
        super();
        super.setHP(hp);
        super.setStrength(str);
   }
    
   public int damage()
   {
       int randDemDam = (rand.nextInt(20) + 1);
       
       if(randDemDam == 4)
       {
           return super.damage() + 50;
       }
       
       return super.damage();
   }
   
}
