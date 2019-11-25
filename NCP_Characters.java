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
		System.out.println(NEWLINE + "Hello I am the local BlackSmith, What can I do for you?" + NEWLINE + "W) Get Weapons fixed" + NEWLINE + "T) Talk to Blacksmith about this town" + NEWLINE + "Q) Ask about the Quest" + NEWLINE + "X) Leave Blacksmith" + NEWLINE +"Choose Wisely:");
		ncpOption = scannerNCPBlackSmith.next();
		ncpOption = ncpOption.toUpperCase();
		//scannerNCPWitch.close();
		switch(ncpOption){
			case "W":
				//Heal weapon and armor
				System.out.println("The Blacksmith repairs your weapons and armor.");
				//add in cost and see if player has enough coin to repair armor
				//agument the difference between what they have and what they can afford
				Player.CHAR_ARMOR_POINTS = Player.CHAR_MAX_ARMOR_POINTS;
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
				System.out.println("The tells you about how he needs something from outside of town and asks you to go retrieve it...");
				//break;
				NCPQuest.NCPBlacksmith();
			case "X":
				//leave Blacksmith
				System.out.println("You thank the Blacksmith and leave back to Town One." + NEWLINE);
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
		System.out.println(NEWLINE + "Hello I am the local Witch, What can I do for you?" + NEWLINE + "H) Get healed" + NEWLINE + "T) Talk to Witch about this town" + NEWLINE + "A) Ask for a Date" + NEWLINE + "X) Leave Witch" + NEWLINE +"Choose Wisely:");
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
				System.out.println("--------------");
				//break;
				ncpWitch();
			case "T":
				//talk to Witch
				System.out.println("The Witch ignores you.");
				System.out.println("--------------");
				//break;
				ncpWitch();
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
		
	}
	public static void ncpHealer() {
		
	}
	public static void ncpTrader() {
		
	}
	public static void ncpTraveler() {
		
	}
}