import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   protected int hp;
   protected int strength;
   protected int damage;
   Random dam = new Random();
   
   public Creature()
   {
       hp = 10;
       strength = 10;
   }
   
   public Creature(int hp, int strength)
   {
       if(hp > 5)
       {
           System.out.println("The health cannot be less than five");
       }
       else
       {
           this.hp = hp;
       }
       if(strength > 5)
       {
           System.out.println("The strength cannot be lower than five");
       }
       else
       {
           this.strength = strength;
       }
    }
    
   public int damage()
   {
       damage = (dam.nextInt(strength) + 1);
       
       return damage ;
   }
   
   public void takeDamage()
   {
       hp = hp - damage;
   }
    
}
