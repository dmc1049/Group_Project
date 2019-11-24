import java.util.Scanner;

public class Player {

	private static String CHARACTER_TYPE = null;
	private static String CHARACTER_NAME = null;
	
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
	public static SaveCharacterPlayer() {
		//Save the player character when exiting the game
		
	}
	
	public static CheckSavedCharacter() {
		//look for saved character file, if none create character, 
		//if present ask if player wants to use this character or create new one
		
		
	}
	public static CreateCharacterPlayer() {
		//Create the Character for the Player and save
		
		
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
