import java.util.Scanner;

public class GameEngine {
	
	public static final String NEWLINE = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
	
	public static String[][] PlayerConfig = new String[16][16]; 
		
	public static void main(String[] args) {
		//
		
		//Check if saved Character is present - DONE
			//check if player wants to use saved character - DONE
			//check if player wants to Delete current character and create new character - DONE
		//Check for saved game - DONE
			//check if player wants to use current saved game
		//check if player wants to use saved game
			//check if player wants to delete saved game and start over with current character
			//check if wants to delete both game and character and start over
		//open last town or 1st town in game if new character - DONE
		//basic code for game
		
		Player.CheckSavedCharacter();
		Town.LoadTowns();
		ExpLevel.LoadExpLevels();
		if(Player.CHAR_EXP_POINTS >= ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded) {
			Player.CHAR_LEVEL_UP_QUEST_AVAILABLE = true;
		}
		
		System.out.println("\t--------------");
		String characterType = Player.CHARACTER_TYPE;
		System.out.println(String.format("\tYour Character Class is: " + characterType + 
				", and the name of your character is: %s", Player.CHARACTER_NAME));
		System.out.println("");
		System.out.println("\tTo play the game you need to select what you want to do from the options given to you. " 
				+ NEWLINE + "\tFor this first town you can select from the options below.\n");
		CurrentTown();
	}

	public static void TravelNextTown() {
		// TODO Auto-generated method stub
		String OptionChoose = "";
		Scanner scannerNextTown = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t-------Travel to New Town-------");
		System.out.println("\tYou are in Town " + Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name + "...Where do you want to go?" + NEWLINE);
		System.out.print("\tE) Go to Next Town to East" + NEWLINE + "\tW) Go to Next Town to West" + NEWLINE + 
				"\tN) Go to Next Town to North" + NEWLINE + "\tS) Go to Next Town to South" + NEWLINE + 
				"\tX) Exit Back to Current Town" +NEWLINE + "\tChoose Wisely: " );
		System.out.println("");
		Town.LoadTowns();
		OptionChoose = scannerNextTown.next();
		OptionChoose = OptionChoose.toUpperCase();
		switch(OptionChoose) {
			case "E":
				//Go to Town to East
				TravelNextTown.TravelToTownEast();
				//break;
			case "W":
				//Go to Town to West
				TravelNextTown.TravelToTownEast();
				//break;
			case "N":
				//Go to Town to North
				TravelNextTown.TravelToTownEast();
				//break;
			case "S":
				//Go to Town to South
				TravelNextTown.TravelToTownEast();
				//break;
			case "X":
				//Exit Game
				System.out.println("Returning to Current Town");
				CurrentTown();
			default:
				//Some code here as default option
				//Catch invalid entry
				System.out.print("\tInvalid Entry, Please try again\n\n");
				TravelNextTown();
		}
	}

	public static void CurrentTown() {
		//TODO Auto-generated method stub
		String OptionChoose = "";
		Scanner scannerCurrentTown = new Scanner(System.in);		
		System.out.println("--------------------------------Your Character Stats-------------------------------------------");
		System.out.print("\tName: " + Player.CHARACTER_NAME + "\t\t|   CHARACTER_LEVEL: " + Player.CHARACTER_LEVEL
				+"\n\tCHAR_HIT_POINTS: " + Player.CHAR_HIT_POINTS + "\t|   CHAR_MAX_HIT_POINTS: " + Player.CHAR_MAX_HIT_POINTS
				+"\n\tCHAR_COIN: " + Player.CHAR_COIN  + "\t\t|   Current Town: "+ Player.CURRENT_TOWN
				+"\n\tExperience Points: " + Player.CHAR_EXP_POINTS + "\t|   ");
		System.out.print("\n----------------------------------------------------------------------------------------------");
		System.out.print("\n");
		System.out.println("\tYou are in Town "+ Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name +"... What do you want to do?" + NEWLINE);
		System.out.println("\tT) Go to Next Town" + NEWLINE + "\tB) Go to Black Smith" + NEWLINE + "\tW) Go to Witch" + NEWLINE + 
				"\tO) Go to the Wizard" + NEWLINE + "\tX) Exit Game" +NEWLINE + "\tZ) Exit Without Saving" + NEWLINE );
		
		//System.out.println(Player.CHARACTER_LEVEL +"\n");
//		if (Player.CHAR_EXP_POINTS <= ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded){
//			System.out.println("\n\nPlayer Cannot Level Up\n\n");
//		}
		if (Player.CHAR_EXP_POINTS >= ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded){
			//System.out.println("\n\nPlayer Can Level Up: " + Player.CHAR_LEVEL_UP_QUEST_AVAILABLE +"\n\n");
			System.out.print("\tQ) Quest To Level Up Available" +NEWLINE);
		}
//		if(Player.CHAR_EXP_POINTS >= 1000 ) {
//			System.out.print("\tQ) Quest for Level Up" +NEWLINE);
//		}
		System.out.println("\tChoose Wisely: " );
		
		OptionChoose = scannerCurrentTown.next();
		OptionChoose = OptionChoose.toUpperCase();

		switch(OptionChoose) {
			case "T":
				//Go to next Town
				System.out.println("\tYou will travel to the next Town, over hill and through Dale, Don't get killed");
				TravelNextTown();
				//break;
			case "B":
				//Go to Black Smith
				System.out.println("\tThe Blacksmith may have a quest for you");
				NCP_Characters.ncpBlackSmith();
				//break;
			case "W":
				//Go to Witch
				System.out.println("\tGoing to the Witch, don't talk to her for a long time. \n\tShe will turn you into a Frog." + NEWLINE);
				NCP_Characters.ncpWitch();
				//break;
			case "O":
				//Go to Wizard
				System.out.print("\tThe Wizard is a little quarky, he likes to mumble a lot\n");
				NCP_Characters.ncpWizard();
			case "X":
				//Exit Game
				System.out.println("You are Exiting the game");
				Player.SaveCharacterPlayer();
				System.exit(0);
			case "Z":
				System.out.println("You are Exiting the game with out saving");
				System.exit(0);
			case ".":
				//System.out.println("Easter Egg");
				EasterEgg.Egg();
			case "Q":
				//Quest for level up
				//System.out.println("\n\tOH MY! You got scared and RAN AWAY!!!\n");
				//CurrentTown();
				MonsterTypeBoss.BossMonster();
			default:
				//Some code here as default option
				//Catch invalid entry
				System.out.print("\tInvalid Entry, Please try again\n\n");
				CurrentTown();
				
		}
	}

}
