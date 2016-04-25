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
            int chance = rand.nextInt(4);
            if(chance == 0)
            {
                army1.add(creature = new Human(rand.nextInt(31), rand.nextInt(19)));
            }
            else if(chance == 1)
            {
                army1.add(creature = new Elf(rand.nextInt(25), rand.nextInt(18)));
            }
            else if(chance == 2)
            {
                army1.add(creature = new CyberDemon(rand.nextInt(36), rand.nextInt(22)));
            }
            else
            {
                army1.add(creature = new Balrog(rand.nextInt(51), rand.nextInt(29)));
            }
        }
    }
    
    public void fillArmy2()
    {
        int i;
        for(i = 0; i < 10; i++)
        {
            int chance = rand.nextInt(4);
            if(chance == 0)
            {
                army2.add(creature = new Human(rand.nextInt(31), rand.nextInt(19)));
            }
            else if(chance == 1)
            {
                army2.add(creature = new Elf(rand.nextInt(25), rand.nextInt(18)));
            }
            else if(chance == 2)
            {
                army2.add(creature = new CyberDemon(rand.nextInt(36), rand.nextInt(22)));
            }
            else
            {
                army2.add(creature = new Balrog(rand.nextInt(51), rand.nextInt(29)));
            }
        }
    }
    
    public void battle()
    {
        int i1 = 0;
        int i2 = 0;
        while(i1 < army1.size() && i2 < army2.size())
        {
            while(army1.get(i1).getHP() > 0 && army2.get(i2).getHP() > 0)
            {
                army1.get(i1).takeDamage(army2.get(i2).damage());
                System.out.println("Army 2 attacked for " + army2.get(i2).damage() + " damage points");
                army2.get(i2).takeDamage(army1.get(i1).damage());
                System.out.println("Army 1 attacked for " + army1.get(1).damage() + " damage points");
            }
                if(army1.get(i1).getHP() <= 0)
                {
                   army1.remove(i1);
                   i1++;
                   System.out.println("Army 1's solider was killed by Army 2's soldier");
                }
                if(army2.get(i2).getHP() <= 0)
                {
                    army2.remove(i2);
                    i2++;
                    System.out.println("Army 2's solider was killed by Army 1's soldier");
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
   
    
