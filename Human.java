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
    public Human(int hp, int str)
    {
        super();
        if(hp < 5)
        {
            super.setHP(hp += 5);
        }
        else if(hp > 30)
        {
            int temp;
            temp = hp - 30;
            super.setHP(hp -= temp);
        }
        else
        {
            super.setHP(hp);
        }
        
        if(str < 5)
        {
            super.setStrength(str += 5);
        }
        else if(str > 18)
        {
            int temp;
            temp = str - 18;
            super.setStrength(str -= temp);
        }
        else
        {
            super.setStrength(str);
        }
    }
   
}
