/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
public class Magic_Weapon {
	
	public static MagicWeapons[] MagicWeaponsConfig;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadMagicWeapons();
	}
	public static void LoadMagicWeapons() {
		
		MagicWeapons[] arr;
		arr = new MagicWeapons[10];
		//Array setup: WeaponID, Weapon Name, Damage, Durability
		arr[0] = new MagicWeapons(1, "Magic Broken Sword", 10, 10);
		arr[1] = new MagicWeapons(2,"Magic Limp Sword of Viagra", 5, 5);
		arr[2] = new MagicWeapons(3, "Magic Bronze Sword", 100, 100);
		arr[3] = new MagicWeapons(4, "Magic Steel Sword", 100, 100);
		arr[4] = new MagicWeapons(5,"Magic Club", 75, 50);
		arr[5] = new MagicWeapons(6, "Magic Hammer and Nails", 65, 85);
		arr[6] = new MagicWeapons(7, "Magic Stick", 100, 100);
		arr[7] = new MagicWeapons(8,"Magic Stake", 1, 20);
		arr[8] = new MagicWeapons(9, "Magic Katana", 50, 50);
		arr[9] = new MagicWeapons(10, "Magic Spear", 25, 25);
		
		MagicWeaponsConfig = arr.clone();
		//Test output
//		System.out.print("\n");
//		System.out.println("From Array:");
//		for (int i = 0; i < arr.length; i++) {
//	        System.out.println("Element at " + i + " : " + arr[i].MagicWeapon_ID +" "+ arr[i].MagicWeapon_Name +" "+ arr[i].Damage + " " + arr[i].Duribility );
//	        
//		}
//		System.out.print("\n");
//		System.out.println("From Config Array:");
//		for(int i = 0; i < MagicWeaponsConfig.length; i++) {
//			System.out.println("Element at " + i + " : " + MagicWeaponsConfig[i].MagicWeapon_ID +" "+ MagicWeaponsConfig[i].MagicWeapon_Name +" "+ MagicWeaponsConfig[i].Damage+ " " + MagicWeaponsConfig[i].Duribility );
//		}
	}
}
class MagicWeapons {
	
	public int MagicWeapon_ID;
	public String MagicWeapon_Name;
	public int Damage;
	public int Duribility;
	
	MagicWeapons(int MagicWeapon_ID, String MagicWeapon_Name,  int Damage, int Duribility)
	{
		this.MagicWeapon_ID = MagicWeapon_ID;
		this.MagicWeapon_Name = MagicWeapon_Name;
		this.Damage = Damage;
		this.Duribility = Duribility;
		
	}
	
}