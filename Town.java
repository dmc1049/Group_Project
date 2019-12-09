import java.util.Scanner;

public class Town {

	public static final String CurrentTownIn = Player.CURRENT_TOWN;
	public static Towns[] TownsConfig;
	//passed info from game engine of saved info or new info to open
	//load town
		//1st game town or last saved town
	//create an array of towns loaded in the game
	//create array of towns visited by player already from config file
	
	/*
	 * Remove Main when you go to include this into the town and map
	 */
	public static void main (String[] args)
	{
		//Create list of Towns
		Towns[] arr;
		
		arr = new Towns[10];
		//Array setup: TownID, Town Name, Set NCP1, Set NCP2, Random NCP3, Town_e_id, Town_w_id, Town_n_id, Town_s_id
		arr[0] = new Towns(1, "Oslo", 1, 2);
        arr[1] = new Towns(2,"Bergen", 1, 3);
        arr[2] = new Towns(3, "Reykjavík", 2, 3);
        arr[3] = new Towns(4, "Alesund", 1, 2);
        arr[4] = new Towns(5,"Tonsberg", 1, 3);
        arr[5] = new Towns(6, "Verdal", 2, 3);
        arr[6] = new Towns(7, "Kristiansund", 1, 2);
        arr[7] = new Towns(8,"Bjarkoy", 1, 3);
        arr[8] = new Towns(9, "Hamar", 2, 3);
        arr[9] = new Towns(10, "Avaldsnes", 1, 2);
		
		TownsConfig = arr.clone();
		
	//	Town_ID	//	Town_Name	//	NCP_One	//	NCP_Two	//	Random_NCP_Three	//	Next_Town_E_ID	//	Next_Town_W_ID
	//	Next_Town_N_ID	//	Next_Town_S_ID
	
		for (int i = 0; i < arr.length; i++) {
	        System.out.println("Element at " + i + " : " + arr[i].Town_ID +" "+ arr[i].Town_Name +" "+ arr[i].Set_NPC1 + " " + arr[i].Set_NPC2 );
		}
		for(int i = 0; i < TownsConfig.length; i++) {
			System.out.println("Element at " + i + " : " + TownsConfig[i].Town_ID +" "+ TownsConfig[i].Town_Name +" "+ TownsConfig[i].Set_NPC1 + " " + TownsConfig[i].Set_NPC2 );
		}
	}
	public static void LoadTowns() {
	
	//Create list of Towns
			Towns[] arr;
			
			arr = new Towns[10];
			//Array setup: TownID, Town Name, Set NCP1, Set NCP2, Random NCP3, Town_e_id, Town_w_id, Town_n_id, Town_s_id
			arr[0] = new Towns(1, "Oslo", 1, 2);
	        arr[1] = new Towns(2,"Bergen", 1, 3);
	        arr[2] = new Towns(3, "Reykjavík", 2, 3);
	        arr[3] = new Towns(4, "Alesund", 1, 2);
	        arr[4] = new Towns(5,"Tonsberg", 1, 3);
	        arr[5] = new Towns(6, "Verdal", 2, 3);
	        arr[6] = new Towns(7, "Kristiansund", 1, 2);
	        arr[7] = new Towns(8,"Bjarkoy", 1, 3);
	        arr[8] = new Towns(9, "Hamar", 2, 3);
	        arr[9] = new Towns(10, "Avaldsnes", 1, 2);
			
			TownsConfig = arr.clone();
			
			
		//	Town_ID,Town_Name,NCP_One,NCP_Two,Random_NCP_Three,Next_Town_E_ID,Next_Town_W_ID,Next_Town_N_ID,Next_Town_S_ID		
// --------------- TESTING ----------------	
//		for (int i = 0; i < arr.length; i++) {
//	        System.out.println("Element at " + i + " : " + arr[i].Town_ID +" "+ arr[i].Town_Name +" "+ arr[i].Set_NPC1 + " " + arr[i].Set_NPC2 );
//		}
//		for(int i = 0; i < TownsConfig.length; i++) {
//			System.out.println("Element at " + i + " : " + TownsConfig[i].Town_ID +" "+ TownsConfig[i].Town_Name +" "+ TownsConfig[i].Set_NPC1 + " " + TownsConfig[i].Set_NPC2 );
//		}
	}
	public static void CurrentTown() {
		//TODO Auto-generated method stub
		String OptionChoose = "";
		Scanner scannerCurrentTown = new Scanner(System.in);
		//******************************************************************************************
		//------ UNCOMMENT BELOW IF ANSII ART IS REMOVED--------------------------------------------------------------------
		
		System.out.println(GameEngine.NEWLINE +"--------------------------------Your Character Stats-------------------------------------------");
		System.out.print("\tName: " + Player.CHARACTER_NAME + "\t\t|   CHARACTER_LEVEL: " + Player.CHARACTER_LEVEL
				+"\n\tCHAR_HIT_POINTS: " + Player.CHAR_HIT_POINTS + "\t|   CHAR_MAX_HIT_POINTS: " + Player.CHAR_MAX_HIT_POINTS
				+"\n\tCHAR_COIN: " + Player.CHAR_COIN  + "\t\t|   Current Town: "+ Player.CURRENT_TOWN + " Town Name: " +Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name
				+"\n\tExperience Points: " + Player.CHAR_EXP_POINTS + "\t|   ");
		System.out.print("\n----------------------------------------------------------------------------------------------");
		System.out.print("\n");
		System.out.println("\tYou are in the Town "+ Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name +"... What do you want to do?" + GameEngine.NEWLINE);

		 		
		System.out.println("\tT) Go to Next Town" + GameEngine.NEWLINE + "\tB) Go to Black Smith" + GameEngine.NEWLINE + "\tW) Go to Witch" + GameEngine.NEWLINE + 
				"\tO) Go to the Wizard" + GameEngine.NEWLINE + "\tX) Exit Game" +GameEngine.NEWLINE + "\tZ) Exit Without Saving" + GameEngine.NEWLINE );
		// ------ UNCOMMENT TO HERE TO REMOVE ANSII ART ---------------------------------------------
		//*****************************************************************************************

		if (Player.CHAR_EXP_POINTS >= ExpLevel.ExpConfig[Player.CHARACTER_LEVEL].ExpPointsNeeded){
			//--KEEP-TESTING----System.out.println("\n\nPlayer Can Level Up: " + Player.CHAR_LEVEL_UP_QUEST_AVAILABLE +"\n\n");
			//*************************************************************************************
			System.out.print("\tQ) Quest To Level Up Available" +GameEngine.NEWLINE); // COMMENT THIS LINE AND UNCOMMENT BELOW THIS LINE TO ADD ANSII ART
			//---JavaProgram.TownMenu("TownMenuTwo.txt"); //comment this line and uncomment line above to remove ansii art
		}
		else {
			//***************************************************************************************
			//---JavaProgram.TownMenu("TownMenuOne.txt");//comment this line to remove ansii art
		}
		//******************************************************************************************
		//---UNCOMMENT BELOW TO ADD IN ANSII / ASCII ART ----------------------------
//		System.out.println("--------------------------------Your Character Stats-------------------------------------------");
//		System.out.print("\tName: " + Player.CHARACTER_NAME + "\t\t|   CHARACTER_LEVEL: " + Player.CHARACTER_LEVEL
//				+"\n\tCHAR_HIT_POINTS: " + Player.CHAR_HIT_POINTS + "\t|   CHAR_MAX_HIT_POINTS: " + Player.CHAR_MAX_HIT_POINTS
//				+"\n\tCHAR_COIN: " + Player.CHAR_COIN  + "\t\t|   Current Town: "+ Player.CURRENT_TOWN + " Town Name: " +Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name
//				+"\n\tExperience Points: " + Player.CHAR_EXP_POINTS + "\t|   ");
//		System.out.print("\n----------------------------------------------------------------------------------------------");
//		System.out.print("\n");
//		System.out.println("\tYou are in Town "+ Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name +"... What do you want to do?" + GameEngine.NEWLINE);
		// -----------UNCOMMENT TO HERE TO ADD IN IN ANSII?ASCII ART----------------------------------
		//********************************************************************************************
		// -----------UNCOMMENT BELOW TO REMOVE ANSII / ASCII ART -----------------------------------
		System.out.print("\tChoose Wisely: " );
		//------------UNCOMMENT ABOVE TO REMOVE ANSII / ASCII ART ----------------------------------
		//********************************************************************************************
		OptionChoose = scannerCurrentTown.nextLine();
		OptionChoose = OptionChoose.toUpperCase();

		switch(OptionChoose) {
			case "T":
				//Go to next Town
				System.out.println("\tYou will travel to the next Town, over hill and through Dale, Don't get killed");
				GameEngineTwo.TravelNextTown();
				//break;
			case "B":
				//Go to Black Smith
				System.out.println("\tThe Blacksmith may have a quest for you");
				NCP_Characters.ncpBlackSmith();
				//break;
			case "W":
				//Go to Witch
				System.out.println("\tGoing to the Witch, don't talk to her for a long time. \n\tShe will turn you into a Frog." + GameEngine.NEWLINE);
				NCP_Characters.ncpWitch();
				//break;
			case "O":
				//Go to Wizard
				System.out.print("\tThe Wizard is a little quarky, he likes to mumble a lot\n");
				NCP_Characters.ncpWizard();
			case "X":
				//Exit Game
				System.out.println("You are Exiting the game");
				Player.SaveCharacterPlayer();
				System.exit(0);
			case "Z":
				System.out.println("You are Exiting the game with out saving");
				System.exit(0);
			case ".":
				//System.out.println("Easter Egg");
				EasterEgg.Egg();
			case "2":
				JavaProgram.TownMenu("TownMenuTwo.txt");
				Town.CurrentTown();
			case "3":
				JavaProgram.TownMenu("TownMenuThree-Small_Dragon-4.txt");
				Town.CurrentTown();
			case "Q":
				//Quest for level up
				//System.out.println("\n\tOH MY! You got scared and RAN AWAY!!!\n");
				//CurrentTown();
				MonsterTypeBoss.BossMonster();
			default:
				//Some code here as default option
				//Catch invalid entry
				System.out.print("\tInvalid Entry, Please try again\n\n");
				CurrentTown();
				
		}
	}
}
class Towns {
	
	public int Town_ID;
	public String Town_Name;
	public int Set_NPC1;
	public int Set_NPC2;
	Towns(int Town_ID, String Town_Name, int Set_NPC1, int Set_NPC2)
	{
		this.Town_ID = Town_ID;
		this.Town_Name = Town_Name;
		this.Set_NPC1 = Set_NPC1;
		this.Set_NPC2 = Set_NPC2;
		
	}
	
}