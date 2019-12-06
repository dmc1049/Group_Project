
public class ExpLevel {

	public static ExpArrays[] ExpConfig;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Experience Point Ladder to Level Up
		
		// Level 1 to 2 1000Exp gets battle with Boss Monster
		// Formula: Exp = Level^2/0.04
		
		int PlayerExp = Player.CHAR_EXP_POINTS;
		double ExpConstant = 0.04;
		int StartExpLevel = 1;
		int UpperExpLevel = 100;
		double Level = 0;
		double ExpPoints = 0;
		
		
		ExpArrays[] arr;
		
		arr = new ExpArrays[100];
		//Format arr: Level, ExpPoints Needed
		for(int i=0; i<=99; i++) {
			arr[i] = new ExpArrays(i,(Math.pow((i+1), 2)/0.04));
		}
		ExpConfig = arr.clone();
		
		for (int i = 0; i < arr.length; i++) {
	        System.out.println("Element at " + i + " : " + arr[i].Level_ID +" "+ arr[i].ExpPointsNeeded);
		}
		for(int i = 0; i < ExpConfig.length; i++) {
			System.out.println("Element at " + i + " : " + ExpConfig[i].Level_ID +" "+ ExpConfig[i].ExpPointsNeeded);
		}
	}
	public static void LoadExpLevels() {
		int PlayerExp = Player.CHAR_EXP_POINTS;
		double ExpConstant = 0.04;
		int StartExpLevel = 1;
		int UpperExpLevel = 100;
		double Level = 0;
		double ExpPoints = 0;
		
		
		ExpArrays[] arr;
		
		arr = new ExpArrays[100];
		//Format arr: Level, ExpPoints Needed
		for(int i=0; i<=99; i++) {
			arr[i] = new ExpArrays(i,(Math.pow((i+1), 2)/0.04));
		}
		ExpConfig = arr.clone();
		
	}

}
class ExpArrays {
	
	public int Level_ID;
	public double ExpPointsNeeded;

	ExpArrays(int Level_ID, double ExpPointsNeeded)
	{
		this.Level_ID = Level_ID;
		this.ExpPointsNeeded = ExpPointsNeeded;
		
	}
	
}
