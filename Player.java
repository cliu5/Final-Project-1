import java.util.ArrayList;
import cs1.Keyboard;
import java.util.Arrays;

public class Player{
  public String name;
  public int floor = 0;
  public int energy = 10;
	
	boolean[][] optionStatus = {{false,false},{false,false},{false,false},{false},{false},{false,false},{false},{false,false},{false}};
    
	ArrayList<ArrayList<String>> MasterFloor = new ArrayList<ArrayList<String>>();
  ArrayList<String> Floor1 = new ArrayList<String>();
  ArrayList<String> Floor2 = new ArrayList<String>();
  ArrayList<String> Floor3 = new ArrayList<String>();
  ArrayList<String> Floor4 = new ArrayList<String>();
  ArrayList<String> Floor5 = new ArrayList<String>();
  ArrayList<String> Floor6 = new ArrayList<String>();
  ArrayList<String> Floor7 = new ArrayList<String>();
  ArrayList<String> Floor8 = new ArrayList<String>();
  ArrayList<String> Floor9 = new ArrayList<String>();
	
	//activiyt arraylist//
	

  ArrayList<ArrayList<Activity>> MasterActivity = new	ArrayList<ArrayList<Activity>>();
  ArrayList<Activity>_Floor1=new ArrayList<Activity>();
  ArrayList<Activity>_Floor2=new ArrayList<Activity>();
  ArrayList<Activity>_Floor3=new ArrayList<Activity>();
  ArrayList<Activity>_Floor4=new ArrayList<Activity>();
  ArrayList<Activity>_Floor5=new ArrayList<Activity>();
  ArrayList<Activity>_Floor6=new ArrayList<Activity>();
  ArrayList<Activity>_Floor7=new ArrayList<Activity>();
  ArrayList<Activity>_Floor8=new ArrayList<Activity>();
  ArrayList<Activity>_Floor9=new ArrayList<Activity>();	    
  

	
	
public Player(){
		Activity STCTrivia = new STCTrivia();
  _Floor1.add(STCTrivia);
  Activity BandRoom = new Band();
  _Floor1.add(BandRoom);
  MasterActivity.add(_Floor1);
	Activity Guidance = new Guidance();
  _Floor2.add(Guidance);
  Activity Museum = new HisTrivia();
  _Floor2.add(Museum);
  MasterActivity.add(_Floor2);
	Activity Bathroom = new Bathroom();
  _Floor3.add(Bathroom);
  Activity CSRoom = new CSRoom();
  _Floor3.add(CSRoom);
  MasterActivity.add(_Floor3);
	Activity MathExhibit = new MathExhibit();
  _Floor4.add(MathExhibit);
  MasterActivity.add(_Floor4);
	Activity Cafeteria = new Cafe();
  _Floor5.add(Cafeteria);
  MasterActivity.add(_Floor5);
	Activity Gym = new Gym();
  _Floor6.add(Gym);
  Activity SaD = new SaD();
  _Floor6.add(SaD);
  MasterActivity.add(_Floor6);
	Activity BioLab = new BioTrivia();
  _Floor7.add(BioLab);
  MasterActivity.add(_Floor7);
	
	Activity PhyLab = new PhyLab();
  _Floor8.add(PhyLab);
  Activity Bench = new Bench();
  _Floor8.add(Bench);
  MasterActivity.add(_Floor8);
	Activity twenty48 = new Game2048(); //The latter is the classname//
  _Floor9.add(twenty48);
  MasterActivity.add(_Floor9);
	MasterFloor.add(Floor1);
	MasterFloor.add(Floor2);
	MasterFloor.add(Floor3);
	MasterFloor.add(Floor4);
	MasterFloor.add(Floor5);
	MasterFloor.add(Floor6);
	MasterFloor.add(Floor7);
	MasterFloor.add(Floor8);
	MasterFloor.add(Floor9);
  Floor1.add("Theatre");
  Floor1.add("Band Room");
  Floor1.add("You burst through the entrance and find yourself on the 1st Floor of Stuyvesant High School. Before you, you see fallen students with papers on the floor. They all seem to be pointing in the general direction of the Band Room and Theater. Where do you proceed?");
  Floor2.add("Guidance Office");
  Floor2.add("Museum Room");
  Floor2.add("You have now arrived on the second floor. Once again, there is chaos everywhere. The chaos seems to pointing towards the Guidance Room and Museum Room. Where do you proceed?");
  Floor3.add("Bathroom");
  Floor3.add("CS Room");
  Floor3 .add("Now arriving on the 3rd floor, do you feel the need to empty your bladder before continuing, or go straight to the CS room, where the distubance seems to be? Where are you proceeding to?");
  Floor4.add("MathExhibit");
  Floor4.add("As you climb onto the 4th floor, you spot a sheet of paper taped to the Math Exhibit. You proceed closer for a closer gander.");
  Floor5.add("Cafeteria");
  Floor5.add("Climbing up the stairs between the 4th and 5th floor, you see that the thief had not stopped on the 5th floor and decided to proceed directly to the 6th floor. You are a bit hungry after the long chase. Where do you chose to go?");
  Floor6.add("Gymnasium");
  Floor6.add("Speech and Debate Club");
  Floor6.add("Now that you are on the 6th floor, you hear commotions on two opposite sites. One is in the direction of the 6th floor gymnasium and the other is in the direction of the Stuyvesant Speech and Debate Club. Towards which commotion do you proceed towards?");
  Floor7.add("Biology Lab");
  Floor7.add("You arrive on the 7th floor and hear a large commtion in one of the Biology Labs. You approach the laboratory.");
  Floor8.add("Phyics Lab");
  Floor8.add("Bench");
  Floor8.add("You are nearly at the top of Stuyvesant High School. As you wipe your sweat from from your brows, you walk across the 8th Floor. As you walk, you see a bench and hear a large sound that originated from a physics lab. Towards which one do you go?");
  Floor9.add("2048 Lock");
  Floor9.add("You have finally gotten up to the 9th floor. But there still lay one more obstacle in you way. It is a large lock with a touch screen. You must finish the game of 2048 to proceed.");
}

  public Player(String givenname){
    this();
    name=givenname;
  }
  public void Play(){
    System.out.println("Hello " + name + ". You are a Stuyvesant student and a mysterious thief has stolen your toy ducky and runs off with it. You hear his helicopter approaching the roof as you rush to catch up to him."
);
    while(floor<9){
      playLevel();
    }
    System.out.println("Game over! You're final energy is :" + energy+ " . The lower the better!");
	
    //this is just a temp test to make sure trivias are working//
  }

  //helper functino to print each statement for each level//
  public String GetFloor() {
    return MasterFloor.get(floor).get(MasterFloor.get(floor).size()-1);
  }

  public void playLevel() {
    System.out.println(GetFloor());
    int TOTALonFLOOR;
    int CURRENToptionINDEX;
    while (true) {
      TOTALonFLOOR = MasterFloor.get(floor).size()-1;
      CURRENToptionINDEX = 0;
      while (CURRENToptionINDEX < TOTALonFLOOR) {
        if (!optionStatus[floor][CURRENToptionINDEX]) {
          System.out.println(CURRENToptionINDEX+": "+ MasterFloor.get(floor).get(CURRENToptionINDEX));
        }
        CURRENToptionINDEX++;
      }
      int stairs = CURRENToptionINDEX;
      if (floor < 9) {
        System.out.println(CURRENToptionINDEX+": Take the stairs up one floor");
      }
	    
      int USEROPTION = Keyboard.readInt();
      if (USEROPTION < TOTALonFLOOR) {
        MasterActivity.get(floor).get(USEROPTION).PlayActivity(this);
        optionStatus[floor][USEROPTION] = true;
        if (floor == 9) {
          floor ++;
        }
	    }
	    else if (USEROPTION == stairs) {
        floor++;
        return;
	    }
    }
  }
}
