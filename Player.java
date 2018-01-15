import java.util.ArrayList;
import cs1.Keyboard;
import java.util.Arrays;

public class Player{
  public String name;
  public int floor = 9;
  public int energy = 10;
  public Player(String _name){
    name=_name;
	  this()
  }
	
	
	boolean[][] optionStatus = {{false,false},{false,false},{false,false},{false},{false},{false,false},{false},{false,false},{false}};
    ArrayList<ArrayList<String>> MasterFloor = new ArrayList<ArrayList<String>>();
    ArrayList<String> Floor1 = new ArrayList<String>();
    Floor1.add("You burst through the entrance and find yourself on the 1st Floor of Stuyvesant High \n School. Before you, you see fallen students with papers on the floor. They all seem to be pointing \n in the general direction of the Band Room and Theater.");
    Floor1.add("Do you proceed to (1) the Band Room OR (2) the Theater?");
    ArrayList<String> Floor2 = new ArrayList<String>();
    Floor2.add("You have now arrived on the second floor. Once again, there is chaos everywhere. The chaos seems \n to pointing towards the Guidance Room and Museum Room.");
    Floor2.add("Do you proceed to the  (1) Guidance Room OR (2) Museum Room?");
    ArrayList<String> Floor3 = new ArrayList<String>();
    Floor3 .add("Now arriving on the 3rd floor, do you feel the need to empty your bladder before\n continuing, or go straight to the CS room, where the distubance seems to be?");
    Floor3.add("Are you proceeding to the (1) Computer Science Lab OR (2) Bathroom?");
    //Floor3.add("");
    ArrayList<String> Floor4 = new ArrayList<String>();
    Floor4.add("As you climb onto the 4th floor, you spot a sheet of paper taped to the Math Exhibit. \n You proceed closer for a closer gander.");
    //Floor4.add("");
    ArrayList<String> Floor5 = new ArrayList<String>();
    Floor5.add("Climbing up the stairs between the 4th and 5th floor, you see that the thief had not \n stopped on the 5th floor and decided to proceed directly to the 6th floor. You are a bit hunger \n after the long chase.");
    Floor5.add("Do you chose to (1) grab some grub in the Cafeteria OR (2) proceed directly to 6th  \n floor?");
    ArrayList<String> Floor6 = new ArrayList<String>();
    Floor6.add("Now that you are on the 6th floor, you hear commotions on two opposite sites. One is \n in the direction of the 6th floor gymnasium and the other is in the direction of the Stuyvesant \n Speech and Debate Club.");
    Floor6.add("Towards which commotion do you proceed towards? (1) Gymnasium OR (2) Speech and Debate \n  Club?");
    ArrayList<String> Floor7 = new ArrayList<String>();
    Floor7.add("You arrive on the 7th floor and hear a large commtion in one of the Biology Labs. \n You approach the laboratory.");
    //Floor7.add("");
    ArrayList<String> Floor8 = new ArrayList<String>();
    Floor8.add("You are nearly at the top of Stuyvesant High School. As you wipe your sweat from \n from your brows, you walk across the 8th Floor. As you walk, you see a bench and hear a large sound \n that originated from a physics lab.");
    Floor8.add("Do you (1) take a rest on the bench OR (2) go straight to the laboratory and check \n out what occured?");
    ArrayList<String> Floor9 = new ArrayList<String>();
    Floor9.add("You have finally gotten up to the 9th floor. But there still lay one more obstacle in you way. It is a large lock with a touch screen. You must finish the game of 2048 to proceed.");
    //Floor9.add("");


    ArrayList<ArrayList<Activity>> MasterActivity = new	ArrayList<ArrayList<Activity>>();
    ArrayList<Activity>_Floor1=new ArrayList<Activity>();
    Activity STCTrivia = new STCTrivia();
    _Floor1.add(STCTrivia);
    Activity BandRoom = new Band();
    _Floor1.add(BandRoom);
    MasterActivity.add(_Floor1);
    ArrayList<Activity>_Floor2=new ArrayList<Activity>();
    Activity Guidance = new Guidance();
    _Floor2.add(Guidance);
    Activity Museum = new HisTrivia();
    _Floor2.add(Museum);
    MasterActivity.add(_Floor2);
    ArrayList<Activity>_Floor3=new ArrayList<Activity>();
    Activity Bathroom = new Bathroom();
    _Floor3.add(Bathroom);
    Activity CSRoom = new CSRoom();
    _Floor3.add(CSRoom);
    MasterActivity.add(_Floor3);
    ArrayList<Activity>_Floor4=new ArrayList<Activity>();
    Activity MathExhibit = new MathExhibit();
    _Floor4.add(MathExhibit);
    MasterActivity.add(_Floor4);
    ArrayList<Activity>_Floor5=new ArrayList<Activity>();
    Activity Cafeteria = new Cafe();
    _Floor5.add(Cafeteria);
    MasterActivity.add(_Floor5);
    ArrayList<Activity>_Floor6=new ArrayList<Activity>();
    Activity Gym = new Gym();
    _Floor6.add(Gym);
    Activity SaD = new SaD();
    _Floor6.add(SaD);
    MasterActivity.add(_Floor6);
    ArrayList<Activity>_Floor7=new ArrayList<Activity>();
    Activity BioLab = new BioTrivia();
    _Floor7.add(BioLab);
    MasterActivity.add(_Floor7);
    ArrayList<Activity>_Floor8=new ArrayList<Activity>();
    Activity PhyLab = new PhyLab();
    _Floor8.add(PhyLab);
    Activity Bench = new Bench();
    _Floor8.add(Bench);
    MasterActivity.add(_Floor8);
    ArrayList<Activity>_Floor9=new ArrayList<Activity>();	    
    Activity twenty48 = new Game2048(); //The latter is the classname//
    _Floor9.add(twenty48);
    MasterActivity.add(_Floor9);

	
	
	
	
  public Player(){
	
  }


  public void Play(){
    System.out.println("WELCOME TO OUR GAME!!! YOU ARE IN STUY");
    while(floor<10){
      playLevel();
    }
    System.out.println("You're done blablabla add stuff later");
	
    //this is just a temp test to make sure trivias are working//
  }

//helper functino to print each statement for each level//
public String GetFloor() {
    return MasterFloor.get(floor).get(map.get(floor).size());
}

    public void playLevel() {
	System.out.println(GetFloor());
	int TOTALonFLOOR;
	int CURRENToptionINDEX;
	while (true) {
	    TOTALonFLOOR = MasterFloor.get(floor).get(0);
	    CURRENToptionINDEX = 0;
	    while (CURRENToptionINDEX < TOTALonFLOOR) {
		if (!optionStatus[floor][option]) {
		    System.out.println(option+": "+ MasterFloor.get(floor).get(CURRENToptionINDEX));
		}
		option++;
	    }
	    int stairs = option;
	    if (floor < 9) {
		System.out.println(option+": Take the stairs down one floor");
	    }
	    
	    int USEROPTION = Keyboard.readInt();
	    if (USEROPTION < numOptions) {
		 MASTERACTIVITY.get(floor).get(USEROPTION).Play(this);
		optionStatus[floor][USEROPTION] = true;
	        floor+=1;
	    }
	}
    }
}
