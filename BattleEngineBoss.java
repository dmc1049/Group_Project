/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
import java.util.Random;
import java.util.Scanner;

public class BattleEngineBoss {
	
		//Testing Boss Battle Engine
		
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
			int result[] = MonsterTypeBoss.MonsterBoss(Monster);
			mhitPoints = result[0];
			mdamagePerHit = result[1];
			mExpPoints = result[2];
			mCoin = result[3];
			if(mhitPoints <= 0) {
				System.out.println("Monster " + Monster + " has zero hitpoints");
				BattleMonster(Monster);
			}
			System.out.print("\n\tPlayer Hit Points: " + CharHitPoints);
			System.out.print("\n\tMonster Hit Points: " + mhitPoints + "\n");
			if(mhitPoints ==0) {
				System.out.print("\n\t The " + Monster + " saw you and died instantly!\n\n");
				//GameEngine.CurrentTown();
				Town.CurrentTown();
			}
			
			String OptionChoose = "";
			Scanner scannerBattle = new Scanner(System.in);
			
			while (OptionChoose != "R" && mhitPoints >=1) {
				System.out.print("\tA) Attack" + GameEngine.NEWLINE + "\tR) Run Away" + GameEngine.NEWLINE + "\tChoose Wisely:");
				OptionChoose = scannerBattle.next();
				OptionChoose = OptionChoose.toUpperCase();
				//System.out.println("----" + OptionChoose);
				
				switch(OptionChoose){
					case "A":
						//Attack
						System.out.println("\tYou Attack!!!");
						//Do hit code here
						mhitPoints = mhitPoints - RandNumPlayerAttack(CharDamagePerHit);
						System.out.println("\n\t--Current Battle Stats--");
						System.out.println("\tPlayer Hit Points: " + CharHitPoints);
						System.out.println("\tMonster Hit Points: " + mhitPoints);
						System.out.println("");
						
						
						if(mhitPoints <= 0) {
							System.out.println("\tYou have defeated the " + Monster + "...");
							System.out.print("\t\nYou hit the " + Monster + " so hard that you split it in two!!!\n\n");
							Player.CHAR_EXP_POINTS = Player.CHAR_EXP_POINTS + mExpPoints;
							Player.CHAR_HIT_POINTS = CharHitPoints;
							Player.CHAR_COIN = Player.CHAR_COIN + mCoin;
							Player.CHARACTER_LEVEL = Player.CHARACTER_LEVEL + 1;
							Player.CHAR_MAX_HIT_POINTS = ((int) ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded)/2;
							System.out.println("\tYou have gained " + mExpPoints + " Experience Points!");
							System.out.println("\tYou have gained " + mCoin + " Coin!");
							System.out.print("\tPress R to continue on to the next Town...");
							OptionChoose = scannerBattle.next();
							//GameEngine.CurrentTown();
							Town.CurrentTown();
						}
						if(mhitPoints >= 1) {
							CharHitPoints = CharHitPoints - RandNumMonsterAttack(mdamagePerHit);
							if(CharHitPoints <= 0) {
								CharHitPoints = 0;
								Player.CHAR_HIT_POINTS = CharHitPoints;
								System.out.print("\n\tYou Died! Press any key to return to town...\n");
								OptionChoose = scannerBattle.next();
								//GameEngine.CurrentTown();
								Town.CurrentTown();
							}
							else if (CharHitPoints >=1) {
								Player.CHAR_HIT_POINTS = CharHitPoints;
							}
						}
						break;
					case "R":
						//Run Away
						System.out.println("\n\tYou Run Away!!!\n");
						//GameEngine.CurrentTown();
						Town.CurrentTown();
						
						break;
					default:
						//loop
						
				}// End Switch
			}// End While
			
			
			
		}// End Method


	
}
