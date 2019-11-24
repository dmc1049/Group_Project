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
	private static String FILE_NAME = "GameChar.txt";
	private static String FILE_PATH = "";
	
		//is there a saved character or does the user need to make one
			//User has saved game character
				//look on system for save file
				//Ask user if they want to load currently saved character or delete it and make a new one
				//Load character from file
				//load all modifiers
	
			//User needs to make character and name it
				//User selects male or female
				//user names character
				//Character base attributes are loaded into player stats
		
		//section for modifiers
	
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
		writer.close();
	}
	
	public static void CheckSavedCharacter() {
		//look for saved character file, if none create character, 
		//if present ask if player wants to use this character or create new one
		Scanner scannerCheckCharacter = new Scanner(System.in);
		Scanner scannerDeleteCharacter = new Scanner(System.in);
		String UseChar = "";
		String DeleteChar = "";
		File PlayerCharFile = new File("GameChar.txt");
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
		File file = new File(FILE_NAME);
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
		File PlayerCharFile = new File("GameChar.txt");
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
					else {
						CHARACTER_NAME = data;
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
