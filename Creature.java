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
   Random dam = new Random();
   
   public Creature()
   {
       hp = 10;
       strength = 10;
   }
   
   public void setHP(int health)
   {
       if(health < 5)
       {
           health += 5;
           hp = health;
       }
       else
       {
           hp = health;
       }
        
   }
   
   public void setStrength(int str)
   {
       if(str < 5)
       {
           str += 5;
           strength = str;
       }
       else
       {
           strength = str;
       }
   }
   
       
   public int getHP()
   {
       return hp;
   }
   
   public int getStrength()
   {
       return strength;
   }
   
   public int damage()
   {
       return dam.nextInt(strength) + 1;
   }
   
   public void takeDamage(int dmg)
   {
       hp -= dmg;
   }
    
}
