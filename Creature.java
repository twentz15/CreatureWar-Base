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
   
   public Creature(int hp, int strength)
   {
       if(hp < 5)
       {
           System.out.println("The health cannot be less than five");
           this.hp += 5;
       }
       else
       {
           this.hp = hp;
       }
       if(strength < 5)
       {
           System.out.println("The strength cannot be lower than five");
           this.strength += 5;
       }
       else
       {
           this.strength = strength;
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
<<<<<<< HEAD
       return dam.nextInt(strength) + 1;
   }
   
   public void takeDamage(int dmg)
   {
       hp -= dmg;
   }
=======
       //TODO: change this
       int damage;
       damage = (dam.nextInt(strength) + 1);
       
       return damage ;
    }
>>>>>>> parent of f095897... added unique values
    
}
