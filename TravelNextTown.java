/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
import java.util.Random;
import java.util.Scanner;

public class TravelNextTown {
	//What happens on your travels to the next town in the game
	// Random if you will come across a monster before next town
	//get current town
	public static String strCurrentTown = Player.CURRENT_TOWN;
	
	
	public static int RandNumMethod() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(10);
		return rand_int1;
	}
	public static int RandomMonsterMethod() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(5);
		return rand_int1;
	}
	public static int RandomTravelerMethod() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(5);
		return rand_int1;
	}
	public static void TravelToNextTown() {
		// TODO Auto-generated method stub
		String OptionChoose = "";
		Scanner scannerNextTown = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t-------Travel to New Town-------");
		System.out.println("\tYou are in Town " + Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name + "...Where do you want to go?" + GameEngine.NEWLINE);
		System.out.print("\tE) Go to Next Town to East" + GameEngine.NEWLINE + "\tW) Go to Next Town to West" + GameEngine.NEWLINE + 
				"\tN) Go to Next Town to North" + GameEngine.NEWLINE + "\tS) Go to Next Town to South" + GameEngine.NEWLINE + 
				"\tX) Exit Back to Current Town" +GameEngine.NEWLINE + "\tChoose Wisely: " );
		OptionChoose = scannerNextTown.next();
		OptionChoose = OptionChoose.toUpperCase();
		//System.out.println("");
		Town.LoadTowns(); //May not need this here - Possible to remove Maybe!!!
		
		switch(OptionChoose) {
			case "E":
				//Go to Town to East
				TravelToTownEast();
				//break;
			case "W":
				//Go to Town to West
				TravelToTownWest();
				//break;
			case "N":
				//Go to Town to North
				TravelToTownNorth();
				//break;
			case "S":
				//Go to Town to South
				TravelToTownSouth();
				//break;
			case "X":
				//Exit Game
				System.out.println("Returning to Current Town");
				Town.CurrentTown();
			default:
				//Some code here as default option
				//Catch invalid entry
				System.out.print("\tInvalid Entry, Please try again\n\n");
				TravelToNextTown();
		}
	}
	public static void TravelToTownEast() {
		// get town data from town.java
		int i = RandNumMethod();
		
		Town.LoadTowns();
		
		String TownEast = Town.TownsConfig[i].Town_Name;
		int TownEastID = Town.TownsConfig[i].Town_ID;
		//System.out.print(TownEast);
		if (TownEastID == Integer.parseInt(strCurrentTown)) {
			TravelToTownEast();
		}
		Player.CURRENT_TOWN = Integer.toString(TownEastID);
		String TownName = Town.TownsConfig[(Integer.parseInt(Player.CURRENT_TOWN)-1)].Town_Name;
		String Monster = MonsterTypeOne.RandMonster(RandomMonsterMethod());
		String Traveler = TravelerTypeOne.RandTraveler(RandomTravelerMethod());
		TravelBetweenTowns(TownName, Monster, Traveler);
		
		
	}
	public static void TravelToTownWest() {
		// get town data from town.java
		//Random Town
//		int i = RandNumMethod();
//		Town.LoadTowns();
//		String TownWest = Town.TownsConfig[i].Town_Name;
//		System.out.print(TownWest);
		TravelToTownEast();
	}
	public static void TravelToTownNorth() {
		// get town data from town.java
		//Random Town
//		int i = RandNumMethod();
//		Town.LoadTowns();
//		String TownNorth = Town.TownsConfig[i].Town_Name;
//		System.out.print(TownNorth);
		TravelToTownEast();
	}
	public static void TravelToTownSouth() {
		// get town data from town.java
		//Random Town
//		int i = RandNumMethod();
//		Town.LoadTowns();
//		String TownSouth = Town.TownsConfig[i].Town_Name;
//		System.out.print(TownSouth);
		TravelToTownEast();
	}
	
	public static void TravelBetweenTowns(String TownName, String Monster, String Traveler) {
		//random chance of coming across monster
		//random chance you come across traveler
		
		int i = RandNumMethod();
		if (i <=2) {
			//System.out.print("\n");
			System.out.print("\n"
					+ "\t You travel to the Town " + TownName + " and it was a very uneventful trip." + GameEngine.NEWLINE
					+ "\t Look Around the town and see what it has to offer\n\n");
			//GameEngine.CurrentTown();
			Town.CurrentTown();
		}
		else if ((i >= 3) && (i<= 6)) {
			Scanner scannerTravel = new Scanner(System.in);
			String OptionChoose;
			//System.out.print("\n\tSome Text Here About Monster");
			System.out.print("\n"
					+ "\t You are traveling to the Town " + TownName + " and on your way you are confronted with a " + Monster + "." + GameEngine.NEWLINE
					+ "\t Do you want to battle it or continue on to the next town?" + GameEngine.NEWLINE 
					+ "\t B) for Battle Monster \n\t C) for Continue to next town " + GameEngine.NEWLINE + "\tChoose Wisely: ");
			OptionChoose = scannerTravel.next();
			OptionChoose = OptionChoose.toUpperCase();
			switch (OptionChoose) {
				case "B":
					//Something here
					//random monster from RandMonsterMethod()
					//System.out.println("Need to add battle engine here");
					//Battle Monster Make possible .java file to link to
					//GameEngine.CurrentTown();
					BattleEngine.BattleMonster(Monster);
					break;
				case "C":
					//Something here
					//System.out.print("\nSome Text Here");
					System.out.print("\n"
							+ "\t You are racked with fear and decide to avoid the monster." + GameEngine.NEWLINE
							+ "\t You make your way off the Path to the next town and wander through" + GameEngine.NEWLINE
							+ "\t the woods until you reach the next Town.\n\n");
					//GameEngine.CurrentTown();
					Town.CurrentTown();
					break;
				default:
					//Something
					System.out.println("\tInvalid Entry, Please try again");
					TravelToTownEast();
			}
			//Something else here....
		}
		else if(i >= 7) {
			Scanner scannerTravel = new Scanner(System.in);
			String OptionChoose;
			//System.out.print("\nSome Text Here About Traveler");
			System.out.print("\n\n"
					+ "\t You travel to Town " + TownName + "  and on your way you are meet with a " + Traveler + "." + GameEngine.NEWLINE
					+ "\t Do you want to talk the the Traveler or continue on to the next town?" + GameEngine.NEWLINE 
					+ "\t T) To talk to Traveler\n\t C) To continue to next town: ");
			OptionChoose = scannerTravel.next();
			OptionChoose = OptionChoose.toUpperCase();
			switch (OptionChoose) {
				case "T":
					//Something here
					System.out.print("\n\tYou meet " + Traveler + " and "+ Traveler+" tells you about how in the next town"
							+ "\n\tthere are riches to be made on Quests\n\n");
					//GameEngine.CurrentTown();
					Town.CurrentTown();
					break;
				case "C":
					//Something here
					System.out.print("\n\t You continue on your way to the next town\n");
					//GameEngine.CurrentTown();
					Town.CurrentTown();
					break;
				default:
					//Something
					System.out.println("\tInvalid Entry, Please try again");
					TravelToTownEast();
			}
		}
	
	}
}
