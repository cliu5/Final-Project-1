import cs1.Keyboard;

public class BioTrivia extends Activity{
   
    public static int BiologyStarter() {
	    
      
      
      
	int Score=0;
	System.out.println("Welcome to the Biology Labratory! Since you seem so eager to be here, let's start with a little quiz!"
			   + " Select the best answer below by typing in the corresponding number.");
	System.out.println("1. Biology? What fun. Let's do it!");	System.out.println("2. Well, I was forced to take ");
	int FirstChoice = Keyboard.readInt();
	if (FirstChoice == 1) {
	    System.out.println("Good choice, welcome to the lab.");
	    //Introduces Bio Quiz//
	    System.out.println("");
	    //First Question//
	    System.out.println("What is the “powerhouse” of the cell? Is it:");
	    //Choices//
	    System.out.println("(1)Deoxyribonucleic Acid \n (2)Mitochondria n\ (3)Cristae \n (4)Ribosome");
	    int FirstAnswer = Keyboard.readInt();
	    if(FirstAnswer== 2) {
		Score+=1;
	    }
	    //Second Question//
	    System.out.println("What hormone is associated with stress?");
	    //Choices//
	    System.out.println("(1)Workasol \n (2)Cortisol \n (3)Life \n (4)Oxytocin");
	    int SecondAnswer = Keyboard.readInt();
	    if(SecondAnswer == 2) {
		Score+=1;
	    }
	    //Third Question//
	    System.out.println("Which hormone causes the feeling of “hunger”?");
	    //Choices//
	    System.out.println("(1)Leptin \n (2)Septin \n (3)Hangry \n (4)Dopamine");
	    int ThirdAnswer = Keyboard.readInt();
	    if(ThirdAnswer == 1) {
		Score+=1;
	    }
	    //Fourth Question//
	    System.out.println("Here’s a question about happiness. What requires the most energy: smiling or frowning?");
	    //Choices//
	    System.out.println("(1)Smiling \n (2)Frowning \n (3)Half-Smiling,Half-Frowning, or just Smowning \n (4)Both require the same amount of energy.");
	    int FourthAnswer = Keyboard.readInt();
	    if(FourthAnswer == 2) {
		Score+=1;
	    }
	    //Fifth Question//
	    System.out.println("In which of the following species does the male, NOT the female, carry the unborn offspring?");
	    //Choices//
	    System.out.println("(1)Serpentes \n (2)Hippocampus \n (3)Sirenia \n (4)HA, this is a trick question. The male member of ANY species never carries the unborn offspring.");
	    int FifthAnswer = Keyboard.readInt();
	    if(FifthAnswer == 2) {
		Score+=1;
	    }



	    
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
    System.out.println("Fine.");
    return 1;
    //add 5 energy used to the player
}
}
      
return 0;
}
      
      
      
      
      
      
      
    
public void PlayActivity(Player x) {
	
}


}
