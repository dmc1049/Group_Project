/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
public class Armor {

	public static Armors[] ArmorsConfig;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadArmors();
	}
	public static void LoadArmors() {
		
		Armors[] arr;
		arr = new Armors[10];
		//Array setup: ArmorID, Armor Name, Damage, Durability
		arr[0] = new Armors(1, "Leather Assless Chaps of Village People", 10, 10);
		arr[1] = new Armors(2,"Leather Tunic", 20, 20);
		arr[2] = new Armors(3, "Leather Plate Mail", 30, 30);
		arr[3] = new Armors(4, "Tin Breast Plate", 30, 20);
		arr[4] = new Armors(5,"Iron Breat Plate", 40, 50);
		arr[5] = new Armors(6, "Bronze Armor", 50, 55);
		arr[6] = new Armors(7, "Steel Breast Plate", 65, 75);
		arr[7] = new Armors(8,"Helm of Iron", 50, 50);
		arr[8] = new Armors(9, "Tin Helm", 30, 15);
		arr[9] = new Armors(10, "The Emperor's New Clothes, Naked", 0, 0);
		//arr[10] = new Armors(10, "Chain Mail", 50, 75);
		
		ArmorsConfig = arr.clone();
		//Test output
//		System.out.print("\n");
//		System.out.println("From Array:");
//		for (int i = 0; i < arr.length; i++) {
//	        System.out.println("Element at " + i + " : " + arr[i].Armor_ID +" "+ arr[i].Armor_Name +" "+ arr[i].Damage + " " + arr[i].Duribility );
//	        
//		}
//		System.out.print("\n");
//		System.out.println("From Config Array:");
//		for(int i = 0; i < ArmorsConfig.length; i++) {
//			System.out.println("Element at " + i + " : " + ArmorsConfig[i].Armor_ID +" "+ ArmorsConfig[i].Armor_Name +" "+ ArmorsConfig[i].Damage+ " " + ArmorsConfig[i].Duribility );
//		}
	}
}
class Armors {
	
	public int Armor_ID;
	public String Armor_Name;
	public int Damage;
	public int Duribility;
	
	Armors(int Armor_ID, String Armor_Name,  int Damage, int Duribility)
	{
		this.Armor_ID = Armor_ID;
		this.Armor_Name = Armor_Name;
		this.Damage = Damage;
		this.Duribility = Duribility;
		
	}
	
}


