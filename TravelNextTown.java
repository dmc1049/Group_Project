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
		if (rand_int1 <= 5) {
			rand_int1 = rand_int1 +5;
		}
		return rand_int1;
	}
	
	public static void TravelToTownEast() {
		// get town data from town.java
		int i = RandNumMethod();
		
		Town.LoadTowns();
		
		String TownEast = Town.TownsConfig[i].Town_Name;
		int TownEastID = Town.TownsConfig[i].Town_ID;
		System.out.print(TownEast);
		if (TownEastID == Integer.parseInt(strCurrentTown)) {
			TravelToTownEast();
		}
		
		
		
	}
	public static void TravelToTownWest() {
		// get town data from town.java
		//Random Town
		int i = RandNumMethod();
		Town.LoadTowns();
		String TownWest = Town.TownsConfig[i].Town_Name;
		System.out.print(TownWest);
		
	}
	public static void TravelToTownNorth() {
		// get town data from town.java
		//Random Town
		int i = RandNumMethod();
		Town.LoadTowns();
		String TownNorth = Town.TownsConfig[i].Town_Name;
		System.out.print(TownNorth);
		
	}
	public static void TravelToTownSouth() {
		// get town data from town.java
		//Random Town
		int i = RandNumMethod();
		Town.LoadTowns();
		String TownSouth = Town.TownsConfig[i].Town_Name;
		System.out.print(TownSouth);
		
	}
	
	public static void TravelBetweenTowns(String TownName, String Monster, String Traveller) {
		//random chance of coming across monster
		//random chance you come across traveler
		
		int i = RandNumMethod();
		if (i <=3) {
			System.out.print("\nSome Text Here");
			System.out.print("\n\n"
					+ "\t1. You travel to Town " + TownName + "  and it was a very uneventful travel."
					+ "\t2. Look Around and see what it has to offer");
		}
		else if ((i >= 4) || (i<= 7)) {
			Scanner scannerTravel = new Scanner(System.in);
			String OptionChoose;
			System.out.print("\nSome Text Here About Monster");
			System.out.print("\n\n"
					+ "\t1. You travel to Town " + TownName + "  and on your way you are confronted with a " + Monster + "."
					+ "\t2. Do you want to battle it or continue on to the next town? Y for Yes and N for No: ");
			OptionChoose = scannerTravel.next();
			OptionChoose = OptionChoose.toUpperCase();
			switch (OptionChoose) {
				case "Y":
					//Something here
					
					break;
				case "N":
					//Something here
					
					break;
				default:
					//Something
			}
			//Something else here....
		}
		else {
			Scanner scannerTravel = new Scanner(System.in);
			String OptionChoose;
			System.out.print("\nSome Text Here About Traveller");
			System.out.print("\n\n"
					+ "\t1. You travel to Town " + TownName + "  and on your way you are confronted with a " + Traveller + "."
					+ "\t2. Do you want to talk the the Traveller or continue on to the next town? Y for Yes and N for No: ");
			OptionChoose = scannerTravel.next();
			OptionChoose = OptionChoose.toUpperCase();
			switch (OptionChoose) {
				case "Y":
					//Something here
					
					break;
				case "N":
					//Something here
					
					break;
				default:
					//Something
			}
		}
	
	}
}
