/*		TAG: Team Adventure Game
 * 		Code: Don Combs / Ken A.
 * 		11-24-2019 To Current Date
 * 		
 */
import java.util.Random;

public class MonsterTypeBoss {
		//Boss basic monsters
		//imp
		//troll
		//hydra
		//Zombie
		//ZombieDragon
		//Other
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//
//			BossTroll();
//			BossImp();
//			BossHydra();
//			BossZombie();
//			BossOther();
//			BossZombieDragon();
			
			BossMonster();
		}
		public static void BossMonster() {
			
			String Monster = RandMonster(RandomMonsterMethod());
			BattleEngineBoss.BattleMonster(Monster);
			
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
				Monster = "BossTroll";
			else if (i == 1)
				Monster = "BossImp";
			else if (i == 2)
				Monster = "BossHydra";
			else if (i == 3)
				Monster = "BossZombie";
			else if (i == 4)
				Monster = "BossOther";
			else if (i == 5)
				Monster = "BossZombieDragon";
					
			return Monster;
		}
		public static int RandNumMethod() {
			Random randNum = new Random();
			int rand_int1 = randNum.nextInt(101);
			if (rand_int1 <= 30) {
				rand_int1 = rand_int1 + 50;
			}
			return rand_int1;
		}
		public static int RandNumMethod2() {
			Random randNum = new Random();
			int rand_int1 = randNum.nextInt(51);
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
			if (i > 20) {
				return i;
			}
			else {
				return 0;
			}
		}
		public static int MagicItemChance() {
			//chance of dropping magic item
			int i = RandNumMethod();
			if (i > 25) {
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
			int i = (RandNumMethod2() * 11);
			if(i<=5) {
				i = (RandNumMethod() + RandNumMethod2());
				}
			if(i >=100) {
				i = ((RandNumMethod() + RandNumMethod2())/2);
			}
			return i;
		}
		public static int[] MonsterBoss(String Monster) {
			//random hitpoints
			//random dropitem on death
			//random encounter
			//random Magic item
			//Damage per hit
			
			int hitPoints = ((RandNumMethod() + RandNumMethod2()) * 4) + ((Player.CHARACTER_LEVEL)*5);
			int damagePerHit = DamagePerHit() + ((Player.CHARACTER_LEVEL)*4);
			int expPoints = RandNumMethod();
			int coinDrop = RandNumMethod() + ((Player.CHARACTER_LEVEL)*3);
			int magicItemChance = MagicItemChance();
			int magicItem = MagicItem();
			int encounter = Encounter();
			int dropItem = DropItem();
			int n = ((RandNumMethod() + RandNumMethod())*2); // Exp Points Multiplier
			int ArmorOrWeapon = RandNumMethod5();
			String Dropped = "";
			
			expPoints = expPoints + n;
			
			System.out.println("\t--------For "+ Monster +"--------");
			System.out.println("\tThe hitpoints for this "+ Monster +" is: " + hitPoints + " Encounter percentage chance on Quest: " + encounter + "%");
			if (encounter == 0) {
				dropItem=0;
			}
			if(ArmorOrWeapon == 0)
				Dropped = "Armor";
			if(ArmorOrWeapon == 1)
				Dropped = "Weapon";
			System.out.println("\tDrop item percentage: " + RandNumMethod4() + "%." +" and drops item number: " + dropItem);
			if(Dropped == "Armor") {
				//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
				System.out.print("\tDropped Item is "+Dropped+ " Class and is the Item: *** " + Armor.ArmorsConfig[dropItem].Armor_Name + " ***");
			}
			if(Dropped == "Weapon") {
				System.out.print("\tDropped Item is "+Dropped+ " Class and is the Item: *** " + Weapon.WeaponsConfig[dropItem].Weapon_Name + " ***");
			}
			System.out.print("\n\tMagic Item Drop percentage chance on Quest: " + magicItemChance + "%");
			if(magicItemChance >=65) {
				magicItem = MagicItem();
			}
			else {
				magicItem=0;
			}
			System.out.println(" The Magic Item dropped is number: " + magicItem);
			if(Dropped == "Armor") {
				//System.out.print(Armor.ArmorsConfig[dropItem].Armor_Name);
				System.out.print("\tDropped Item is "+Dropped+ " Class and is the Item: *** " + Magic_Armor.MagicArmorsConfig[magicItem].MagicArmor_Name + " ***");
			}
			if(Dropped == "Weapon") {
				System.out.print("\tDropped Item is "+Dropped+ " Class and is the Item: *** " + Magic_Weapon.MagicWeaponsConfig[magicItem].MagicWeapon_Name + " ***");
			}
			System.out.println("\n\tMAX Damage per hit upon Player Character is: " + DamagePerHit() + GameEngine.NEWLINE +"\tExperience Points Gained: " + expPoints
				+":\tCoin Drop: " + coinDrop);
			System.out.println("\n\t----------------");
			
			if(Monster == "BossTroll")
				MonsterAscii.TrollAscii();
			if(Monster == "BossImp")
				MonsterAscii.ImpAscii();		
			if(Monster == "BossHydra")
				MonsterAscii.HydraAscii();
			if(Monster == "BossZombie")
				MonsterAscii.ZombieAscii();
			if(Monster == "BossZombieDragon")
				MonsterAscii.ZombieDragonAscii();
			
			return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
		}
}
