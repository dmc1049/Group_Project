import java.util.Scanner;

public class GameEngine {
	
	public static final String NEWLINE = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
	
	public static String[][] PlayerConfig = new String[20][20]; 
		
	public static void main(String[] args) {
		//
		
		//Check if saved Character is present - DONE
			//check if player wants to use saved character - DONE
			//check if player wants to Delete current character and create new character - DONE
		//Check for saved game - DONE
			//check if player wants to use current saved game - DONE
		//check if player wants to use saved game - DONE
			//check if player wants to delete saved game and start over with current character
			//check if wants to delete both game and character and start over - DONE
		//open last town or 1st town in game if new character - DONE
		//basic code for game - DONE
		
		Player.CheckSavedCharacter();
		Town.LoadTowns();
		ExpLevel.LoadExpLevels();
		Armor.LoadArmors();
		Weapon.LoadWeapons();
		Magic_Armor.LoadMagicArmors();
		Magic_Weapon.LoadMagicWeapons();
		if(Player.CHAR_EXP_POINTS >= ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded) {
			Player.CHAR_LEVEL_UP_QUEST_AVAILABLE = true;
		}
		
		System.out.println("\t--------------");
		String characterType = Player.CHARACTER_TYPE;
		System.out.println(String.format("\tYour Character Class is: " + characterType + 
				", and the name of your character is: %s", Player.CHARACTER_NAME));
		System.out.println("");
		System.out.println("\tTo play the game you need to select what you want to do from the options given to you. " 
				+ GameEngine.NEWLINE + "\tFor this first town you can select from the options below.\n");
		Town.CurrentTown();
	}

	public static void TravelNextTown() {
		// TODO Auto-generated method stub
		String OptionChoose = "";
		Scanner scannerNextTown = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t-------Travel to New Town-------");
		System.out.println("\tYou are in Town " + Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name + "...Where do you want to go?" + GameEngine.NEWLINE);
		System.out.print("\tE) Go to Next Town to East" + GameEngine.NEWLINE + "\tW) Go to Next Town to West" + GameEngine.NEWLINE + 
				"\tN) Go to Next Town to North" + GameEngine.NEWLINE + "\tS) Go to Next Town to South" + GameEngine.NEWLINE + 
				"\tX) Exit Back to Current Town" +GameEngine.NEWLINE + "\tChoose Wisely: " );
		OptionChoose = scannerNextTown.next();
		OptionChoose = OptionChoose.toUpperCase();
		//System.out.println("");
		Town.LoadTowns();

		switch(OptionChoose) {
			case "E":
				//Go to Town to East
				TravelNextTown.TravelToTownEast();
				//break;
			case "W":
				//Go to Town to West
				TravelNextTown.TravelToTownWest();
				//break;
			case "N":
				//Go to Town to North
				TravelNextTown.TravelToTownNorth();
				//break;
			case "S":
				//Go to Town to South
				TravelNextTown.TravelToTownSouth();
				//break;
			case "X":
				//Exit Game
				System.out.println("Returning to Current Town");
				Town.CurrentTown();
			default:
				//Some code here as default option
				//Catch invalid entry
				System.out.print("\tInvalid Entry, Please try again\n\n");
				TravelNextTown();
		}
	}

	public static void CurrentTown() {
		Town.CurrentTown();
	}

}
