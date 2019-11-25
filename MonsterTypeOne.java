import java.util.Random;

public class MonsterTypeOne {
	//basic monsters
	//imp
	//troll
	//hydra
	//Zombie
	//Other
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Troll();
		Imp();
		Hydra();
		Zombie();
		Other();
	}
	public static int RandNumMethod() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(100);
		return rand_int1;
	}
	public static int RandNumMethod2() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(20);
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
		int i = RandNumMethod();
		return i;
	}
	public static int DropItem() {
		// item in item list array
		int i = RandNumMethod();
		return i;

	}
	public static int DamagePerHit() {
		int i = RandNumMethod2();
		return i;
	}
	public static void Troll() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Troll--------");
		System.out.println("The hitpoints for this Troll is: " + RandNumMethod() + " and drops item number: " + RandNumMethod());
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
		System.out.println("Damage per hit upon Player Character is: " + DamagePerHit());
		System.out.println("----------------");
		
	}
	public static void Imp() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Imp--------");
		System.out.println("The hitpoints for this Imp is: " + RandNumMethod() + " and drops item number: " + RandNumMethod());
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
		System.out.println("Damage per hit upon Player Character is: " + DamagePerHit());
		System.out.println("----------------");
		
	}
	public static void Hydra() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Hydra--------");
		System.out.println("The hitpoints for this Hydra is: " + RandNumMethod() + " and drops item number: " + RandNumMethod());
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
		System.out.println("Damage per hit upon Player Character is: " + DamagePerHit());
		System.out.println("----------------");
		
	}
	public static void Zombie() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Zombie--------");
		System.out.println("The hitpoints for this Zombie is: " + RandNumMethod() + " and drops item number: " + RandNumMethod());
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
		System.out.println("Damage per hit upon Player Character is: " + DamagePerHit());
		System.out.println("----------------");
		
	}
	public static void Other() {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		
		int i = MagicItemChance();
		int j = MagicItem();
		int k = Encounter();
		int m = DropItem();
		
		System.out.println("--------For Other--------");
		System.out.println("The hitpoints for this Other is: " + RandNumMethod() + " and drops item number: " + RandNumMethod());
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
		System.out.println("Damage per hit upon Player Character is: " + DamagePerHit());
		System.out.println("----------------");
		
	}
}
