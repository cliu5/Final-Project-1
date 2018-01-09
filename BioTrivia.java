import cs1.Keyboard;

public class BioTrivia extends Activity{
   
    public static int BiologyStarter() {
	    
      
      
      
      int Score=0;
      System.out.println("Welcome to the Biology Labratory! Since you seem so eager to be here, let's start with a little quiz!");
	System.out.println("1. Let's do it!");
	System.out.println("2. Well, *INSERT LONG EXCUSE*");
	String FirstChoice = Keyboard.readInt();
	if (FirstChoice == 1) {
	    //Introduces Bio Quiz//System.out.println("");
	    //First Question// System.out.println("");
	    String FirstAnswer = Keyboard.readString();
	      if(FirstAnswer== 1) {
		    System.out.println("MESSAGE THEY GET.");
        Score+=1;
		/*
		  //Second Question//  System.out.println("");
		    
		}
	    }
      if(Score<3;){
	    System.out.println("Jeez you def lied (failed quiz)");
	
	    return 2;
      }
	}
	*/
	      }
	else {
	    System.out.println("BLalbalbal I've hearfd this one already (In response to long excuse)!");
	    return 1;
	    //add 5 energy used to the player
	}
	}
      
      
      
      
      
      
      
      
      
    }
    public void PlayActivity(Player x) {
	
    }


}
