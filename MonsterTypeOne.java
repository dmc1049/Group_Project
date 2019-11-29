import java.util.Random;

public class MonsterTypeOne {
	//basic monsters
	//imp
	//troll
	//hydra
	//Zombie
	//Other
	private static final String NEWLINE = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Troll();
		Imp();
		Hydra();
		Zombie();
		Other();
	}
	public static String RandMonster(int randMonster) {
		
		int i = randMonster;
		String Monster = "";
		if(i == 1)
			Monster = "Troll";
		else if (i == 2)
			Monster = "Imp";
		else if (i == 3)
			Monster = "Hydra";
		else if (i == 4)
			Monster = "Zombie";
		else if (i == 5)
			Monster = "Other";
				
		return Monster;
	}
	
	public static int RandNumMethod() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(101);
		if (rand_int1 <= 5) {
			rand_int1 = rand_int1 +5;
		}
		return rand_int1;
	}
	public static int RandNumMethod2() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(21);
		return rand_int1;
	}
	public static int RandNumMethod3() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(11);
		return rand_int1;
	}
	public static int Encounter() {
		int i = RandNumMethod();
		if (i > 45) {
			return i;
		}
		else {
			return 0;
		}
	}
	public static int MagicItemChance() {
		//chance of dropping magic item
		int i = RandNumMethod();
		if (i > 65) {
			return i;
		}
		else {
			return 0;
		}
	
	}
	public static int MagicItem() {
		int i = RandNumMethod3();
		return i;
	}
	public static int DropItem() {
		// item in item list array
		int i = RandNumMethod3();
		return i;

	}
	public static int DamagePerHit() {
		int i = RandNumMethod2();
		return i;
	}
	public static int[] Troll() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		//Exp Points
		
		int hitPoints = RandNumMethod();
		int damagePerHit = DamagePerHit();
		int expPoints = RandNumMethod();
		int coinDrop = RandNumMethod();
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Troll--------");
		System.out.println("The hitpoints for this Troll is: " + hitPoints + " and drops item number: " + RandNumMethod3());
		System.out.print("Encounter percentage chance on Quest: " + k + "%");
		if (k == 0) {
			m=0;
		}
		System.out.println(" and drop item percentage: " + m + "%");
		System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
		if(i >=65) {
			j = MagicItem();
		}
		else {
			j=0;
		}
		System.out.println(" and magic drop item is number: " + j);
		System.out.println("Damage per hit upon Player Character is: " + damagePerHit + NEWLINE +"Experience Points Gained: " + expPoints);
		System.out.println("Coin Drop: " + coinDrop);
		System.out.println("----------------");
		
		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
		
	}
	public static int[] Imp() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int hitPoints = RandNumMethod();
		int damagePerHit = DamagePerHit();
		int expPoints = RandNumMethod();
		int coinDrop = RandNumMethod();
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Imp--------");
		System.out.println("The hitpoints for this Imp is: " + hitPoints + " and drops item number: " + RandNumMethod3());
		System.out.print("Encounter percentage chance on Quest: " + k + "%");
		if (k == 0) {
			m=0;
		}
		System.out.println(" and drop item percentage: " + m + "%");
		System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
		if(i >=65) {
			j = MagicItem();
		}
		else {
			j=0;
		}
		System.out.println(" and magic drop item is number: " + j);
		System.out.println("Damage per hit upon Player Character is: " + damagePerHit + NEWLINE +"Experience Points Gained: " + expPoints);
		System.out.println("Coin Drop: " + coinDrop);
		System.out.println("----------------");
		
		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
		
	}
	public static int[] Hydra() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int hitPoints = RandNumMethod();
		int damagePerHit = DamagePerHit();
		int expPoints = RandNumMethod();
		int coinDrop = RandNumMethod();
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Hydra--------");
		System.out.println("The hitpoints for this Hydra is: " + hitPoints + " and drops item number: " + RandNumMethod3());
		System.out.print("Encounter percentage chance on Quest: " + k + "%");
		if (k == 0) {
			m=0;
		}
		System.out.println(" and drop item percentage: " + m + "%");
		System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
		if(i >=65) {
			j = MagicItem();
		}
		else {
			j=0;
		}
		System.out.println(" and magic drop item is number: " + j);
		System.out.println("Damage per hit upon Player Character is: " + damagePerHit + NEWLINE +"Experience Points Gained: " + expPoints);
		System.out.println("Coin Drop: " + coinDrop);
		System.out.println("----------------");
		
		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
	}
	public static int[] Zombie() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int hitPoints = RandNumMethod();
		int damagePerHit = DamagePerHit();
		int expPoints = RandNumMethod();
		int coinDrop = RandNumMethod();
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Imp--------");
		System.out.println("The hitpoints for this Zombie is: " + hitPoints + " and drops item number: " + RandNumMethod3());
		System.out.print("Encounter percentage chance on Quest: " + k + "%");
		if (k == 0) {
			m=0;
		}
		System.out.println(" and drop item percentage: " + m + "%");
		System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
		if(i >=65) {
			j = MagicItem();
		}
		else {
			j=0;
		}
		System.out.println(" and magic drop item is number: " + j);
		System.out.println("Damage per hit upon Player Character is: " + damagePerHit + NEWLINE +"Experience Points Gained: " + expPoints);
		System.out.println("Coin Drop: " + coinDrop);
		System.out.println("----------------");
		
		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
		
	}
	public static int[] Other() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int hitPoints = RandNumMethod();
		int damagePerHit = DamagePerHit();
		int expPoints = RandNumMethod();
		int coinDrop = RandNumMethod();
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Imp--------");
		System.out.println("The hitpoints for this Other is: " + hitPoints + " and drops item number: " + RandNumMethod3());
		System.out.print("Encounter percentage chance on Quest: " + k + "%");
		if (k == 0) {
			m=0;
		}
		System.out.println(" and drop item percentage: " + m + "%");
		System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
		if(i >=65) {
			j = MagicItem();
		}
		else {
			j=0;
		}
		System.out.println(" and magic drop item is number: " + j);
		System.out.println("Damage per hit upon Player Character is: " + damagePerHit + NEWLINE +"Experience Points Gained: " + expPoints);
		System.out.println("Coin Drop: " + coinDrop);
		System.out.println("----------------");
		
		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
		
	}
}
