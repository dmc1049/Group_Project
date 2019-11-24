import java.util.Scanner;

public class GameEngine {

	public static void main(String[] args) {
		//
		
		//Check if saved Character is present
			//check if player wants to use saved character
			//check if player wants to create new character
		
		//Check for saved game
			//check if player wants to use current saved game
		
		//check if player wants to use saved char and saved game
		
		//check if player wants to delete saved game and char and start over
		
		//open last town or 1st town in game if new character
		
		//basic code for game
		String PlayerClass = "";
		//String PlayerClass = Player.PlayerClassType();
		String PlayerCharacter = "";
		//String PlayerCharacter = Player.PlayerCharacterName();
		String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Character Class: M for Male or F for Female: ");
		PlayerClass = scanner.next(); 
		if(PlayerClass == "M") { 
			  PlayerClass = "Male";
		  }
		else if(PlayerClass == "F"){ 
			  PlayerClass = "Female"; 
			  } 
		else {
		    //System.out.println("Invalid Selection, Try again"); 
		    //PlayerClass = "";
		    //System.exit(0); 
		    //return; 
	    }
		 		
		System.out.print("Enter your Characters Name: "); 
		//scanner.nextLine();
		PlayerCharacter = scanner.next(); 
		//scanner.close();
		 
		
		System.out.println(String.format("Your Character is %s, the name of your character is %s", PlayerClass, PlayerCharacter));
		System.out.println("");
		
		System.out.println("Welcome to TAG, you are currently in a Town named One. Enjoy! ");
		System.out.println("");
		System.out.println("To play the game you need to select what you want to do from the options given to you. For this first town you can select fro mthe options below.");
		System.out.println("");
		
		String OptionChoose = "";
		System.out.print("A) Go to Next Town" + newLine + "B) go to Black Smith" + newLine + "C) Go to Witch" + newLine + "X) Exit Game" +newLine + "Choose Wisely: " );
		OptionChoose = scanner.next();
		//scanner.close();
		switch(OptionChoose) {
			case "A":
				//Go to next Town
				System.out.println("You will travel to the next town, over hill and through Dale, Don't get killed");
				break;
			case "B":
				//Go to Black Smith
				System.out.println("Bla BLa");
				break;
			case "C":
				//Go to Witch
				System.out.println("Going to the Witch, don't talk long to her, she will turn you into a Frog");
				break;
			case "X":
				//Exit Game
				System.out.println("You are Exiting the game");
				System.exit(0);
			default:
				//Some code here as default option
				
		}
		
		scanner.close();

	}

	private static String PlayerCharacterName() {
		// TODO Auto-generated method stub
		String CharName = "";
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter your Characters Name: ");
		//scanner.nextLine();
		CharName = scanner2.next();
		scanner2.close();
		return CharName;
	}

	private static String PlayerClassType() {
		// Get Character Class
		
		Scanner scanner1 = new Scanner(System.in);
		String Class="";
		System.out.print("Enter your Character Class: M for Male or F for Female: ");
		//scanner.nextLine();
		Class = scanner1.next();
		scanner1.close();
		
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
	
	

}
