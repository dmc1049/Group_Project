import java.util.Random;
import java.util.Scanner;

public class NCPQuest {
	//create a quest based on the NCP character
		//Blacksmith
		//Witch
		//Shop Keeper
		//Inn
		//Trader
		//Other
	private static final String NEWLINE = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
	
	public static void NCPBlacksmith(){
		
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(10);
		Scanner NCPscan = new Scanner(System.in);
		String scanResult = "";
		
		if (rand_int1 <= 5) {
			System.out.print("You will need to travel to the caves that are on the outskirts of town." + NEWLINE + "There you will find a cave with the letter S above its opening." + NEWLINE + "Look for a piece of metal about 1 foot long and 6 inches wide. It will be in a chest near the back of the cave." + NEWLINE + "Be careful there is a Troll guarding the chest." + NEWLINE );
			System.out.println(" Do you accept the Quest? Y for Yes; N for No: ");
			scanResult = NCPscan.next();
			scanResult = scanResult.toUpperCase();
			if (scanResult.contentEquals("Y")) {
				BSCaves();
			}
			else {
				NCP_Characters.ncpBlackSmith();
			}
		}
		if(rand_int1 >=6) {
			System.out.println("You will need to travel to the Swamp that is to the South-West of town." + NEWLINE + "There you will find a path through the swamp, follow it to the end where you will find a chest with the letter S on it." + NEWLINE + "Look for a piece of metal about 1 foot long and 6 inches wide. It will be in the chest." + NEWLINE + "Be careful there is a Hydra guarding the chest." + NEWLINE );
			System.out.println(" Do you accept the Quest? Y for Yes; N for No: ");
			scanResult = NCPscan.next();
			scanResult = scanResult.toUpperCase();
			if (scanResult.contentEquals("Y")) {
				BSSwamp();
			}
			else {
				NCP_Characters.ncpBlackSmith();
			}
		}
		
	}
	private static void BSSwamp() {
		// TODO Auto-generated method stub
		System.out.println("You venture to the Swamp and when you get there, you are scared. You turn around and run back to town.");
		NCP_Characters.ncpBlackSmith();
	}
	private static void BSCaves() {
		System.out.println("You venture to the caves on the outskirts of town, you get afraid and turn around and run back to town with your tail between your legs");
		NCP_Characters.ncpBlackSmith();
	}
	public static void NCPWizard() {
	
	}
	public static void NCPWitch() {
		
	}
}
