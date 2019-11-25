import java.util.Scanner;

public class GameEngine {
	
	private static final String NEWLINE = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

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
		
		//Scanner scannerMain = new Scanner(System.in);
		
		System.out.println(String.format("Your Character Class is %s, the name of your character is %s", Player.CHARACTER_TYPE, Player.CHARACTER_NAME));
		System.out.println("");
		
		System.out.println("Welcome to TAG, you are currently in a Town named One. Enjoy! ");
		System.out.println("");
		System.out.println("To play the game you need to select what you want to do from the options given to you. " + NEWLINE + "For this first town you can select from the options below.");
		//System.out.println("--------------");
		CurrentTown();
			 
		//scannerMain.close();
	}

	private static void ncpWitch() {
		// TODO Auto-generated method stub
		String ncpOption = "";
		Scanner scannerNCPWitch = new Scanner(System.in);
		System.out.println("-------Witches Hut-------");
		System.out.println(NEWLINE + "Hello I am the local Witch, What can I do for you?" + NEWLINE + "H) Get healed" + NEWLINE + "T) Talk to Witch about this town" + NEWLINE + "A) Ask for a Date" + NEWLINE + "X) Leave Witch" + NEWLINE +":");
		ncpOption = scannerNCPWitch.next();
		ncpOption = ncpOption.toUpperCase();
		//scannerNCPWitch.close();
		switch(ncpOption){
			case "H":
				//Heal player
				System.out.println("The Witch heals you, now go away!");
				Player.CHAR_HIT_POINTS = Player.CHAR_MAX_HIT_POINTS;
				System.out.println("--------------");
				//break;
				ncpWitch();
			case "T":
				//talk to Witch
				System.out.println("The Witch ignores you.");
				System.out.println("--------------");
				//break;
				ncpWitch();
			case "A":
				//ask for date
				System.out.println("The Witch turns you into a frog...");
				System.out.println("--------------");
				//break;
				ncpWitch();
			case "X":
				//leave Witch
				System.out.println("You thank the Witch and leave as fast as you can!" + NEWLINE);
				//return to town
				CurrentTown();
				//break;
			//default:
				//default option
		
		}
		
	}

	public static void ncpBlackSmith() {
		// TODO Auto-generated method stub
		String ncpOption = "";
		Scanner scannerNCPBlackSmith = new Scanner(System.in);
		System.out.println("-------BlackSmiths Shoppe-------");
		System.out.println(NEWLINE + "Hello I am the local BlackSmith, What can I do for you?" + NEWLINE + "W) Get Weapons fixed" + NEWLINE + "T) Talk to Blacksmith about this town" + NEWLINE + "Q) Ask about the Quest" + NEWLINE + "X) Leave Blacksmith" + NEWLINE +"Chose Wisely:");
		ncpOption = scannerNCPBlackSmith.next();
		ncpOption = ncpOption.toUpperCase();
		//scannerNCPWitch.close();
		switch(ncpOption){
			case "W":
				//Heal weapon and armor
				System.out.println("The Blacksmith repairs your weapons and armor.");
				Player.CHAR_ARMOR_POINTS = Player.CHAR_MAX_ARMOR_POINTS;
				//break;
				ncpBlackSmith();
			case "T":
				//talk to Witch
				System.out.println("The Blacksmith tells you that the Town is great, but you should explore the outerlands.");
				//break;
				ncpBlackSmith();
			case "Q":
				//ask for date
				System.out.println("The tells you about how he needs something from outside of town and asks you to go retrieve it...");
				//break;
				NCPQuest.NCPBlacksmith();
			case "X":
				//leave Witch
				System.out.println("You thank the Blacksmith and leave back to Town One." + NEWLINE);
				//return to town
				CurrentTown();
				//break;
			//default:
				//default option
		
		}
	}

	private static void TravelNextTown() {
		// TODO Auto-generated method stub
		String OptionChoose = "";
		Scanner scannerNextTown = new Scanner(System.in);
		System.out.println("");
		System.out.println("-------Travel to New Town-------");
		System.out.println("You are in Town One...Where do you want to go?" + NEWLINE);
		System.out.print("E) Go to Next Town to East" + NEWLINE + "W) Go to Next Town to West" + NEWLINE + "N) Go to Next Town to North" + NEWLINE + "S) Go to Next Town to South" + NEWLINE + "X) Exit Back to Current Town" +NEWLINE + "Choose Wisely: " );
		OptionChoose = scannerNextTown.next();
		OptionChoose = OptionChoose.toUpperCase();
		//scannerCurrentTown.close();
		switch(OptionChoose) {
			case "E":
				//Go to Town to East
				System.out.println("You will travel to the next town, over hill and through Dale, Don't get killed");
				TravelNextTown();
				//break;
			case "W":
				//Go to Town to West
				System.out.println("You will travel to the next town, over hill and through Dale, Don't get killed");
				TravelNextTown();
				//break;
			case "N":
				//Go to Town to North
				System.out.println("You will travel to the next town, over hill and through Dale, Don't get killed" + NEWLINE);
				TravelNextTown();
				//break;
			case "S":
				//Go to Town to South
				System.out.println("You will travel to the next town, over hill and through Dale, Don't get killed" + NEWLINE);
				TravelNextTown();
				//break;
			case "X":
				//Exit Game
				System.out.println("Returning to Current Town");
				CurrentTown();
			//default:
				//Some code here as default option
				
		}
	}

	private static void CurrentTown() {
		//TODO Auto-generated method stub
		String OptionChoose = "";
		Player.CURRENT_TOWN = "1";
		Scanner scannerCurrentTown = new Scanner(System.in);		
		System.out.println("");
		System.out.println("--------------");
		System.out.println("You are in Town One...What do you want to do?" + NEWLINE);
		System.out.print("A) Go to Next Town" + NEWLINE + "B) Go to Black Smith" + NEWLINE + "C) Go to Witch" + NEWLINE + "X) Exit Game" +NEWLINE + "Choose Wisely: " );
		OptionChoose = scannerCurrentTown.next();
		OptionChoose = OptionChoose.toUpperCase();
		//scannerCurrentTown.close();
		switch(OptionChoose) {
			case "A":
				//Go to next Town
				System.out.println("You will travel to the next Town, over hill and through Dale, Don't get killed");
				TravelNextTown();
				//break;
			case "B":
				//Go to Black Smith
				System.out.println("The Blacksmith may have a quest for you");
				ncpBlackSmith();
				//break;
			case "C":
				//Go to Witch
				System.out.println("Going to the Witch, don't talk to long her, she will turn you into a Frog." + NEWLINE);
				ncpWitch();
				//break;
			case "X":
				//Exit Game
				System.out.println("You are Exiting the game");
				Player.SaveCharacterPlayer();
				System.exit(0);
			//default:
				//Some code here as default option
				
		}
	}

}
