import java.util.*;
import java.util.Random;
class Main {
  
	public static void battleStart(){
		Scanner poke = new Scanner(System.in);
		System.out.println("Poké Fan Amelia is issuing a challenge!");
      System.out.println("she just used a Charizard .");
      System.out.print("Which Pokémon do you choose? ");
			System.out.print("You can choose from any of your favorite pokemon ");

			String  firstPoke = poke.next();
			System.out.println();
 	}
	 public static void damage() {
      Scanner stats = new Scanner(System.in);
      
      System.out.println("Your opponent's Charizard used blaze!");
      
      System.out.println("What are your Pokémon's base stats? ");
      
      System.out.print(" your pokemon's Level ");
      int level = stats.nextInt();
      System.out.print(" your pokemon's HP ");
      int hpBase = stats.nextInt();
      System.out.print(" your pokemon's Attack ");
      int attBase = stats.nextInt();
      System.out.print(" your pokemon's Defense ");
      int defBase = stats.nextInt();
      System.out.print(" your pokemon's Sp.Attack ");
      int spAttBase = stats.nextInt();
      System.out.print(" your pokemon's Sp.Defense ");
      int spDefBase = stats.nextInt();
      System.out.print(" your pokemon's Speed ");
      int speedBase = stats.nextInt();
      System.out.print(" your pokemon's Total Base ");
      int baseTotal = stats.nextInt();
			//System.out.println(poke);
			System.out.println(level);
			System.out.println(hpBase);
			System.out.println(attBase);
			System.out.println(defBase);
			System.out.println(spAttBase);
			System.out.println(spDefBase);
			System.out.println(speedBase);
			System.out.println(baseTotal);
		
									


      double modifier = 1.5 * (.85 + .15 * Math.random());
      
      double damageTaken = ( 
      (((2 * level * 10) / 250) * (attBase/defBase) * baseTotal + 2) * modifier
        );
        
      System.out.println("Charizard sustained " + (int)damageTaken + " points of damage.");
    }
    
	public static void main(String[] args) {
   battleStart();
	 damage();
  }
}
