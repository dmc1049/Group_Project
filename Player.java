import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

public class Player {

	public static String CHARACTER_TYPE = null;
	public static String CHARACTER_NAME = null;
	public static int CHARACTER_LEVEL = 0;
	public static String CURRENT_TOWN = null;
	private static String FILE_NAME = "GameChar.txt";
	private static String FILE_PATH = "";
	public static int CHAR_HIT_POINTS = 0;
	public static int CHAR_MAX_HIT_POINTS = 0;
	public static int CHAR_ARMOR_POINTS = 0;
	public static int CHAR_MAX_ARMOR_POINTS = 0;
	public static int CHAR_COIN = 0;
	
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
		writer.println(CHAR_ARMOR_POINTS);
		writer.println(CHAR_MAX_ARMOR_POINTS);
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

	private static void LoadPlayerChar() {
		// TODO Auto-generated method stub
		// Load Char file
		File PlayerCharFile = new File(FILE_NAME);//<-changed to FILE_NAME
		boolean exists = PlayerCharFile.exists();
		if(PlayerCharFile.exists() && PlayerCharFile.isFile()) {
			//read file and populate constants of Type and Name
			try {
				File file = new File(FILE_NAME);
				Scanner myReader = new Scanner(file);
				int i = 1;
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					if(i == 1) {
						CHARACTER_TYPE = data;
						i+=i;
					}
					else if (i == 2){
						CHARACTER_NAME = data;
						i+=i;
					}
					else if (i == 3 ) {
						CHARACTER_LEVEL = Integer.parseInt(data.trim());
						i+=i;
					}
					else if (i == 4 ) {
						CHAR_HIT_POINTS = Integer.parseInt(data.trim());
						i+=i;
					}
					else if (i == 5) {
						CHAR_MAX_HIT_POINTS = Integer.parseInt(data.trim());
						i+=i;
					}
					else if (i == 6) {
						CHAR_ARMOR_POINTS = Integer.parseInt(data.trim());
						i+=i;
					}
					else if (i == 7) {
						CHAR_MAX_ARMOR_POINTS = Integer.parseInt(data.trim());
						i+=i;
					}
					else if (i == 8) {
						CHAR_COIN = Integer.parseInt(data.trim());
						i+=i;
					}
					else {
						CURRENT_TOWN = data;
					}
					
				}
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
		PlayerClassType();
		PlayerCharacterName();
		CURRENT_TOWN = "1";
		//base hitpoints
		CHAR_HIT_POINTS = 100;
		//Starting Max hit points
		CHAR_MAX_HIT_POINTS = 100;
		//base Armor Points
		//Armor gives you 50% more hitpoints based on armor rating
		CHAR_ARMOR_POINTS = 100;
		//Max Armor Points
		CHAR_MAX_ARMOR_POINTS = 100;
		//Character Starting Coin
		CHAR_COIN = 100;
		//Character Starting Level
		CHARACTER_LEVEL = 1;
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
		writer.println(CHAR_ARMOR_POINTS);
		writer.println(CHAR_MAX_ARMOR_POINTS);
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
