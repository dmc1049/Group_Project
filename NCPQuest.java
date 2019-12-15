/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
import java.util.Random;
import java.util.Scanner;

public class NCPQuest {
	//create a quest based on the NCP character
		//Blacksmith
		//Witch
		//Shop Keeper
		//Inn
		//Trader
		//Other
	public static void NCPBlacksmith(){
		
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(11);
		Scanner NCPscan = new Scanner(System.in);
		String scanResult = "";
		
		if (rand_int1 <= 5) {
			 System.out.print("\n\tAdventurer, fight your way to the caves that are on the outskirts of town." + GameEngine.NEWLINE + 
	                    "\tThere you will find a dark cave with the letter S written in blood above its mouth." + GameEngine.NEWLINE + 
	                    "\tLook for a piece of Obsidian about 1 foot long and 6 inches wide. It will be in a  golden chest near the "
	                    + "back of the cave." + GameEngine.NEWLINE + "\tBe careful there is a Troll guarding the chest." + GameEngine.NEWLINE );
	            System.out.print(GameEngine.NEWLINE + "\tDo Adventurer accept the Quest? Y for Yes; N for No: ");
			scanResult = NCPscan.next();
			scanResult = scanResult.toUpperCase();
			if (scanResult.contentEquals("Y")) {
				BSCaves();
			}
			else {
				NCP_Characters.ncpBlackSmith();
			}
		}
		if(rand_int1 >=6) {
			System.out.print("\n\tYou will need to travel to the Swamp that is to the South-West of town." + GameEngine.NEWLINE + 
					"\tThere you will find a path through the swamp, follow it to the end where you will find a chest "
					+ "with the letter S on it." + GameEngine.NEWLINE + "\tLook for a piece of metal about 1 foot long and 6 inches "
					+ "wide. It will be in the chest." + GameEngine.NEWLINE + "\tBe careful there is a Hydra guarding the chest."
					+ GameEngine.NEWLINE );
			System.out.print(GameEngine.NEWLINE + "\tDo you accept the Quest? Y for Yes; N for No: ");
			scanResult = NCPscan.next();
			scanResult = scanResult.toUpperCase();
			if (scanResult.contentEquals("Y")) {
				BSSwamp();
			}
			else {
				NCP_Characters.ncpBlackSmith();
			}
		}
		
	}
	private static void BSSwamp() {
		// TODO Auto-generated method stub
		System.out.println("\tYou venture to the Swamp and when you get there you see the hydra circling the Chest.");
		//NCP_Characters.ncpBlackSmith();
		BattleMonster("BlackSmith","Hydra");
	}
	private static void BSCaves() {
		
		//System.out.println("You venture to the caves on the outskirts of town, you get afraid and turn around and run back to town with your tail between your legs");
		System.out.println("\tYou venture to the caves on the outskirts of town. You venture into the Cave and find "
				+ "the Troll sleeping on the Chest.");
		//NCP_Characters.ncpBlackSmith();
		BattleMonster("BlackSmith","Troll");
	}
	public static void NCPWizard() {
		//Wizard Quest Code
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(11);
		Scanner NCPscan = new Scanner(System.in);
		String scanResult = "";
		
		if (rand_int1 <= 5) {
			System.out.print("\tYou will need to travel to the Dark Forest North-West of Town to find the Stone Of Truth."
					+ GameEngine.NEWLINE + "\tLook for the path ringed with Roses, follow it." + GameEngine.NEWLINE + "\tAt the end of the path there is "  
					+ "a chest sitting in the middle of a small clearing. Get the Stoen from within the chest"
					+ "Be careful there is an Imp guarding the chest." + GameEngine.NEWLINE );
			System.out.print(GameEngine.NEWLINE + "\tDo you accept the Quest? Y for Yes; N for No: ");
			scanResult = NCPscan.next();
			scanResult = scanResult.toUpperCase();
			if (scanResult.contentEquals("Y")) {
				WStoneOfTruth();
			}
			else {
				NCP_Characters.ncpWizard();
			}
		}
		if(rand_int1 >=6) {
			System.out.print("\tYou will need to travel to the Abscale Mountains that is to the South-West of town." + GameEngine.NEWLINE + 
					"\tThere you will find a path up the mountain to the top. At the top you will find an HourGlass sitting on a"
					+ "pedistal." + GameEngine.NEWLINE + "\tBe careful there is a Troll guarding the chest." + GameEngine.NEWLINE );
			System.out.print(GameEngine.NEWLINE + "\tDo you accept the Quest? Y for Yes; N for No: ");
			scanResult = NCPscan.next();
			scanResult = scanResult.toUpperCase();
			if (scanResult.contentEquals("Y")) {
				WSandsOfTime();
			}
			else {
				NCP_Characters.ncpWizard();
			}
		}
	}
	private static void WStoneOfTruth() {
		// TODO Auto-generated method stub
		System.out.println("\tYou venture to the Grassy Swamp and when you get there you see an Imp walking around a Chest.");
		//NCP_Characters.ncpBlackSmith();
		BattleMonster("Wizard","Imp");
	}
	private static void WSandsOfTime() {
		
		//System.out.println("You venture to the caves on the outskirts of town, you get afraid and turn around and run back to town with your tail between your legs");
		System.out.println("\tYou venture to the Hanging Tree on the outskirts of town. You see a Zombie laying near the Chest.");
		//NCP_Characters.ncpBlackSmith();
		BattleMonster("Wizard","Troll");
	}
	public static void NCPWitch() {
		//Witch Quest Code
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(11);
		Scanner NCPscan = new Scanner(System.in);
		String scanResult = "";
		
		if (rand_int1 <= 5) {
			System.out.print(GameEngine.NEWLINE +"\tYou will need to travel to the Hanging Tree that is in the Dark Forest North-West of Twon."
					+ GameEngine.NEWLINE + "\tThere you will find a Chest that contains a potion I need." + GameEngine.NEWLINE +  
					"\tBe careful there is a Zombie guarding the chest." + GameEngine.NEWLINE );
			System.out.print(GameEngine.NEWLINE + "\tDo you accept the Quest? Y for Yes; N for No: ");
			scanResult = NCPscan.next();
			scanResult = scanResult.toUpperCase();
			if (scanResult.contentEquals("Y")) {
				WHangingTree();
			}
			else {
				NCP_Characters.ncpWitch();
			}
		}
		if(rand_int1 >=6) {
			System.out.print(GameEngine.NEWLINE +"\tYou will need to travel to the Grassy Swamp that is to the South-West of town." + GameEngine.NEWLINE + 
					"\tThere you will find a path through the Garassy Swamp, follow it to the end where you will find a "
					+ "chest." + GameEngine.NEWLINE + "\tLook for a piece of Old Wood in the chest, it will be about 1 foot long and 6 inches wide. "
					+ "It will be in the chest." + GameEngine.NEWLINE + "\tBe careful there is an Imp guarding the chest." + GameEngine.NEWLINE );
			System.out.print(GameEngine.NEWLINE + "\tDo you accept the Quest? Y for Yes; N for No: ");
			scanResult = NCPscan.next();
			scanResult = scanResult.toUpperCase();
			if (scanResult.contentEquals("Y")) {
				WGrassySwamp();
			}
			else {
				NCP_Characters.ncpWitch();
			}
		}
	}
	private static void WGrassySwamp() {
		// TODO Auto-generated method stub
		System.out.println("\tYou venture to the Grassy Swamp and when you get there you see an Imp walking around a Chest.");
		//NCP_Characters.ncpBlackSmith();
		BattleMonster("Witch","Imp");
	}
	private static void WHangingTree() {
		
		//System.out.println("You venture to the caves on the outskirts of town, you get afraid and turn around and run back to town with your tail between your legs");
		System.out.println("\tYou venture to the Hanging Tree on the outskirts of town. You see a Zombie laying near the Chest.");
		//NCP_Characters.ncpBlackSmith();
		BattleMonster("Witch","Zombie");
	}
	public static void BattleMonster(String NPC_Char, String Monster) {
		//get player data
			//hitpoints
			//Weapon Damage
			//health
			//coin
			//exp points
		//get monster data
			//hitpoints
			//Damage
			//exp points for player
			//Coin drop
		
		//Player strikes first
		
		int CharHitPoints, CharDamagePerHit, ExpPoints;
		CharHitPoints = Player.CHAR_HIT_POINTS;
		CharDamagePerHit = Player.CHAR_WEAPON_DAMAGE;
		ExpPoints = Player.CHAR_EXP_POINTS;
		
		int mhitPoints = 0, mdamagePerHit = 0, mExpPoints = 0, mCoin = 0;
		int result[] = MonsterTypeOne.MonsterOne(Monster);
		mhitPoints = result[0];
		mdamagePerHit = result[1];
		mExpPoints = result[2];
		mCoin = result[3];
		
		
		System.out.println("\tPlayer Hit Points: " + CharHitPoints);
		System.out.println("\tMonster Hit Points: " + mhitPoints);
		if(mhitPoints ==0) {
			System.out.print("\n\t The " + Monster + " saw you and died instantly!\n\n");
			//GameEngine.CurrentTown();
			Town.CurrentTown();
		}
		
		String OptionChoose = "";
		Scanner scannerBattle = new Scanner(System.in);
		
		while (OptionChoose != "R" && mhitPoints >=1) {
			System.out.print("\n\tA) Attack" + GameEngine.NEWLINE + "\tR) Run Away" + GameEngine.NEWLINE + "\tChoose Wisely: ");
			OptionChoose = scannerBattle.next();
			OptionChoose = OptionChoose.toUpperCase();
			
			switch(OptionChoose){
				case "A":
					//Attack
					System.out.println("\tYou Attack!!!\n");
					//Do hit code here
					mhitPoints = mhitPoints - RandNumPlayerAttack(CharDamagePerHit);
					System.out.println("\t--Current Battle Stats--");
					System.out.println("\tPlayer Hit Points: " + CharHitPoints);
					System.out.println("\tMonster Hit Points: " + mhitPoints);					
					
					if(mhitPoints <= 0) {
						System.out.println("\n\tYou have defeated the " + Monster + "...\n");
						Player.CHAR_EXP_POINTS = Player.CHAR_EXP_POINTS + mExpPoints;
						Player.CHAR_HIT_POINTS = CharHitPoints;
						Player.CHAR_COIN = Player.CHAR_COIN + mCoin;
						System.out.println("\tYou have gained " + mExpPoints + " Experience Points!");
						System.out.println("\tYou have gained " + mCoin + " Coin!");
						System.out.print("\tPress R to return to Shoppe Keeper or Current Town...");
						OptionChoose = scannerBattle.next();
						ReturnToNPC(NPC_Char);
					}
					if(mhitPoints >= 1) {
						CharHitPoints = CharHitPoints - RandNumMonsterAttack(mdamagePerHit);
						if(CharHitPoints <= 0) {
							CharHitPoints = 0;
							Player.CHAR_HIT_POINTS = CharHitPoints;
						}
						else if(CharHitPoints <= 0) {
							Player.CHAR_HIT_POINTS = CharHitPoints;
							System.out.println("\tYou Died! Press any key to return to town...");
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
					//Run Away From Monster
					System.out.println("\tYou Run Away!!!");
					ReturnToNPC(NPC_Char);
					break;
				default:
					//loop
					
			}// End Switch
		}// End While
		
		
		
	}// End Method
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
	public static void ReturnToNPC(String NPC_Char) {

		if(NPC_Char == "BlackSmith") {
			NCP_Characters.ncpBlackSmith();
		}
		if(NPC_Char == "Witch") {
			NCP_Characters.ncpWitch();
		}
		if(NPC_Char == "Wizard") {
			NCP_Characters.ncpWizard();
		}
		else {
			//GameEngine.CurrentTown();
			Town.CurrentTown();
		}
	}
}
