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
    
    private boolean finished = false;
    private boolean army1Van = false;
    private boolean army2Van = false;

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
    
    public void fillArmy2()
    {
        int i;
        for(i = 0; i < 25; i++)
        {
            int chance = rand.nextInt(3) + 1;
            if(chance > 1)
            {
                army2.add(cyberDemon = new CyberDemon());
            }
            else
            {
                army2.add(balrog = new Balrog());
            }
        }
    }
    
    public void battle()
    {
        
        fillArmy1();
        fillArmy2();
        
        int i1 = 0;
        int i2 = 0;
        while(i1 < army1.size() && i2 < army2.size())
        {
            while(army1.get(i1).getHP() > 0 && army2.get(i2).getHP() > 0)
            {
                army1.get(i1).takeDamage(army2.get(i2).damage());
                army2.get(i2).takeDamage(army1.get(i1).damage());
            }
                if(army1.get(i1).getHP() <= 0)
                {
                   army1.remove(i1);
                   i1++;
                   System.out.println("Army 1's solider was killed by Army 2's soldier");
                   System.out.println("They dealt " + army2.get(i2).damage());
                }
                if(army2.get(i2).getHP() <= 0)
                {
                    army2.remove(i2);
                    i2++;
                    System.out.println("Army 2's solider was killed by Army 1's soldier");
                    System.out.println("They dealt " + army2.get(i2).damage());
                }
                
            }
        if(i1 < army1.size() && i2 >= army2.size())
        {
            System.out.println("Army 1 Wins!!!");
            army1.clear();
            army2.clear();
        }
        else if(i1 >= army1.size() && i2 < army2.size())
        {
            System.out.println("Army 2 Wins!!!");
            army1.clear();
            army2.clear();
        }
        else
        {
            System.out.println("NOBODY Wins!!!");
            army1.clear();
            army2.clear();
        }
    }
    //         if(army1.size() <= i1)
    //         {
    //             System.out.println("Army 2 Wins");
    //             army1.clear();
    //             army2.clear();
    //         }
    //         else
    //         {    
    //             System.out.println("Army 1 Wins");
    //             army1.clear();
    //             army2.clear();
    //         }
   }
    
