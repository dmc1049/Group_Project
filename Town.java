
public class Town {

	public static final String CurrentTownIn = "One";
	//passed info from game engine of saved info or new info to open
	
	//load town
		//1st game town or last saved town
	
	//create an array of towns loaded in the game
	
	//create array of towns visited by player already from config file
	
	/*
	 * Remove Main when you go to include this into the town and map
	 */
	public static void main (String[] args)
	{
	//Create list of Towns
	Towns[] arr;
	
	arr = new Towns[2];
	//Array setup: TownID, Town Name, Set NCP1, Set NCP2, Random NCP3, Town_e_id, Town_w_id, Town_n_id, Town_s_id
	arr[0] = new Towns(1, "One");
	arr[1] = new Towns(2,"Two");
	
//	Town_ID
//	Town_Name
//	NCP_One
//	NCP_Two
//	Random_NCP_Three
//	Next_Town_E_ID
//	Next_Town_W_ID
//	Next_Town_N_ID
//	Next_Town_S_ID
	
	for (int i = 0; i < arr.length; i++) 
        System.out.println("Element at " + i + " : " + arr[i].Town_ID +" "+ arr[i].Town_Name);
	
	}
	public static void CurrentTown() {
		//Taken form game engine
		//might leave in game engine???
	}
}
class Towns {
	
	public int Town_ID;
	public String Town_Name;
	Towns(int Town_ID, String Town_Name)
	{
		this.Town_ID = Town_ID;
		this.Town_Name = Town_Name;
	}
	
}