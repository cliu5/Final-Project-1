public class Player{
    public String name;
    public Player(String _name){
	name=_name;
    }
    import java.util.ArrayList;

    public class Player{
	public Player(){
	    ArrayList<ArrayList<String>> MasterFloor = new ArrayList<ArrayList<String>>();
	    ArrayList<String> Floor1 = new ArrayList<String>();
	    Floor1.add("");
	    Floor1.add("");
	    Floor1.add("");
	    ArrayList<String> Floor2 = new ArrayList<String>();
	    Floor2.add("");
	    Floor2.add("");
	    Floor2.add("");
	    ArrayList<String> Floor3 = new ArrayList<String>();
	    Floor3 .add("");
	    Floor3.add("");
	    Floor3.add("");
	    ArrayList<String> Floor4 = new ArrayList<String>();
	    Floor4.add("");
	    Floor4.add("");
	    Floor4.add("");
	    ArrayList<String> Floor5 = new ArrayList<String>();
	    Floor5.add("");
	    Floor5.add("");
	    Floor5.add("");
	    ArrayList<String> Floor1 = new ArrayList<String>();
	    Floor6.add("");
	    Floor6.add("");
	    Floor6.add("");
	    ArrayList<String> Floor1 = new ArrayList<String>();
	    Floor7.add("");
	    Floor7.add("");
	    Floor7.add("");
	    ArrayList<String> Floor1 = new ArrayList<String>();
	    Floor8.add("");
	    Floor8.add("");
	    Floor8.add("");
	    ArrayList<String> Floor1 = new ArrayList<String>();
	    Floor8.add("");
	    Floor8.add("");
	    Floor8.add("");









	    ArrayList<ArrayList<Activity>> MasterActivity = new 
		ArrayList<Activity> 







		}


	public void Play(){
	    System.out.println("WELCOME TO OUR GAME!!! YOU ARE IN STUY");
	    while(floor<10){
		playLevel();
	    }
	    System.out.println("You're done blablabla add stuff later");
	
	    //this is just a temp test to make sure trivias are working//
	}

	public void playLeve(){
	    System.out.println("THIS WILL BE A FUNCTION THAT DISPALYS ALL THE GAMES ON THE FLOOR");
	    while(true){
		int option=0;
		while(option<4){
		    if(!OptionStatus[floor][option]){
			System.out.println(option+": "+map.get(floor).get(option));
		    }
		    option++;
		}
		if(floor<9){
		    System.out.println(option+": Take the stairs up");
		}
		//FIGURE THIS OUT IT SHOULD BE A WAY TO SEE THE USERS INPUT//
		int input=Keyboard.readInt();
		if(input<options){
		    //gahhhhhhhhhhhhhhhh lets do this later//
		}
