import java.util.Random;
/**
 * Write a description of class CyberDemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    private int hp;
    private int strength;
    Random rand = new Random();
    
    public CyberDemon()
    {
        super();
        this.hp = (rand.nextInt(20) + 5);
        this.strength = (rand.nextInt(12) + 5);
    }
    
    public void setHP()
    {
        hp = (rand.nextInt(20) + 5);
    }
    
    public void setStr()
    {
        strength = (rand.nextInt(12) + 5);
    }
    
}
