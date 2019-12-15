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
						
		Player.CheckSavedCharacter();
		Town.LoadTowns();
		ExpLevel.LoadExpLevels();
		Player.CHAR_MAX_HIT_POINTS = ((int) ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded); //Modify as needed
		Armor.LoadArmors();
		Weapon.LoadWeapons();
		Magic_Armor.LoadMagicArmors();
		Magic_Weapon.LoadMagicWeapons();

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
