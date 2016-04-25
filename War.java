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
        for(i = 0; i < 10; i++)
        {
            int chance = rand.nextInt(3);
            if(chance == 0)
            {
                army1.add(human= new Human());
            }
            else if(chance == 1)
            {
                army1.add(elf = new Elf());
            }
            else if(chance == 2)
            {
                army1.add(cyberDemon = new CyberDemon());
            }
            else
            {
                army1.add(balrog = new Balrog());
            }
        }
    }
    
    public void fillArmy2()
    {
        int i;
        for(i = 0; i < 10; i++)
        {
            int chance = rand.nextInt(3);
            if(chance == 0)
            {
                army2.add(human= new Human());
            }
            else if(chance == 1)
            {
                army2.add(elf = new Elf());
            }
            else if(chance == 2)
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
        int i1 = 0;
        int i2 = 0;
        boolean finished = false;
        while(!finished)
        {
            while(army1.get(i1).getHP() > 0 && army2.get(i2).getHP() > 0)
            {
                army1.get(i1).takeDamage(army2.get(i2).damage());
                System.out.println("Army 2 dealt " + army2.get(i2).damage() + " damage");
                army2.get(i2).takeDamage(army1.get(i1).damage());
                System.out.println("Army 1 dealt " + army1.get(i1).damage() + " damage");
            }
                if(army1.get(i1).getHP() <= 0)
                {
                   army1.remove(i1);
                   i1++;
                   System.out.println("Army 1 lost a soldier");
                   if(i1 == army1.size())
                   {
                       finished = true;
                    }
                }
                if(army2.get(i2).getHP() <= 0)
                {
                    army2.remove(i2);
                    i2++;
                    System.out.println("Army 2 lost a soldier");
                    if(i2 == army2.size())
                   {
                       finished = true;
                    }
                }
      
        }
        if(i1 < army1.size() && i2 >= army2.size())
        {
            System.out.println("Army 1 Wins!!!");
            System.out.println("Be Sure To Clear before another battle");
        }
        else if(i1 >= army1.size() && i2 < army2.size())
        {
            System.out.println("Army 2 Wins!!!");
            System.out.println("Be Sure To Clear before another battle");
        }
        else
        {
            System.out.println("NOBODY Wins!!!");
            System.out.println("Be Sure To Clear before another battle");
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
   
    public void clearField()
    {
        army1.clear();
        army2.clear();
    }

}
