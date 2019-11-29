import java.util.Random;
import java.util.Scanner;

public class BattleEngine {
	
	//Testing Battle Engine
	
	public static int RandNumPlayerAttack(int CharDamagePerHit) {
		
		Random randNum = new Random();
		int newCharDamagePerHit = randNum.nextInt(CharDamagePerHit);
		
		return newCharDamagePerHit;
	}
	public static int RandNumMonsterAttack(int mdamagePerHit) {
		Random randNum = new Random();
		int newmdamagePerHit = randNum.nextInt(mdamagePerHit);
		
		return newmdamagePerHit;
	}
	public static void BattleMonster(String Monster) {
		//get player data
			//hit points
			//Weapon Damage
			//health
			//coin
			//exp points
		//get monster data
			//hit points
			//Damage
			//exp points for player
			//Coin drop
		
		//Player strikes first
		
		int CharHitPoints, CharDamagePerHit, ExpPoints;
		CharHitPoints = Player.CHAR_HIT_POINTS;
		CharDamagePerHit = Player.CHAR_WEAPON_DAMAGE;
		ExpPoints = Player.CHAR_EXP_POINTS;
		
		int mhitPoints = 0, mdamagePerHit = 0, mExpPoints = 0, mCoin = 0;
		if(Monster == "Troll") {
			int result[] = MonsterTypeOne.Troll();
			  //System.out.println(result[0] + result[1]); //retrieve from monster char
			  mhitPoints = result[0];
			  mdamagePerHit = result[1];
			  mExpPoints = result[2];
			  mCoin = result[3];
		}
		if(Monster == "Imp") {
			int result[] = MonsterTypeOne.Imp();
			  //System.out.println(result[0] + result[1]); //retrieve from monster char
			  mhitPoints = result[0];
			  mdamagePerHit = result[1];
			  mExpPoints = result[2];
			  mCoin = result[3];
		}
		if(Monster == "Hydra") {
			int result[] = MonsterTypeOne.Hydra();
			  //System.out.println(result[0] + result[1]); //retrieve from monster char
			  mhitPoints = result[0];
			  mdamagePerHit = result[1];
			  mExpPoints = result[2];
			  mCoin = result[3];
		}
		if(Monster == "Zombie") {
			int result[] = MonsterTypeOne.Zombie();
			  //System.out.println(result[0] + result[1]); //retrieve from monster char
			  mhitPoints = result[0];
			  mdamagePerHit = result[1];
			  mExpPoints = result[2];
			  mCoin = result[3];
		}
		if(Monster == "Other") {
			int result[] = MonsterTypeOne.Other();
			  //System.out.println(result[0] + result[1]); //retrieve from monster char
			  mhitPoints = result[0];
			  mdamagePerHit = result[1];
			  mExpPoints = result[2];
			  mCoin = result[3];
		}
		System.out.print("\n\tMonster Hit Points: " + mhitPoints);
		if(mhitPoints ==0) {
			System.out.print("\n\t The " + Monster + " saw you and died instantly!\n\n");
			GameEngine.CurrentTown();
		}
		System.out.print("\n\tPlayer Hit Points: " + CharHitPoints +"\n");
		String OptionChoose = "";
		Scanner scannerBattle = new Scanner(System.in);
		
		while (OptionChoose != "R" && mhitPoints >=1) {
			System.out.println("\tA) Attack" + GameEngine.NEWLINE + "\tR) Run Away" + GameEngine.NEWLINE + "\tChoose Wisely:");
			OptionChoose = scannerBattle.next();
			OptionChoose = OptionChoose.toUpperCase();
			//System.out.println("----" + OptionChoose);
			
			switch(OptionChoose){
				case "A":
					//Attack
					System.out.println("\tYou Attack!!!");
					//Do hit code here
					mhitPoints = mhitPoints - RandNumPlayerAttack(CharDamagePerHit);
					System.out.println("\t--Current Battle Stats--");
					System.out.println("\tPlayer Hit Points: " + CharHitPoints);
					System.out.println("\tMonster Hit Points: " + mhitPoints);
					System.out.println("");
					
					
					if(mhitPoints <= 0) {
						System.out.println("You have defeated the " + Monster + "...");
						System.out.print("\nYou hit the " + Monster + " so hard that you split it in two!!!\n");
						Player.CHAR_EXP_POINTS = Player.CHAR_EXP_POINTS + mExpPoints;
						Player.CHAR_HIT_POINTS = CharHitPoints;
						Player.CHAR_COIN = Player.CHAR_COIN + mCoin;
						System.out.println("You have gained " + mExpPoints + " Experience Points!");
						System.out.println("You have gained " + mCoin + " Coin!");
						System.out.println("Press R to go to Town...");
						OptionChoose = scannerBattle.next();
						GameEngine.CurrentTown();
					}
					if(mhitPoints >= 1) {
						CharHitPoints = CharHitPoints - RandNumMonsterAttack(mdamagePerHit);
						if(CharHitPoints <= 0) {
							CharHitPoints = 0;
							Player.CHAR_HIT_POINTS = CharHitPoints;
						}
						else if(CharHitPoints <= 0) {
							Player.CHAR_HIT_POINTS = CharHitPoints;
							System.out.print("\n\tYou Died! Press any key to return to town...\n");
							OptionChoose = scannerBattle.next();
							GameEngine.CurrentTown();
						}
						else if (CharHitPoints >=1) {
							Player.CHAR_HIT_POINTS = CharHitPoints;
						}
					}
					break;
				case "R":
					//Run Away
					System.out.println("\n\tYou Run Away!!!\n");
					GameEngine.CurrentTown();
					
					break;
				default:
					//loop
					
			}// End Switch
		}// End While
		
		
		
	}// End Method
}
