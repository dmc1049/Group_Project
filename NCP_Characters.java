import java.util.Scanner;

public class NCP_Characters {
	

	private static final String NEWLINE = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
	//array of NCP characters
	//Witch - Done
	//Wizard
	//Blacksmith - Done
	//Healer
	//Trader
	//Traveler
	
	//create array of NCP characters for random NCP Character in Towns
	
	
	public static void ncpBlackSmith() {
		
		String ncpOption = "";
		Scanner scannerNCPBlackSmith = new Scanner(System.in);
		System.out.println("-------BlackSmiths Shoppe-------");
		System.out.println(NEWLINE + "Hello I am the local BlackSmith, What can I do for you?" + NEWLINE + 
				"W) Get Weapons fixed" + NEWLINE + "T) Talk to Blacksmith about this town" + NEWLINE + 
				"Q) Ask about the Quest" + NEWLINE + "X) Leave Blacksmith" + NEWLINE +"Choose Wisely:");
		ncpOption = scannerNCPBlackSmith.next();
		ncpOption = ncpOption.toUpperCase();
		//scannerNCPWitch.close();
		switch(ncpOption){
			case "W":
				//Heal weapon and armor
				System.out.println("The Blacksmith repairs your weapons and armor.");
				//add in cost and see if player has enough coin to repair armor
				//agument the difference between what they have and what they can afford
				System.out.println("Start if debug save player" + NEWLINE + Player.CHAR_COIN);
				//Player.CHAR_COIN = 75;
				//Player.CHAR_ARMOR_POINTS = 85;
				Object coinOnPlayer = Player.CHAR_COIN;
				Object charArmorPoints = Player.CHAR_ARMOR_POINTS;
				System.out.println(coinOnPlayer);
				System.out.println(charArmorPoints);
				System.out.println("");
				Player.CHAR_ARMOR_POINTS = Player.CHAR_MAX_ARMOR_POINTS;
				Player.CHAR_WEAPON_DAMAGE = Player.CHAR_MAX_WEAPON_DAMAGE;
				if(Player.CHAR_COIN >= 25)
					Player.CHAR_COIN = Player.CHAR_COIN - 25;
				else
					System.out.println("You do not have enough Coin to be healed. Go Battale something or sell something "
							+ "to get the Coin!");
				//break;
				ncpBlackSmith();
			case "T":
				//talk to Blacksmith
				//Add random talking points here
				System.out.println("The Blacksmith tells you that the Town is great, but you should explore the outerlands.");
				//break;
				ncpBlackSmith();
			case "Q":
				//Quest details
				System.out.println("The tells you about how he needs something from outside of town and asks you to go "
						+ "retrieve it...");
				//break;
				NCPQuest.NCPBlacksmith();
			case "X":
				//leave Blacksmith
				System.out.println("You thank the Blacksmith and leave back to Town " + Town.CurrentTownIn + "." + NEWLINE);
				//return to town
				GameEngine.CurrentTown();
				//break;
			//default:
				//default option
		
		}
		
	}
	public static void ncpWitch() {
		
		String ncpOption = "";
		Scanner scannerNCPWitch = new Scanner(System.in);
		System.out.println("-------Witches Hut-------");
		System.out.println(NEWLINE + "Hello I am the local Witch, What can I do for you?" + NEWLINE + 
				"H) Get healed" + NEWLINE + "T) Talk to Witch about this town" + NEWLINE + 
				"Q) Quest to retrieve something for the Witch" + NEWLINE+"A) Ask for a Date" + NEWLINE + 
				"X) Leave Witch" + NEWLINE +"Choose Wisely:");
		ncpOption = scannerNCPWitch.next();
		ncpOption = ncpOption.toUpperCase();
		//scannerNCPWitch.close();
		switch(ncpOption){
			case "H":
				//Heal player
				System.out.println("The Witch heals you, now go away!");
				//add in cost in coin and see if player has enough for the cost of healing
				//agument the difference between what they have and what they can afford
				Player.CHAR_HIT_POINTS = Player.CHAR_MAX_HIT_POINTS;
				if(Player.CHAR_COIN >= 25)
					Player.CHAR_COIN = Player.CHAR_COIN - 25;
				else
					System.out.println("You do not have enough Coin to be healed. Go Battale something or sell something "
							+ "to get the Coin!");
				//break;
				ncpWitch();
			case "T":
				//talk to Witch
				System.out.println("The Witch ignores you.");
				System.out.println("--------------");
				//break;
				ncpWitch();
			case "Q":
				//Quest
				System.out.print("\nThe Witch tells you she needs something from outside of town...");
				NCPQuest.NCPWitch();
			case "A":
				//ask for date
				System.out.println("The Witch turns you into a frog...");
				System.out.println("--------------");
				//break;
				ncpWitch();
			case "X":
				//leave Witch
				System.out.println("You thank the Witch and leave as fast as you can!" + NEWLINE);
				//return to town
				GameEngine.CurrentTown();
				//break;
			//default:
				//default option
		
		}
	}
	public static void ncpWizard() {
		
		String ncpOption = "";
		Scanner scannerNCPWizard = new Scanner(System.in);
		System.out.println("-------Wizards Shoppe-------");
		System.out.println(NEWLINE + "Greetings and Salutations, I am the local Wizard, What can I do for you?" + NEWLINE + 
				"W) Get Magical Weapons and Armor fixed" + NEWLINE + "T) Talk to Wizard about this town" + NEWLINE + 
				"Q) Ask about the Quest" + NEWLINE + "X) Leave Wizard" + NEWLINE +"Choose Wisely:");
		ncpOption = scannerNCPWizard.next();
		ncpOption = ncpOption.toUpperCase();
		//scannerNCPWizard.close();
		switch(ncpOption){
			case "W":
				//Heal Magical weapon and armor
				System.out.println("The Wizard will attempt repairs your Magical Weapons and Armor for 100 Gold Coins.");
				//add in cost and see if player has enough coin to repair magic armor
				//augment the difference between what they have and what they can afford
				if(Player.CHAR_COIN >=100){
					Player.CHAR_MAGIC_ARMOR_POINTS = Player.CHAR_MAX_MAGIC_ARMOR_POINTS;
					Player.CHAR_MAGIC_WEAPON_DAMAGE = Player.CHAR_MAX_MAGIC_WEAPON_DAMAGE;
					Player.CHAR_COIN = Player.CHAR_COIN - 100;
					System.out.println("The Wizard repairs your Magical Weapons and Armor.");
				}
				else {
					System.out.print("You do not have enough Gold Coins on you for me to do that. Go kill something "
							+ "or find the Coins Somewhere and come back");
				}
				//break;
				ncpWizard();
			case "T":
				//talk to Wizard
				//Add random talking points here
				System.out.println("The Wizard tells you that the Town is great, but you should explore the outerlands.");
				//break;
				ncpWizard();
			case "Q":
				//Quest details
				System.out.println("The Wizard tells you about how he needs something from outside of town and asks you "
						+ "to go retrieve it...");
				//break;
				NCPQuest.NCPWizard();
			case "X":
				//leave Wizard
				System.out.println("You thank the Wizard and leave back to Town " + Town.CurrentTownIn + "." + NEWLINE);
				//return to town
				GameEngine.CurrentTown();
				//break;
			//default:
				//default option
		
		}
	}
	public static void ncpHealer() {
		
	}
	public static void ncpTrader() {
		
	}
	public static void ncpTravelingSales() {
		
	}
}
