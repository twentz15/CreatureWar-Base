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
   public Demon()
   {
        super();
        this.hp = hp;
        this.strength = strength;
   }
    
   public void setHP()
   {
        hp = (rand.nextInt(20) + 5);
   }
    
   public void setStr()
   {
        strength = (rand.nextInt(20) + 5);
   }
    
   public int damage()
   {
       int randDemDam = (rand.nextInt(20) + 1);
       super.damage();
       
       if(randDemDam == 4)
       {
           damage += 50;
       }
       
       return damage ;
   }
   
}
