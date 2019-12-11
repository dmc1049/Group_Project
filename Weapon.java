/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
public class Weapon {
	
	public static Weapons[] WeaponsConfig;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadWeapons();
	}
	public static void LoadWeapons() {
		
		Weapons[] arr;
		arr = new Weapons[10];
		//Array setup: WeaponID, Weapon Name, Damage, Durability
		arr[0] = new Weapons(1, "Broken Sword", 10, 10);
		arr[1] = new Weapons(2,"Limp Sword of Viagra", 5, 5);
		arr[2] = new Weapons(3, "Bronze Sword", 100, 100);
		arr[3] = new Weapons(4, "Steel Sword", 100, 100);
		arr[4] = new Weapons(5,"Club", 75, 50);
		arr[5] = new Weapons(6, "Hammer and Nails", 65, 85);
		arr[6] = new Weapons(7, "Stick", 100, 100);
		arr[7] = new Weapons(8,"Stake", 1, 20);
		arr[8] = new Weapons(9, "Katana", 50, 50);
		arr[9] = new Weapons(10, "Spear", 25, 25);
		
		WeaponsConfig = arr.clone();
		//Test output
//		System.out.print("\n");
//		System.out.println("From Array:");
//		for (int i = 0; i < arr.length; i++) {
//	        System.out.println("Element at " + i + " : " + arr[i].Weapon_ID +" "+ arr[i].Weapon_Name +" "+ arr[i].Damage + " " + arr[i].Duribility );
//	        
//		}
//		System.out.print("\n");
//		System.out.println("From Config Array:");
//		for(int i = 0; i < WeaponsConfig.length; i++) {
//			System.out.println("Element at " + i + " : " + WeaponsConfig[i].Weapon_ID +" "+ WeaponsConfig[i].Weapon_Name +" "+ WeaponsConfig[i].Damage+ " " + WeaponsConfig[i].Duribility );
//		}
	}
}
class Weapons {
	
	public int Weapon_ID;
	public String Weapon_Name;
	public int Damage;
	public int Duribility;
	
	Weapons(int Weapon_ID, String Weapon_Name,  int Damage, int Duribility)
	{
		this.Weapon_ID = Weapon_ID;
		this.Weapon_Name = Weapon_Name;
		this.Damage = Damage;
		this.Duribility = Duribility;
		
	}
	
}