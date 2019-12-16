/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
import java.util.Scanner;

public class NCP_Characters {
	public static String NPC1 = "ncpBlackSmith";
	public static String NPC2 = "ncpWitch";
	public static String NPC3 = "ncpWizard";
	//public static String NPC4 = "ncpHealer";
	//public static String NPC5 = "ncpTrader";
	//public static String NPC6 = "ncpTravelingSales";
	
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
		 System.out.println("\t-------Brokkr & Sons BlackSmith Shoppe-------");
	        System.out.print(GameEngine.NEWLINE + "\t'Well met.' a thunderous voice booms" + GameEngine.NEWLINE +
	                "\t'I am Brokkr, the BlackSmith to Loki, Odin and Freyr, I'm busy, but if you" + GameEngine.NEWLINE +
	                "\t have coin, you have my attention.'\n" + GameEngine.NEWLINE +
	                "\tW) Get Weapons fixed" + GameEngine.NEWLINE + "\tT) Talk to Brokkr about this town" + GameEngine.NEWLINE + 
	                "\tQ) Ask about the Quest" + GameEngine.NEWLINE + "\tX) Leave Blacksmith" + GameEngine.NEWLINE +"\tChoose Wisely: ");
		ncpOption = scannerNCPBlackSmith.next();
		ncpOption = ncpOption.toUpperCase();
		//scannerNCPWitch.close();
		switch(ncpOption){
			case "W":
				//Heal weapon and armor
//				Object coinOnPlayer = Player.CHAR_COIN;
//				Object charArmorPoints = Player.CHAR_ARMOR_POINTS;
				if(Player.CHAR_COIN >= 25) {
					Player.CHAR_COIN = Player.CHAR_COIN - 25;
					Player.CHAR_ARMOR_POINTS = Player.CHAR_MAX_ARMOR_POINTS;
					Player.CHAR_WEAPON_DAMAGE = Player.CHAR_MAX_WEAPON_DAMAGE;
					System.out.println("\n\tThe Blacksmith, Brokkr, repairs your weapons and armor for 25 coin.\n.");
				}
				else {
					System.out.println("\n\tYou do not have enough Coin to have your Aromor and Weapons repaired. "
							+ "Go Battle something or sell something to get the Coin!\n");
				}
				//break;
				ncpBlackSmith();
			case "T":
				//talk to Blacksmith
				System.out.println("\n\tBrokkr tells you that the Town is great, but you should explore the outerlands.");
				//break;
				ncpBlackSmith();
			case "Q":
				//Quest details
				System.out.println("\n\tBrokkr tells you about how he needs something from outside of town and asks you to go "
						+ "retrieve it...");
				//break;
				NCPQuest.NCPBlacksmith();
			case "X":
				//leave Blacksmith
				System.out.println("\n\tYou Thank Brokkr and leave back to Town " + Town.TownsConfig[IntegerParseInt(Town.CurrentTownIn)].Town_Name + "." + GameEngine.NEWLINE);
				//return to town
				Town.CurrentTown();
				//break;
			default:
				//default option
				System.out.println("Invalid Entry, Please try again...");
				ncpBlackSmith();
		
		}
		
	}
	private static int IntegerParseInt(String currenttownin) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void ncpWitch() {
		
		String ncpOption = "";
        Scanner scannerNCPWitch = new Scanner(System.in);
        System.out.println("\t-------Baba Yaga's Hut-------");
        System.out.print(GameEngine.NEWLINE + "\tA deformed fercious-looking old woman with chicken legs screaches" + GameEngine.NEWLINE +
                "\t'Greetings traveler, I am Lubki, but the townsfolk call me Baba Yaga, what do you require?'\n" + GameEngine.NEWLINE + 
                "\tH) Get healed" + GameEngine.NEWLINE + "\tT) Talk to Witch about this town" + GameEngine.NEWLINE + 
                "\tQ) Quest to retrieve something for the Baba Yaga" + GameEngine.NEWLINE+"\tA) Ask for a Date" + GameEngine.NEWLINE + 
                "\tX) Leave Baba Yaga" + GameEngine.NEWLINE +"\tChoose Wisely: ");
        ncpOption = scannerNCPWitch.next();
        ncpOption = ncpOption.toUpperCase();
        //scannerNCPWitch.close();
        switch(ncpOption){
            case "H":
                //Heal player
                System.out.println("\tThe Baba Yaga attempts to heal you for 25 Gold Coins");
                Player.CHAR_HIT_POINTS = Player.CHAR_MAX_HIT_POINTS;
                if(Player.CHAR_COIN >= 25) {
                    Player.CHAR_COIN = Player.CHAR_COIN - 25;
                    System.out.print("\n\t'Now go away', she screams!");
                }
                else {
                    System.out.println("\tYou do not have enough Coin to be healed. Go Battle something or sell something "
                            + "to get the Coin!");
                    //break;
                    ncpWitch();
                }
            case "T":
                //talk to Witch
                System.out.println("\tBaba Yaga ignores you.\n");
                //break;
                ncpWitch();
            case "Q":
                //Quest
                System.out.print("\tBaba Yaga says, 'I need you to fetch somethingfrom outside of town...'\n");
                NCPQuest.NCPWitch();
            case "A":
                //ask for date
                Player.CHAR_HIT_POINTS = Player.CHAR_HIT_POINTS - 50;
                System.out.println("\tBaba Yaga turns you into a frog... It Costs you 50 Hit Points");
                System.out.println("\t'Next time I will eat your soul' ");
                //break;
                ncpWitch();
            case "X":
                //leave Witch
                System.out.println("\tYou thank Baba Yaga and leave as fast as you can!" + GameEngine.NEWLINE);
                //return to town
				Town.CurrentTown();
                //break;
            default:
                //default option
                System.out.println("Invalid Entry, Please try again...");
                ncpWitch();

        }
    }
	public static void ncpWizard() {
		
		String ncpOption = "";
		Scanner scannerNCPWizard = new Scanner(System.in);
		System.out.println("\t-------Wizards Shoppe-------");
		System.out.print(GameEngine.NEWLINE + "\tGreetings and Salutations, I am the local Wizard, What can I do for you?" + GameEngine.NEWLINE + GameEngine.NEWLINE + 
				"\tW) Get Magical Weapons and Armor fixed" + GameEngine.NEWLINE + "\tT) Talk to Wizard about this town" + GameEngine.NEWLINE + 
				"\tQ) Ask about the Quest" + GameEngine.NEWLINE + "\tX) Leave Wizard" + GameEngine.NEWLINE +"\tChoose Wisely: ");
		ncpOption = scannerNCPWizard.next();
		ncpOption = ncpOption.toUpperCase();
		//scannerNCPWizard.close();
		switch(ncpOption){
			case "W":
				//Heal Magical weapon and armor
				System.out.println("\tThe Wizard will attempt repairs your Magical Weapons and Armor for 100 Gold Coins.");
				if(Player.CHAR_COIN >=100){
					Player.CHAR_MAGIC_ARMOR_POINTS = Player.CHAR_MAX_MAGIC_ARMOR_POINTS;
					Player.CHAR_MAGIC_WEAPON_DAMAGE = Player.CHAR_MAX_MAGIC_WEAPON_DAMAGE;
					Player.CHAR_COIN = Player.CHAR_COIN - 100;
					System.out.println("\tThe Wizard repairs your Magical Weapons and Armor.");
				}
				else {
					System.out.print("\tYou do not have enough Gold Coins on you for me to do that. Go kill something "
							+ "or find the Coins Somewhere and come back");
				}
				//break;
				ncpWizard();
			case "T":
				//talk to Wizard
				System.out.println("\tThe Wizard tells you that the Town is great, but you should explore the outerlands.");
				//break;
				ncpWizard();
			case "Q":
				//Quest details
				System.out.println("\tThe Wizard tells you about how he needs something from outside of town and asks you "
						+ "to go retrieve it...");
				//break;
				NCPQuest.NCPWizard();
			case "X":
				//leave Wizard
				System.out.println("\tYou thank the Wizard and leave back to Town " + Town.CurrentTownIn + "." + GameEngine.NEWLINE);
				//return to town
				Town.CurrentTown();
				//break;
			default:
				//default option
				System.out.println("Invalid Entry, Please try again...");
				ncpWizard();
		
		}
	}
	public static void ncpHealer() {
		
	}
	public static void ncpTrader() {
		
	}
	public static void ncpTravelingSales() {
		
	}
}
