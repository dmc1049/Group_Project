//Code by Don Combs 11-2019
/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Player {

	private static String FILE_NAME = "GameChar.txt";
	private static String FILE_PATH = "";
	public static String CHARACTER_TYPE = "";
	public static String CHARACTER_NAME = "";
	public static int CHARACTER_LEVEL = 1;
	public static int CHAR_HIT_POINTS = 999;
	public static int CHAR_MAX_HIT_POINTS = 0;
	public static int CHAR_EXP_POINTS = 1;
	public static int CHAR_ARMOR_POINTS = 0; // also durability
	public static String CHAR_ARMOR_NAME = null;
	public static int CHAR_MAX_ARMOR_POINTS = 0; //also durability
	public static int CHAR_WEAPON_DAMAGE = 0; // damage done to enemy
	public static String CHAR_WEAPON_NAME = null;
	public static int CHAR_MAX_WEAPON_DAMAGE = 0; //damage done to enemy
	public static int CHAR_MAGIC_WEAPON_DAMAGE = 0; //damage done to enemy
	public static String CHAR_MAGIC_WEAPON_NAME = null;
	public static int CHAR_MAX_MAGIC_WEAPON_DAMAGE =0; //damage done to enemy
	public static int CHAR_MAGIC_ARMOR_POINTS = 0;
	public static String CHAR_MAGIC_ARMOR_NAME = null;
	public static int CHAR_MAX_MAGIC_ARMOR_POINTS = 0;
	public static int CHAR_COIN = 99;
	public static String CURRENT_TOWN = null;
	public static Boolean CHAR_LEVEL_UP_QUEST_AVAILABLE = false;
	
	//**********************************************************************************
	//-------------------------------Below test examples of loading user data------------------------------
//	public static void LoadChar2() {
//		//testing example 1
//		Path path = Paths.get(FILE_NAME);
//		Scanner scanner = null;
//		try {
//			scanner = new Scanner(path);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Read text file using Scanner");
//		//read line by line
//		while(scanner.hasNextLine()){
//		    //process each line
//		    String line = scanner.nextLine();
//		    System.out.println(line);
//		}
//	}
//	
//	public static void LoadChar() {
//		//testing example 2
//		String fileName = FILE_NAME;
//		File file = new File(fileName);
//		FileReader fr = null;
//		try {
//			fr = new FileReader(file);
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		BufferedReader br = new BufferedReader(fr);
//		String line;
//		try {
//			while((line = br.readLine()) != null){
//			    //process the line
//			    System.out.println(line);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	//--------------------------------------Above Examples of loading user data-----------------------
	//*******************************************************************************
	public static void SaveCharacterPlayer() {
		//Save the player character when exiting the game
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(FILE_NAME, "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println(CHARACTER_TYPE);
		writer.println(CHARACTER_NAME);
		writer.println(CHARACTER_LEVEL);
		writer.println(CHAR_HIT_POINTS);
		writer.println(CHAR_MAX_HIT_POINTS);
		writer.println(CHAR_EXP_POINTS);
		writer.println(CHAR_ARMOR_POINTS);
		writer.println(CHAR_ARMOR_NAME);
		writer.println(CHAR_MAX_ARMOR_POINTS);
		writer.println(CHAR_WEAPON_DAMAGE);
		writer.println(CHAR_WEAPON_NAME);
		writer.println(CHAR_MAX_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_WEAPON_NAME);
		writer.println(CHAR_MAX_MAGIC_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_ARMOR_POINTS);
		writer.println(CHAR_MAGIC_ARMOR_NAME);
		writer.println(CHAR_MAX_MAGIC_ARMOR_POINTS);
		writer.println(CHAR_COIN);
		writer.println(CURRENT_TOWN);
		writer.close();
		
	}
	
	public static void CheckSavedCharacter() {
		//look for saved character file, if none create character, 
		//if present ask if player wants to use this character or create new one
		System.out.print("\n\tWelcome to TAG, a Roll Playing Game of Fantacy and Monsters"
				+ "\n\tThe first thing we will do is see if you have a saved character."
				+ "\n\tIf you do not have a saved character we will create one.\n");
		Scanner scannerCheckCharacter = new Scanner(System.in);
		Scanner scannerDeleteCharacter = new Scanner(System.in);
		String UseChar = "";
		String DeleteChar = "";
		File PlayerCharFile = new File(FILE_NAME);//<- changed to FILE_NAME
		boolean exists = PlayerCharFile.exists();
		if (exists) {
			System.out.print("\n\tYou have a saved character.\n"
					+ "\n\tDo you want to use the saved character: Y for Yes, N for No: ");
			UseChar = scannerCheckCharacter.next();
			UseChar = UseChar.toUpperCase();
			if (UseChar.equals("Y")) {
				LoadPlayerChar();
			}
			if (UseChar.equals("N")) {
				//Ask if they want to delete their current Character
				//only one character is allowed at this moment
				System.out.print("\n\tDo you want to Delete your current Character and create a new one? Y for Yes, N for No: ");
				DeleteChar = scannerDeleteCharacter.next();
				DeleteChar = DeleteChar.toUpperCase();
				if (DeleteChar.equals("Y")) {
					//delete char file and create new one
					DeleteCharacterPlayer();
					CreateCharacterPlayer();
				}
				else {
					System.out.println("\n\tWe will load the current Character you have saved.");
					LoadPlayerChar();
				}
			}
		}
		else
		{
			CreateCharacterPlayer();
		}
		
		
	}

	private static void DeleteCharacterPlayer() {
		// TODO Auto-generated method stub
		// Delete the Saved Char file
		File file = new File(FILE_NAME);//<- changed to FILE_NAME
		if(file.delete()) {
			System.out.println("\t\nCharacter File Deleted\n");
		}
		else {
			System.out.println("ERROR: Failed to delete Character file");
		}
		
	}
	public static void LoadPlayerChar() {
		// TODO Auto-generated method stub
		// Load Char file
		File PlayerCharFile = new File(FILE_NAME);//<-changed to FILE_NAME
		boolean exists = PlayerCharFile.exists();
		if(PlayerCharFile.exists() && PlayerCharFile.isFile()) {
			//read file and populate constants of Type and Name			
			try {
				File file = new File(FILE_NAME);
				Scanner myReader = new Scanner(file);
				int i = 0;
				int j = 0;
				while (myReader.hasNextLine()) {
					//i+=i;
					String data = myReader.nextLine();
					if(i == 0) {
						GameEngine.PlayerConfig[i] = new String[]{"Character_Type", data};
						CHARACTER_TYPE = data;
					}
					if (i == 1){
						GameEngine.PlayerConfig[i] = new String[]{"Character_Name", data};
						CHARACTER_NAME = data;
					}
					else if (i == 2 ) {
						GameEngine.PlayerConfig[i] = new String[]{"Character_Level", data};
						CHARACTER_LEVEL = Integer.parseInt(data.trim());
					}
					else if (i == 3 ) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Hit_Points", data};
						CHAR_HIT_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 4 ) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Hit_Points", data};
						CHAR_MAX_HIT_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 5) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Exp_Points", data};
						CHAR_EXP_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 6) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Armor_Points", data};
						CHAR_ARMOR_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 7) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Armor_Name", data};
						CHAR_ARMOR_NAME = data;
					}
					else if (i == 8) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Armor_Points", data};
						CHAR_MAX_ARMOR_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 9) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Weapon_Damage", data};
						CHAR_WEAPON_DAMAGE = Integer.parseInt(data.trim());
					}
					else if (i == 10) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Weapon_Name", data};
						CHAR_WEAPON_NAME = data;
					}
					else if (i == 11) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Weapon_Damage", data};
						CHAR_MAX_WEAPON_DAMAGE = Integer.parseInt(data.trim());
					}
					else if (i == 12 ) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Magic_Weapon_Damage", data};
						CHAR_MAGIC_WEAPON_DAMAGE = Integer.parseInt(data.trim());
					}
					else if (i == 13 ) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Magic_Weapon_Name", data};
						CHAR_MAGIC_WEAPON_NAME = data;
					}
					else if (i == 14) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Magic_Weapon_Damage", data};
						CHAR_MAX_MAGIC_WEAPON_DAMAGE = Integer.parseInt(data.trim());
					}
					else if (i == 15) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Magic_Armor_Points", data};
						CHAR_MAGIC_ARMOR_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 16) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Magic_Armor_Name", data};
						CHAR_MAGIC_ARMOR_NAME = data;
					}
					else if (i == 17) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Magic_Armor_Points", data};
						CHAR_MAX_MAGIC_ARMOR_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 18) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Coin", data};
						CHAR_COIN = Integer.parseInt(data.trim());
					}
					else {
						GameEngine.PlayerConfig[i] = new String[]{"Current_Town", data};
						CURRENT_TOWN = data;
					}
					i=i+1;
					j=j+1;
				}
				myReader.close();
			}
			//myReader.close();
			catch(FileNotFoundException e) {
				System.out.println("File Not Found");
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File not found, exists or is a file error");
		}
	}

	private static void CreateCharacterPlayer() {
		//Create the Character for the Player and save
		CHARACTER_TYPE = PlayerClassType();
		CHARACTER_NAME = PlayerCharacterName();
		//Character Starting Level
		CHARACTER_LEVEL = 1;
		//base hit points
		CHAR_HIT_POINTS = 100;
		//Starting Max hit points
		CHAR_MAX_HIT_POINTS = 1000;
		//Experience points
		CHAR_EXP_POINTS = 1;
		//base Armor Points
		//Armor gives you 50% more hitpoints based on armor rating
		CHAR_ARMOR_POINTS = 90;
		//Armor Name
		CHAR_ARMOR_NAME = "Damaged Breast Plate";
		//Max Armor Points
		CHAR_MAX_ARMOR_POINTS = 98;
		//Weapons Points
		CHAR_WEAPON_DAMAGE = 80;
		//Weapon Name
		CHAR_WEAPON_NAME = "Broken Sword";
		//Max Weapons Points
		CHAR_MAX_WEAPON_DAMAGE = 89;
		//Character Starting Coin
		//Magic weapon
		CHAR_MAGIC_WEAPON_DAMAGE = 10;
		//Magic Weapon Name
		CHAR_MAGIC_WEAPON_NAME = "NotYet";
		//Max Magic WEapon Damage
		CHAR_MAX_MAGIC_WEAPON_DAMAGE = 20;
		//Magic Armor
		CHAR_MAGIC_ARMOR_POINTS = 11;
		//magic armor name
		CHAR_MAGIC_ARMOR_NAME = "NotYet";
		CHAR_MAX_MAGIC_ARMOR_POINTS = 22;
		CHAR_COIN = 100;
		CURRENT_TOWN = "1";
		
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(FILE_NAME, "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println(CHARACTER_TYPE);
		writer.println(CHARACTER_NAME);
		writer.println(CHARACTER_LEVEL);
		writer.println(CHAR_HIT_POINTS);
		writer.println(CHAR_MAX_HIT_POINTS);
		writer.println(CHAR_EXP_POINTS);
		writer.println(CHAR_ARMOR_POINTS);
		writer.println(CHAR_ARMOR_NAME);
		writer.println(CHAR_MAX_ARMOR_POINTS);
		writer.println(CHAR_WEAPON_DAMAGE);
		writer.println(CHAR_WEAPON_NAME);
		writer.println(CHAR_MAX_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_WEAPON_NAME);
		writer.println(CHAR_MAX_MAGIC_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_ARMOR_POINTS);
		writer.println(CHAR_MAGIC_ARMOR_NAME);
		writer.println(CHAR_MAX_MAGIC_ARMOR_POINTS);
		writer.println(CHAR_COIN);
		writer.println(CURRENT_TOWN);
		writer.close();
		
	}
	
	
	public static String PlayerClassType() {
		// Get Character Class
		
		Scanner scanner1 = new Scanner(System.in);
		String Class = "";
		System.out.print("\n\tEnter your Character Class: M for Male or F for Female: ");
		Class = scanner1.nextLine();
		Class = Class.toUpperCase();
		switch(Class){
			case "M":
				//Male
				Class = "Male";
				break;
			case "F":
				//Female
				Class = "Female";
				break;
			default:
				//error
				System.out.println("\tInvalid Entry, Try again...");
				PlayerClassType();
		}
		CHARACTER_TYPE = Class;
		//Close Scanner when needed
		return Class;
	}
	public static String PlayerCharacterName() {
		// TODO Auto-generated method stub
		String CharName = "";
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("\n\tEnter your Characters Name: ");
		CharName = scanner2.next();
		CHARACTER_NAME = CharName;
		//scanner2.close();
		return CharName;
	}
	public static void PlayerStats() {
		//Display Player Stats menu
		//and possible items in inventory
		String pstatCommand = "";
		Scanner pstats = new Scanner(System.in);
		
		System.out.println(GameEngine.NEWLINE +"---------------------------- Your Basic Character Stats --------------------------");
		System.out.print("\tName: " + Player.CHARACTER_NAME + "\t\t\t\t|   CHARACTER_LEVEL: " + Player.CHARACTER_LEVEL
				+"\n\tCHAR_HIT_POINTS: " + Player.CHAR_HIT_POINTS + "\t\t\t|   CHAR_MAX_HIT_POINTS: " + Player.CHAR_MAX_HIT_POINTS
				+"\n\tCHAR_COIN: " + Player.CHAR_COIN  + "\t\t\t\t|   Current Town: "+ Player.CURRENT_TOWN + " Town Name: " +Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name
				+"\n\tExperience Points: " + Player.CHAR_EXP_POINTS + "\t\t\t|   ");
		System.out.print("\n\tArmor Level: " + Player.CHAR_ARMOR_POINTS + "\t\t\t\t|   MAX Armor Points: " + Player.CHAR_MAX_ARMOR_POINTS
				+"\n\tWeapon Damage: " + Player.CHAR_WEAPON_DAMAGE + "\t\t\t|   MAX Weapon Damage: " + Player.CHAR_MAX_WEAPON_DAMAGE
				+"\n\tCurrent Armor: " + Player.CHAR_ARMOR_NAME  + "\t|   Current Weapon: "+ Player.CHAR_WEAPON_NAME 
				+"\n\tExperience Points: " + Player.CHAR_EXP_POINTS + "\t\t\t|   Player Coin: "+ Player.CHAR_COIN   
				+"\n" );
		System.out.print(GameEngine.NEWLINE +"---------------------------------------------------------------------------------");
		
		System.out.print("\n\tT) Return to Town\n\tI) Player Inventory\n\tChoose Wisely: ");
		pstatCommand = pstats.next();
		pstatCommand = pstatCommand.toUpperCase();
		switch (pstatCommand) {
			case "T":
				//something
				Town.CurrentTown();
				//break;
			case "I":
				//Something
				//open inventory when complete
				PlayerStats();
				//break;
			default:
				Town.CurrentTown();
				
		}
			
		
	}
}
