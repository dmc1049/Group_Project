/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
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
		Player.CHAR_MAX_HIT_POINTS = ((int) ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded); //Modify as needed
		Armor.LoadArmors();
		Weapon.LoadWeapons();
		Magic_Armor.LoadMagicArmors();
		Magic_Weapon.LoadMagicWeapons();
//		if(Player.CHAR_EXP_POINTS >= ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded) {
//			Player.CHAR_LEVEL_UP_QUEST_AVAILABLE = true;
//		}
//		
//		System.out.println("\t--------------");
//		String characterType = Player.CHARACTER_TYPE;
//		System.out.println(String.format("\tYour Character Class is: " + characterType + 
//				", and the name of your character is: %s", Player.CHARACTER_NAME));
//		System.out.println("");
//		System.out.println("\tTo play the game you need to select what you want to do from the options given to you. " 
//				+ GameEngine.NEWLINE + "\tFor this first town you can select from the options below.\n");
		Town.CurrentTown();
	}
	public static void TravelNextTown() {
		System.out.println("ERROR-----ERROR---0");
		TravelNextTown.TravelToNextTown();
	}
	public static void CurrentTown() {
		System.out.println("ERROR-----ERROR---1");
		Town.CurrentTown();
	}

}
