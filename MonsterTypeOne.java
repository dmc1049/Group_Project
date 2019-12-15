/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
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
//		Troll();
//		Imp();
//		Hydra();
//		Zombie();
//		Other();
		Monster();
	}
	public static void Monster() {
		
		String Monster = RandMonster(RandomMonsterMethod());
		BattleEngine.BattleMonster(Monster);
		
	}
	public static int RandomMonsterMethod() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(6);
		return rand_int1;
	}
	public static String RandMonster(int randMonster) {
		
		int i = randMonster;
		String Monster = "";
		if(i == 0)
			Monster = "Troll";
		else if (i == 1)
			Monster = "Imp";
		else if (i == 2)
			Monster = "Hydra";
		else if (i == 3)
			Monster = "Zombie";
		else if (i == 4)
			Monster = "Other";
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
		if(rand_int1 == 0) {
			RandNumMethod2();
		}
		return rand_int1;
	}
	public static int RandNumMethod3() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(10);
		return rand_int1;
	}
	public static int RandNumMethod4() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(101);
		return rand_int1;
	}
	public static int RandNumMethod5() {
		Random randNum = new Random();
		int rand_int1 = randNum.nextInt(2);
		return rand_int1;
	}
	public static int Encounter() {
		int i = RandNumMethod();
		if (i > 35) {
			return i;
		}
		else {
			return 0;
		}
	}
	public static int MagicItemChance() {
		//chance of dropping magic item
		int i = RandNumMethod4();
		if (i > 55) {
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
	public static int[] MonsterOne(String Monster) {
		//random hitpoints
		//random dropitem on death
		//random encounter
		//random Magic item
		//Damage per hit
		//Exp Points
		
		int hitPoints = RandNumMethod() + ((Player.CHARACTER_LEVEL)*4);
		int damagePerHit = DamagePerHit() + ((Player.CHARACTER_LEVEL)*3);
		int expPoints = RandNumMethod();
		int coinDrop = RandNumMethod() + ((Player.CHARACTER_LEVEL)*3);
		int magicItemChance = MagicItemChance();
		int magicItem = MagicItem();
		int encounter = Encounter();
		int dropItem = DropItem();
		
		System.out.print("\n");
		System.out.println("\t--------Stats For "+Monster+"--------");
		System.out.println("\tThe hitpoints for this "+Monster+" is: " + hitPoints + " Encounter percentage chance on Quest: " + encounter + "%");
		if (encounter == 0) {
			dropItem=0;
		}
		int ArmorOrWeapon = RandNumMethod5();
		String Dropped = "";
		if(ArmorOrWeapon == 0)
			Dropped = "Armor";
		if(ArmorOrWeapon == 1)
			Dropped = "Weapon";
		System.out.println("\tDrop item percentage: " + RandNumMethod4() + "%" + " and dropped item number is: " + dropItem);
		if(Dropped == "Armor") {
			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
			System.out.print("\tDropped Item is "+Dropped+ " Class and is the item named: *** " + Armor.ArmorsConfig[dropItem].Armor_Name + " ***");
		}
		if(Dropped == "Weapon") {
			System.out.print("\tDropped Item is "+Dropped+ " Class and is the item named: *** " + Weapon.WeaponsConfig[dropItem].Weapon_Name + " ***");
		}
//		System.out.print("\n\tMagic Item Drop percentage chance on Quest: " + magicItemChance + "%");
//		if(magicItemChance >=65) {
//			magicItem = MagicItem();
//		}
//		else {
//			magicItem=0;
//		}
//		System.out.println(" The Magic Item dropped is number: " + magicItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Armor.MagicArmorsConfig[dropItem].MagicArmor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Weapon.MagicWeaponsConfig[dropItem].MagicWeapon_Name);
//		}
		System.out.println("\n\tMAX Damage per hit upon Player Character is: " + damagePerHit + GameEngine.NEWLINE +"\tExperience Points Gained: " + expPoints +
			":\tCoin Drop: " + coinDrop);
		System.out.println("\n\t----------------");
		
		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
		
	}
//	public static int[] Troll() {
//		//random hitpoints
//		//random dropitem on death
//		//random encounter
//		//random Magic item
//		//Damage per hit
//		//Exp Points
//		
//		int hitPoints = RandNumMethod();
//		int damagePerHit = DamagePerHit();
//		int expPoints = RandNumMethod();
//		int coinDrop = RandNumMethod();
//		int magicItemChance = MagicItemChance();
//		int magicItem = MagicItem();
//		int encounter = Encounter();
//		int dropItem = DropItem();
//		
//		System.out.print("\n");
//		System.out.println("\t--------Stats For Troll--------");
//		System.out.println("\tThe hitpoints for this Troll is: " + hitPoints + " Encounter percentage chance on Quest: " + encounter + "%");
//		if (encounter == 0) {
//			dropItem=0;
//		}
//		int ArmorOrWeapon = RandNumMethod5();
//		String Dropped = "";
//		if(ArmorOrWeapon == 0)
//			Dropped = "Armor";
//		if(ArmorOrWeapon == 1)
//			Dropped = "Weapon";
//		System.out.println("\tDrop item percentage: " + RandNumMethod4() + "%" + " and dropped item number is: " + dropItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Armor.ArmorsConfig[dropItem].Armor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Weapon.WeaponsConfig[dropItem].Weapon_Name);
//		}
//		System.out.print("\n\tMagic Item Drop percentage chance on Quest: " + magicItemChance + "%");
//		if(magicItemChance >=65) {
//			magicItem = MagicItem();
//		}
//		else {
//			magicItem=0;
//		}
//		System.out.println(" The Magic Item dropped is number: " + magicItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Armor.MagicArmorsConfig[dropItem].MagicArmor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Weapon.MagicWeaponsConfig[dropItem].MagicWeapon_Name);
//		}
//		System.out.println("\tDamage per hit upon Player Character is: " + damagePerHit + GameEngine.NEWLINE +"\tExperience Points Gained: " + expPoints);
//		System.out.println("\tCoin Drop: " + coinDrop);
//		System.out.println("\t----------------");
//		
//		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
//		
//	}
//	public static int[] Imp() {
//		//random hitpoints
//		//random dropitem on death
//		//random encounter
//		//random Magic item
//		//Damage per hit
//		
//		int hitPoints = RandNumMethod();
//		int damagePerHit = DamagePerHit();
//		int expPoints = RandNumMethod();
//		int coinDrop = RandNumMethod();
//		int magicItemChance = MagicItemChance();
//		int magicItem = MagicItem();
//		int encounter = Encounter();
//		int dropItem = DropItem();
//		
//		System.out.print("\n");
//		System.out.println("\t--------Stats For Imp--------");
//		System.out.println("\tThe hitpoints for this Imp is: " + hitPoints + " Encounter percentage chance on Quest: " + encounter + "%");
//		if (encounter == 0) {
//			dropItem=0;
//		}
//		int ArmorOrWeapon = RandNumMethod5();
//		String Dropped = "";
//		if(ArmorOrWeapon == 0)
//			Dropped = "Armor";
//		if(ArmorOrWeapon == 1)
//			Dropped = "Weapon";
//		System.out.println("\tDrop item percentage: " + RandNumMethod4() + "%" + " and dropped item number is: " + dropItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Armor.ArmorsConfig[dropItem].Armor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Weapon.WeaponsConfig[dropItem].Weapon_Name);
//		}
//		System.out.print("\n\tMagic Item Drop percentage chance on Quest: " + magicItemChance + "%");
//		if(magicItemChance >=65) {
//			magicItem = MagicItem();
//		}
//		else {
//			magicItem=0;
//		}
//		System.out.println(" The Magic Item dropped is number: " + magicItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Armor.MagicArmorsConfig[dropItem].MagicArmor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Weapon.MagicWeaponsConfig[dropItem].MagicWeapon_Name);
//		}
//		System.out.println("\tDamage per hit upon Player Character is: " + damagePerHit + GameEngine.NEWLINE +"\tExperience Points Gained: " + expPoints);
//		System.out.println("\tCoin Drop: " + coinDrop);
//		System.out.println("\t----------------");
//		
//		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
//		
//	}
//	public static int[] Hydra() {
//		//random hitpoints
//		//random dropitem on death
//		//random encounter
//		//random Magic item
//		//Damage per hit
//		
//		int hitPoints = RandNumMethod();
//		int damagePerHit = DamagePerHit();
//		int expPoints = RandNumMethod();
//		int coinDrop = RandNumMethod();
//		int magicItemChance = MagicItemChance();
//		int magicItem = MagicItem();
//		int encounter = Encounter();
//		int dropItem = DropItem();
//		
//		
//		System.out.print("\n");
//		System.out.println("\t--------Stats For Hydra--------");
//		System.out.println("\tThe hitpoints for this Hydra is: " + hitPoints + " Encounter percentage chance on Quest: " + encounter + "%");
//		if (encounter == 0) {
//			dropItem=0;
//		}
//		int ArmorOrWeapon = RandNumMethod5();
//		String Dropped = "";
//		if(ArmorOrWeapon == 0)
//			Dropped = "Armor";
//		if(ArmorOrWeapon == 1)
//			Dropped = "Weapon";
//		System.out.println("\n\tDrop item percentage: " + RandNumMethod4() + "%" + " and dropped item number is: " + dropItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Armor.ArmorsConfig[dropItem].Armor_Name + ".");
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Weapon.WeaponsConfig[dropItem].Weapon_Name + ".");
//		}
//		System.out.print("\n\tMagic Item Drop percentage chance on Quest: " + magicItemChance + "%.");
//		if(magicItemChance >=65) {
//			magicItem = MagicItem();
//		}
//		else {
//			magicItem=0;
//		}
//		System.out.println(" The Magic Item dropped is number: " + magicItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Armor.MagicArmorsConfig[dropItem].MagicArmor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Weapon.MagicWeaponsConfig[dropItem].MagicWeapon_Name);
//		}
//		System.out.println("\n\tDamage per hit upon Player Character is: " + damagePerHit + GameEngine.NEWLINE +"\tExperience Points Gained: " + expPoints);
//		System.out.println("\tCoin Drop: " + coinDrop);
//		System.out.println("\t----------------");
//		
//		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
//	}
//	public static int[] Zombie() {
//		//random hitpoints
//		//random dropitem on death
//		//random encounter
//		//random Magic item
//		//Damage per hit
//		
//		int hitPoints = RandNumMethod();
//		int damagePerHit = DamagePerHit();
//		int expPoints = RandNumMethod();
//		int coinDrop = RandNumMethod();
//		int magicItemChance = MagicItemChance();
//		int magicItem = MagicItem();
//		int encounter = Encounter();
//		int dropItem = DropItem();
//		
//		System.out.print("\n");
//		System.out.println("\t--------Stats For Zombie--------");
//		System.out.println("\tThe hitpoints for this Zombie is: " + hitPoints + " Encounter percentage chance on Quest: " + encounter + "%");
//		if (encounter == 0) {
//			dropItem=0;
//		}
//		int ArmorOrWeapon = RandNumMethod5();
//		String Dropped = "";
//		if(ArmorOrWeapon == 0)
//			Dropped = "Armor";
//		if(ArmorOrWeapon == 1)
//			Dropped = "Weapon";
//		System.out.println("\n\tDrop item percentage: " + RandNumMethod4() + "%" + " and dropped item number is: " + dropItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Armor.ArmorsConfig[dropItem].Armor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Weapon.WeaponsConfig[dropItem].Weapon_Name);
//		}
//		System.out.print("\n\tMagic Item Drop percentage chance on Quest: " + magicItemChance + "%.");
//		if(magicItemChance >=65) {
//			magicItem = MagicItem();
//		}
//		else {
//			magicItem=0;
//		}
//		System.out.println(" The Magic Item dropped is number: " + magicItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Armor.MagicArmorsConfig[dropItem].MagicArmor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Weapon.MagicWeaponsConfig[dropItem].MagicWeapon_Name);
//		}
//		System.out.println("\tDamage per hit upon Player Character is: " + damagePerHit + GameEngine.NEWLINE +"\tExperience Points Gained: " + expPoints);
//		System.out.println("\tCoin Drop: " + coinDrop);
//		System.out.println("\t----------------");
//		
//		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
//		
//	}
//	public static int[] Other() {
//		//random hitpoints
//		//random dropitem on death
//		//random encounter
//		//random Magic item
//		//Damage per hit
//		
//		int hitPoints = RandNumMethod();
//		int damagePerHit = DamagePerHit();
//		int expPoints = RandNumMethod();
//		int coinDrop = RandNumMethod();
//		int magicItemChance = MagicItemChance();
//		int magicItem = MagicItem();
//		int encounter = Encounter();
//		int dropItem = DropItem();
//		
//		System.out.print("\n");
//		System.out.println("\t--------Stats For Other--------");
//		System.out.println("\tThe hitpoints for this Other is: " + hitPoints + " Encounter percentage chance on Quest: " + encounter + "%");
//		if (encounter == 0) {
//			dropItem=0;
//		}
//		int ArmorOrWeapon = RandNumMethod5();
//		String Dropped = "";
//		if(ArmorOrWeapon == 0)
//			Dropped = "Armor";
//		if(ArmorOrWeapon == 1)
//			Dropped = "Weapon";
//		System.out.println("\n\tDrop item percentage: " + RandNumMethod4() + "%" + " and dropped item number is: " + dropItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Armor.ArmorsConfig[dropItem].Armor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Weapon.WeaponsConfig[dropItem].Weapon_Name);
//		}
//		System.out.print("\n\tMagic Item Drop percentage chance on Quest: " + magicItemChance + "%");
//		if(magicItemChance >=65) {
//			magicItem = MagicItem();
//		}
//		else {
//			magicItem=0;
//		}
//		System.out.println(" The Magic Item dropped is number: " + magicItem);
//		if(Dropped == "Armor") {
//			//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Armor.MagicArmorsConfig[dropItem].MagicArmor_Name);
//		}
//		if(Dropped == "Weapon") {
//			System.out.print("\n\tDropped Item is "+Dropped+ " Class and is the Item: " + Magic_Weapon.MagicWeaponsConfig[dropItem].MagicWeapon_Name);
//		}
//		System.out.println("\tDamage per hit upon Player Character is: " + damagePerHit + GameEngine.NEWLINE +"\tExperience Points Gained: " + expPoints);
//		System.out.println("\tCoin Drop: " + coinDrop);
//		System.out.println("\t----------------");
//		
//		return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
//		
//	}
}
