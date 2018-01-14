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
	    ArrayList<String> Floor2 = new ArrayList<String>();
	    Floor2.add("");
	    Floor2.add("");
	    ArrayList<String> Floor3 = new ArrayList<String>();
	    Floor3 .add("");
	    Floor3.add("");
	    Floor3.add("");
	    ArrayList<String> Floor4 = new ArrayList<String>();
	    Floor4.add("");
	    Floor4.add("");
	    ArrayList<String> Floor5 = new ArrayList<String>();
	    Floor5.add("");
	    Floor5.add("");
	    ArrayList<String> Floor6 = new ArrayList<String>();
	    Floor6.add("");
	    Floor6.add("");
	    ArrayList<String> Floor7 = new ArrayList<String>();
	    Floor7.add("");
	    Floor7.add("");
	    ArrayList<String> Floor8 = new ArrayList<String>();
	    Floor8.add("");
	    Floor8.add("");
	    ArrayList<String> Floor9 = new ArrayList<String>();
	    Floor9.add("");
	    Floor9.add("");


	    ArrayList<ArrayList<Activity>> MasterActivity = new	ArrayList<ArrayList<Activity>>();
	    ArrayList<Activity>_Floor1=new ArrayList<Activity>();
	    Activity STCTrivia = new STCTrivia();
	    _Floor1.add(BioTrivia);
	    Activity something = new thing();
	    _Floor1.add(b);
	    MasterActivity.add(_Floor1);
	    ArrayList<Activity>_Floor2=new ArrayList<Activity>();
	    Activity something = new thing();
	    _Floor1.add(b);
	    Activity something = new thing();
	    _Floor1.add(b);
	    Activity something = new thing();
	    _Floor1.add(b);
	    MasterActivity.add(_Floor2);
	    ArrayList<Activity>_Floor3=new ArrayList<Activity>();
	    Activity HisTrivia = new HisTrivia();
	    _Floor1.add(b);
	    Activity something = new thing();
	    _Floor1.add(b);
	    Activity something = new thing();
	    _Floor1.add(b);
	    MasterActivity.add(_Floor3);
	    ArrayList<Activity>_Floor4=new ArrayList<Activity>();
	    Activity something = new thing();
	    _Floor1.add(b);
	    Activity something = new thing();
	    _Floor1.add(b);
	    Activity something = new thing();
	    _Floor1.add(b);
	    MasterActivity.add(_Floor4);
	    ArrayList<Activity>_Floor5=new ArrayList<Activity>();
	    Activity something = new thing();
	    _Floor1.add(b);
	    MasterActivity.add(_Floor5);
	    ArrayList<Activity>_Floor6=new ArrayList<Activity>();
	    Activity something = new thing();
	    _Floor1.add(b);
	    Activity something = new thing();
	    _Floor1.add(b);
	    MasterActivity.add(_Floor6);
	    ArrayList<Activity>_Floor7=new ArrayList<Activity>();
	    Activity BioTrivia = new BioTrivia();
	    _Floor1.add(BioTrivia);
	    Activity something = new thing();
	    _Floor1.add(b);
	    MasterActivity.add(_Floor7);
	    ArrayList<Activity>_Floor8=new ArrayList<Activity>();
	    Activity something = new thing();
	    _Floor1.add(b);
	    Activity something = new thing();
	    _Floor1.add(b);
	    MasterActivity.add(_Floor8);
	    ArrayList<Activity>_Floor9=new ArrayList<Activity>();	    
	    Activity twenty48 = new 2048(); //The latter is the classname//
	    _Floor9.add(twenty48);
	    MasterActivity.add(_Floor9);
	    






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
