/*		TAG: Team Adventure Game
 * 		Code: Don Combs
 * 		11-24-2019 To Current Date
 * 		
 */
public class Magic_Armor {

	public static MagicArmors[] MagicArmorsConfig;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadMagicArmors();
	}
	public static void LoadMagicArmors() {
		
		MagicArmors[] arr;
		arr = new MagicArmors[10];
		//Array setup: ArmorID, Armor Name, Damage, Durability
		arr[0] = new MagicArmors(1, "Magic Leather Assless Chaps of Village People", 10, 10);
		arr[1] = new MagicArmors(2,"Magic Leather Tunic", 20, 20);
		arr[2] = new MagicArmors(3, "Magic Leather Plate Mail", 30, 30);
		arr[3] = new MagicArmors(4, "Magic Tin Breast Plate", 30, 20);
		arr[4] = new MagicArmors(5,"Magic Iron Breat Plate", 40, 50);
		arr[5] = new MagicArmors(6, "Magic Bronze Armor", 50, 55);
		arr[6] = new MagicArmors(7, "Magic Steel Breast Plate", 65, 75);
		arr[7] = new MagicArmors(8,"Magic Helm of Iron", 50, 50);
		arr[8] = new MagicArmors(9, "Magic Tin Helm", 30, 15);
		arr[9] = new MagicArmors(10, "Magic The Emperor's New Clothes, Naked", 0, 0);
		//arr[10] = new MagicArmors(10, "Chain Mail", 50, 75);
		
		MagicArmorsConfig = arr.clone();
		//Test output
//		System.out.print("\n");
//		System.out.println("From Array:");
//		for (int i = 0; i < arr.length; i++) {
//	        System.out.println("Element at " + i + " : " + arr[i].MagicArmor_ID +" "+ arr[i].MagicArmor_Name +" "+ arr[i].Damage + " " + arr[i].Duribility );
//	        
//		}
//		System.out.print("\n");
//		System.out.println("From Config Array:");
//		for(int i = 0; i < MagicArmorsConfig.length; i++) {
//			System.out.println("Element at " + i + " : " + MagicArmorsConfig[i].MagicArmor_ID +" "+ MagicArmorsConfig[i].MagicArmor_Name +" "+ MagicArmorsConfig[i].Damage+ " " + MagicArmorsConfig[i].Duribility );
//		}
	}
}
class MagicArmors {
	
	public int MagicArmor_ID;
	public String MagicArmor_Name;
	public int Damage;
	public int Duribility;
	
	MagicArmors(int MagicArmor_ID, String MagicArmor_Name,  int Damage, int Duribility)
	{
		this.MagicArmor_ID = MagicArmor_ID;
		this.MagicArmor_Name = MagicArmor_Name;
		this.Damage = Damage;
		this.Duribility = Duribility;
		
	}
	
}


