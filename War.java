import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class War here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class War
{
    // instance variables - replace the example below with your own
    Creature creature = new Creature();
    Human human = new Human();
    Elf elf = new Elf();
    Demon demon = new Demon();
    CyberDemon cyberDemon = new CyberDemon();
    Balrog balrog = new Balrog();
    
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    Random rand = new Random();

    /**
     * Constructor for objects of class War
     */
    public War()
    {
        // initialise instance variables
        this.army1 = new ArrayList<Creature>();
        this.army2 = new ArrayList<Creature>();
    }
    
    public void fillArmy1()
    {
        
        int i;
        for(i = 0; i < 25; i++)
        {
            int chance = rand.nextInt(3) + 1;
            if(chance > 1)
            {
                army1.add(human= new Human());
            }
            else
            {
                army1.add(elf = new Elf());
            }
        }
    }

    
}
