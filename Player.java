//Code by Don Combs 11-2019
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
	public static int CHAR_MAX_ARMOR_POINTS = 0; //also durability
	public static int CHAR_WEAPON_DAMAGE = 0; // damage done to enemy
	public static int CHAR_MAX_WEAPON_DAMAGE = 0; //damage done to enemy
	public static int CHAR_MAGIC_WEAPON_DAMAGE = 0; //damage done to enemy
	public static int CHAR_MAX_MAGIC_WEAPON_DAMAGE =0; //damage done to enemy
	public static int CHAR_MAGIC_ARMOR_POINTS = 0;
	public static int CHAR_MAX_MAGIC_ARMOR_POINTS = 0;
	public static int CHAR_COIN = 99;
	public static String CURRENT_TOWN = null;
	
	
	
		//is there a saved character or does the user need to make one - DONE
			//User has saved game character - DONE
				//look on system for save file - DONE
				//Ask user if they want to load currently saved character or delete it and make a new one - DONE
				//Load character from file - DONE
				//load all modifiers
	
			//User needs to make character and name it - DONE
				//User selects male or female - DONE
				//user names character - DONE
				//Character base attributes are loaded into player stats
		
			//User gets players Armor and Weapon Loaded
			//User gets players cash added to bank
	
		//section for modifiers
		//Section for Player Stats
		//section for wearable objects
		//section for weapons
		//section for cash
	
	
	public static void LoadChar2() {
		
		
		
		Path path = Paths.get(FILE_NAME);
		Scanner scanner = null;
		try {
			scanner = new Scanner(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Read text file using Scanner");
		//read line by line
		while(scanner.hasNextLine()){
		    //process each line
		    String line = scanner.nextLine();
		    System.out.println(line);
		}
	}
	
	public static void LoadChar() {
		String fileName = FILE_NAME;
		File file = new File(fileName);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while((line = br.readLine()) != null){
			    //process the line
			    System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void SaveCharacterPlayer() {
		//Save the player character when exiting the game
		PrintWriter writer = null;
//		System.out.println(CHARACTER_LEVEL + " CHARACTER_LEVEL");
//		System.out.println(CHAR_HIT_POINTS + " CHAR_HIT_POINTS");
//		System.out.println(CHAR_MAX_HIT_POINTS + " CHAR_MAX_HIT_POINTS");
		
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
		writer.println(CHAR_MAX_ARMOR_POINTS);
		writer.println(CHAR_WEAPON_DAMAGE);
		writer.println(CHAR_MAX_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_WEAPON_DAMAGE);
		writer.println(CHAR_MAX_MAGIC_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_ARMOR_POINTS);
		writer.println(CHAR_MAX_MAGIC_ARMOR_POINTS);
		writer.println(CHAR_COIN);
		writer.println(CURRENT_TOWN);
		writer.close();
		
	}
	
	public static void CheckSavedCharacter() {
		//look for saved character file, if none create character, 
		//if present ask if player wants to use this character or create new one
		Scanner scannerCheckCharacter = new Scanner(System.in);
		Scanner scannerDeleteCharacter = new Scanner(System.in);
		String UseChar = "";
		String DeleteChar = "";
		File PlayerCharFile = new File(FILE_NAME);//<- changed to FILE_NAME
		boolean exists = PlayerCharFile.exists();
		if (exists) {
			System.out.print("Do you want to use saved character: Y for Yes, N for No: ");
			UseChar = scannerCheckCharacter.next();
			UseChar = UseChar.toUpperCase();
			if (UseChar.equals("Y")) {
				LoadPlayerChar();
			}
			if (UseChar.equals("N")) {
				//Ask if they want to delete their current Character
				//only one character is allowed at this moment
				System.out.print("Do you want to Delete your current Character and create a new one? Y for Yes, N for No: ");
				DeleteChar = scannerDeleteCharacter.next();
				DeleteChar = DeleteChar.toUpperCase();
				if (DeleteChar.equals("Y")) {
					//delete char file and create new one
					DeleteCharacterPlayer();
					CreateCharacterPlayer();
				}
				else {
					System.out.println("We will load the current Character you have saved.");
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
			System.out.println("Character File Deleted");
		}
		else {
			System.out.println("Failed to delete Character file");
			System.out.println("But overwrite is working??????");
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
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Armor_Points", data};
						CHAR_MAX_ARMOR_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 8) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Weapon_Damage", data};
						CHAR_WEAPON_DAMAGE = Integer.parseInt(data.trim());
					}
					else if (i == 9) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Weapon_Damage", data};
						CHAR_MAX_WEAPON_DAMAGE = Integer.parseInt(data.trim());
					}
					else if (i == 10 ) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Magic_Weapon_Damage", data};
						CHAR_MAGIC_WEAPON_DAMAGE = Integer.parseInt(data.trim());
					}
					else if (i == 11) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Magic_Weapon_Damage", data};
						CHAR_MAX_MAGIC_WEAPON_DAMAGE = Integer.parseInt(data.trim());
					}
					else if (i == 12) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Magic_Armor_Points", data};
						CHAR_MAGIC_ARMOR_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 13) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Max_Magic_Armor_Points", data};
						CHAR_MAX_MAGIC_ARMOR_POINTS = Integer.parseInt(data.trim());
					}
					else if (i == 14) {
						GameEngine.PlayerConfig[i] = new String[]{"Char_Coin", data};
						CHAR_COIN = Integer.parseInt(data.trim());
					}
					else {
						GameEngine.PlayerConfig[i] = new String[]{"Current_Town", data};
						CURRENT_TOWN = data;
					}
					//System.out.println(data + " --Data from file");
					//System.out.println(CHARACTER_TYPE + " from println 1");
					//System.out.println(CHARACTER_NAME + " from println 2");
					//System.out.println(GameEngine.PlayerConfig[i][j] + " --From Array");
					//System.out.println(i + "," + j + " from integers");
					//System.out.println("------------");
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
		//Max Armor Points
		CHAR_MAX_ARMOR_POINTS = 98;
		//Weapons Points
		CHAR_WEAPON_DAMAGE = 80;
		//Max Weapons Points
		CHAR_MAX_WEAPON_DAMAGE = 89;
		//Character Starting Coin
		//Magic weapon
		CHAR_MAGIC_WEAPON_DAMAGE = 10;
		CHAR_MAX_MAGIC_WEAPON_DAMAGE = 20;
		//Magic Armor
		CHAR_MAGIC_ARMOR_POINTS = 11;
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
		writer.println(CHAR_MAX_ARMOR_POINTS);
		writer.println(CHAR_WEAPON_DAMAGE);
		writer.println(CHAR_MAX_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_WEAPON_DAMAGE);
		writer.println(CHAR_MAX_MAGIC_WEAPON_DAMAGE);
		writer.println(CHAR_MAGIC_ARMOR_POINTS);
		writer.println(CHAR_MAX_MAGIC_ARMOR_POINTS);
		writer.println(CHAR_COIN);
		writer.println(CURRENT_TOWN);
		writer.close();
		
	}
	
	
	public static String PlayerClassType() {
		// Get Character Class
		
		Scanner scanner1 = new Scanner(System.in);
		String Class = "";
		System.out.print("Enter your Character Class: M for Male or F for Female: ");
		//scanner.nextLine();
		Class = scanner1.next();
		Class = Class.toUpperCase();
		CHARACTER_TYPE = Class;
		
		//scanner1.close();
		
			if(Class == "M") {
					Class = "Male";
			}
			else if(Class == "F"){
				Class = "Female";
			}
			else {
				//System.out.println("Invalid Selection, Try again");
				//PlayerClass = "";
				//System.exit(0);
				//return;
			}
		
		return Class;
	}
	public static String PlayerCharacterName() {
		// TODO Auto-generated method stub
		String CharName = "";
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter your Characters Name: ");
		//scanner.nextLine();
		CharName = scanner2.next();
		CHARACTER_NAME = CharName;
		//scanner2.close();
		return CharName;
	}
}
