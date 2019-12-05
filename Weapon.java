
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
		arr[0] = new Weapons(1, "One", 100, 100);
		arr[1] = new Weapons(2,"Two", 100, 100);
		arr[2] = new Weapons(3, "Three", 100, 100);
		arr[3] = new Weapons(4, "Four", 100, 100);
		arr[4] = new Weapons(5,"Five", 100, 100);
		arr[5] = new Weapons(6, "Six", 100, 100);
		arr[6] = new Weapons(7, "Seven", 100, 100);
		arr[7] = new Weapons(8,"Eight", 100, 100);
		arr[8] = new Weapons(9, "Nine", 100, 100);
		arr[9] = new Weapons(10, "Ten", 100, 100);
		
		WeaponsConfig = arr.clone();
		//Test output
		System.out.print("\n");
		System.out.println("From Array:");
		for (int i = 0; i < arr.length; i++) {
	        System.out.println("Element at " + i + " : " + arr[i].Weapon_ID +" "+ arr[i].Weapon_Name +" "+ arr[i].Damage + " " + arr[i].Duribility );
	        
		}
		System.out.print("\n");
		System.out.println("From Config Array:");
		for(int i = 0; i < WeaponsConfig.length; i++) {
			System.out.println("Element at " + i + " : " + WeaponsConfig[i].Weapon_ID +" "+ WeaponsConfig[i].Weapon_Name +" "+ WeaponsConfig[i].Damage+ " " + WeaponsConfig[i].Duribility );
		}
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