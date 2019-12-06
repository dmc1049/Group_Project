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
			BossTroll();
			BossImp();
			BossHydra();
			BossZombie();
			BossOther();
			BossZombieDragon();
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
			if(i == 1)
				Monster = "BossTroll";
			else if (i == 2)
				Monster = "BossImp";
			else if (i == 3)
				Monster = "BossHydra";
			else if (i == 4)
				Monster = "BossZombie";
			else if (i == 5)
				Monster = "BossOther";
			else if (i==6)
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
			int rand_int1 = randNum.nextInt(11);
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
		public static int[] BossTroll() {
			//random hitpoints
			//random dropitem on death
			//random encounter
			//random Magic item
			//Damage per hit
			
			int hitPoints = ((RandNumMethod() + RandNumMethod2()) * 3);
			int damagePerHit = DamagePerHit();
			int expPoints = RandNumMethod();
			int coinDrop = RandNumMethod();
			int i = MagicItemChance();
			int j = MagicItem();
			int k = Encounter();
			int m = DropItem();
			int n = ((RandNumMethod() + RandNumMethod())*2);
			
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
			System.out.println("Damage per hit upon Player Character is: " + DamagePerHit() + GameEngine.NEWLINE +"Experience Points Gained: " + n);
			System.out.println("----------------");
			
			return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
		}
		public static int[] BossImp() {
			//random hitpoints
			//random dropitem on death
			//random encounter
			//random Magic item
			//Damage per hit
			
			int hitPoints = ((RandNumMethod() + RandNumMethod2()) * 4);
			int damagePerHit = DamagePerHit();
			int expPoints = RandNumMethod();
			int coinDrop = RandNumMethod();
			int i = MagicItemChance();
			int j = MagicItem();
			int k = Encounter();
			int m = DropItem();
			int n = ((RandNumMethod() + RandNumMethod())*2);
			
			System.out.println("--------For Imp--------");
			System.out.println("The hitpoints for this Imp is: " + hitPoints + " and drops item number: " + RandNumMethod3());
			System.out.print("Encounter percentage chance on Quest: " + k + "%");
			if (k == 0) {
				m=0;
			}
			System.out.println(" and drop item percentage: " + m + "%");
			System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
			if(i >=25) {
				j = MagicItem();
			}
			else {
				j=0;
			}
			System.out.println(" and magic drop item is number: " + j);
			System.out.println("Damage per hit upon Player Character is: " + DamagePerHit() + GameEngine.NEWLINE +"Experience Points Gained: " + n);
			System.out.println("----------------");
			
			return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
			
		}
		public static int[] BossHydra() {
			//random hitpoints
			//random dropitem on death
			//random encounter
			//random Magic item
			//Damage per hit
			
			int hitPoints = ((RandNumMethod() + RandNumMethod2()) * 5);
			int damagePerHit = DamagePerHit();
			int expPoints = RandNumMethod();
			int coinDrop = RandNumMethod();
			int i = MagicItemChance();
			int j = MagicItem();
			int k = Encounter();
			int m = DropItem();
			int n = ((RandNumMethod() + RandNumMethod())*2);
			
			System.out.println("--------For Hydra--------");
			System.out.println("The hitpoints for this Hydra is: " + hitPoints + " and drops item number: " + RandNumMethod3());
			System.out.print("Encounter percentage chance on Quest: " + k + "%");
			if (k == 0) {
				m=0;
			}
			System.out.println(" and drop item percentage: " + m + "%");
			System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
			if(i >=25) {
				j = MagicItem();
			}
			else {
				j=0;
			}
			System.out.println(" and magic drop item is number: " + j);
			System.out.println("Damage per hit upon Player Character is: " + DamagePerHit() + GameEngine.NEWLINE +"Experience Points Gained: " + n);
			System.out.println("----------------");
			
			return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
			
		}
		public static int[] BossZombie() {
			//random hitpoints
			//random dropitem on death
			//random encounter
			//random Magic item
			//Damage per hit
			
			int hitPoints = ((RandNumMethod() + RandNumMethod2()) * 6);
			int damagePerHit = DamagePerHit();
			int expPoints = RandNumMethod();
			int coinDrop = RandNumMethod();
			int i = MagicItemChance();
			int j = MagicItem();
			int k = Encounter();
			int m = DropItem();
			int n = ((RandNumMethod() + RandNumMethod())*2);
			
			System.out.println("--------For Zombie--------");
			System.out.println("The hitpoints for this Zombie is: " + hitPoints + " and drops item number: " + RandNumMethod3());
			System.out.print("Encounter percentage chance on Quest: " + k + "%");
			if (k == 0) {
				m=0;
			}
			System.out.println(" and drop item percentage: " + m + "%");
			System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
			if(i >=25) {
				j = MagicItem();
			}
			else {
				j=0;
			}
			System.out.println(" and magic drop item is number: " + j);
			System.out.println("Damage per hit upon Player Character is: " + DamagePerHit() + GameEngine.NEWLINE +"Experience Points Gained: " + n);
			System.out.println("----------------");
			
			return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
			
		}
		public static int[] BossOther() {
			//random hitpoints
			//random dropitem on death
			//random encounter
			//random Magic item
			//Damage per hit
			
			int hitPoints = ((RandNumMethod() + RandNumMethod2()) * 7);
			int damagePerHit = DamagePerHit();
			int expPoints = RandNumMethod();
			int coinDrop = RandNumMethod();
			int i = MagicItemChance();
			int j = MagicItem();
			int k = Encounter();
			int m = DropItem();
			int n = ((RandNumMethod() + RandNumMethod())*2);
			
			System.out.println("--------For Other--------");
			System.out.println("The hitpoints for this Other is: " + hitPoints + " and drops item number: " + RandNumMethod3());
			System.out.print("Encounter percentage chance on Quest: " + k + "%");
			if (k == 0) {
				m=0;
			}
			System.out.println(" and drop item percentage: " + m + "%");
			System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
			if(i >=25) {
				j = MagicItem();
			}
			else {
				j=0;
			}
			System.out.println(" and magic drop item is number: " + j);
			System.out.println("Damage per hit upon Player Character is: " + DamagePerHit() + GameEngine.NEWLINE +"Experience Points Gained: " + n);
			System.out.println("----------------");
			
			return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
			
		}
		public static int[] BossZombieDragon() {
			//random hitpoints
			//random dropitem on death
			//random encounter
			//random Magic item
			//Damage per hit
			
			int hitPoints = ((RandNumMethod() + RandNumMethod2()) * 9);
			int damagePerHit = DamagePerHit();
			int expPoints = RandNumMethod();
			int coinDrop = RandNumMethod();
			int i = MagicItemChance();
			int j = MagicItem();
			int k = Encounter();
			int m = DropItem();
			int n = ((RandNumMethod() + RandNumMethod())*2);
			
			System.out.println("--------For Boss Zombie Dragon--------");
			System.out.println("The hitpoints for this Boss Zombie Dragon is: " + hitPoints + " and drops item number: " + RandNumMethod3());
			System.out.print("Encounter percentage chance on Quest: " + k + "%");
			if (k == 0) {
				m=0;
			}
			System.out.println(" and drop item percentage: " + m + "%");
			System.out.print("Magic Item Drop percentage chance on Quest: " + i + "%");
			if(i >=25) {
				j = MagicItem();
			}
			else {
				j=0;
			}
			System.out.println(" and magic drop item is number: " + j);
			System.out.println("Damage per hit upon Player Character is: " + DamagePerHit() + GameEngine.NEWLINE +"Experience Points Gained: " + n);
			System.out.println("----------------");
			
			return new int[] {hitPoints, damagePerHit, expPoints, coinDrop};
			
		}
}
