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
	private static final String NEWLINE = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
	
	public static void NCPBlacksmith(){
		
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(10);
		Scanner NCPscan = new Scanner(System.in);
		String scanResult = "";
		
		if (rand_int1 <= 5) {
			System.out.print("You will need to travel to the caves that are on the outskirts of town." + NEWLINE + "There you will find a cave with the letter S above its opening." + NEWLINE + "Look for a piece of metal about 1 foot long and 6 inches wide. It will be in a chest near the back of the cave." + NEWLINE + "Be careful there is a Troll guarding the chest." + NEWLINE );
			System.out.println(" Do you accept the Quest? Y for Yes; N for No: ");
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
			System.out.println("You will need to travel to the Swamp that is to the South-West of town." + NEWLINE + "There you will find a path through the swamp, follow it to the end where you will find a chest with the letter S on it." + NEWLINE + "Look for a piece of metal about 1 foot long and 6 inches wide. It will be in the chest." + NEWLINE + "Be careful there is a Hydra guarding the chest." + NEWLINE );
			System.out.println(" Do you accept the Quest? Y for Yes; N for No: ");
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
		System.out.println("You venture to the Swamp and when you get there, you are scared. You turn around and run back to town.");
		NCP_Characters.ncpBlackSmith();
	}
	private static void BSCaves() {
		
		//System.out.println("You venture to the caves on the outskirts of town, you get afraid and turn around and run back to town with your tail between your legs");
		System.out.println("You venture to the caves on the outskirts of town. You venture into the Cave and find the Troll sleeping on the Chest.");
		//NCP_Characters.ncpBlackSmith();
		BattleMonster("BlackSmith","Troll");
	}
	public static void NCPWizard() {
	
	}
	public static void NCPWitch() {
		
	}
	public static void BattleMonster(String NPC_Char, String Monster) {
		//get player data
			//hitpoints
			//Weapon Damage
			//health
			//
		//get monster data
		//Player strikes first
		//Player Hit points
		//Player Attack damage
		int CharHitPoints, CharDamagePerHit;
		CharHitPoints = Player.CHAR_HIT_POINTS + Player.CHAR_ARMOR_POINTS;
		CharDamagePerHit = Player.CHAR_WEAPON_DAMAGE;
		
		int mhitPoints = 0, mdamagePerHit = 0;
		if(Monster == "Troll") {
			int result[] = MonsterTypeOne.Troll();
			  //System.out.println(result[0] + result[1]); //retrieve from monster char
			  mhitPoints = result[0];
			  mdamagePerHit = result[1];
		}
		System.out.println("Monster Hit Points at init: " + mhitPoints);
		String OptionChoose = "";
		Scanner scannerBattle = new Scanner(System.in);
		
		while (OptionChoose != "R") {
			System.out.println("A) Attack" + NEWLINE + "R) Run Away" + NEWLINE + "Choose Wisely:");
			OptionChoose = scannerBattle.next();
			OptionChoose.toUpperCase();
			
			switch(OptionChoose){
				
				case "A":
					//Attack
					System.out.println("You Attack!!!");
					//Do hit code here
					//BattleMonster(NPC_Char, Monster);
	
					mhitPoints = mhitPoints - RandNumPlayerAttack(CharDamagePerHit);
					
					System.out.println("Player Hit Points: " + CharHitPoints);
					System.out.println("Monster Hit Points: " + mhitPoints);
					
					if(mhitPoints <= 0) {
						System.out.println("You have defeated the " + Monster + "...");
						System.out.println("Press any key to return to town...");
						OptionChoose = scannerBattle.next();
						if(NPC_Char == "BlackSmith") {
							NCP_Characters.ncpBlackSmith();
						}
						if(NPC_Char == "Witch") {
							NCP_Characters.ncpWitch();
						}
						else {
							GameEngine.CurrentTown();
						}
					}
					if(mhitPoints >= 1) {
						CharHitPoints = CharHitPoints - RandNumMonsterAttack(mdamagePerHit);
						if(CharHitPoints < 0) {
							CharHitPoints = 0;
							Player.CHAR_HIT_POINTS = CharHitPoints;
						}
						if(CharHitPoints <=0) {
							System.out.println("You Died! Press any key to return to town...");
							OptionChoose = scannerBattle.next();
							GameEngine.CurrentTown();
						}
						if (CharHitPoints >=1) {
							Player.CHAR_HIT_POINTS = CharHitPoints;
						}
					}
				case "R":
					//Run Away
					System.out.println("You Run Away!!!");
					if(NPC_Char == "BlackSmith") {
						NCP_Characters.ncpBlackSmith();
					}
					if(NPC_Char == "Witch") {
						NCP_Characters.ncpWitch();
					}
					else {
						GameEngine.CurrentTown();
					}
					
			}
		}
		
		
		
	}
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
}
