import cs1.Keyboard;

public class BioTrivia extends Activity{
   
  public static boolean BioTrivia() {
    int Score=0;
    int[] AnswerSheet = new int[5];
    System.out.println("Welcome to the Biology Labratory! Since you seem so eager to be here, let's start with a little quiz!"
                       + " Select the best answer below by typing in the corresponding number.");
    System.out.println("1. Biology? What fun. Let's do it!");
    System.out.println("2. Well, I was forced to take two semester of Biology in Freshman year. No thanks.");
    int FirstChoice = Keyboard.readInt();
    if (FirstChoice == 1) {
	    System.out.println("Good choice, welcome to the lab.");
	    //Introduces Bio Quiz//
	    System.out.println("Come one, come all, test your knowledge of Biology in the following quiz!");
	    //First Question//
	    System.out.println("What is the “powerhouse” of the cell? Is it:");
	    //Choices//
	    System.out.println("(1)Deoxyribonucleic Acid \n (2)Mitochondria \n (3)Cristae \n (4)Ribosome");
	    int FirstAnswer = Keyboard.readInt();
      AnswerSheet[0] = FirstAnswer;
	    if(FirstAnswer== 2) {
        Score+=1;
	    }
	    //Second Question//
	    System.out.println("What hormone is associated with stress?");
	    //Choices//
	    System.out.println("(1)Workasol \n (2)Cortisol \n (3)Life \n (4)Oxytocin");
	    int SecondAnswer = Keyboard.readInt();
      AnswerSheet[1] = SecondAnswer;
	    if(SecondAnswer == 2) {
        Score+=1;
	    }
	    //Third Question//
	    System.out.println("Which hormone causes the feeling of “hunger”?");
	    //Choices//
	    System.out.println("(1)Leptin \n (2)Septin \n (3)Hangry \n (4)Dopamine");
	    int ThirdAnswer = Keyboard.readInt();
      AnswerSheet[2] = ThirdAnswer;
	    if(ThirdAnswer == 1) {
        Score+=1;
	    }
	    //Fourth Question//
	    System.out.println("Here’s a question about happiness. What requires the most energy: smiling or frowning?");
	    //Choices//
	    System.out.println("(1)Smiling \n (2)Frowning \n (3)Half-Smiling,Half-Frowning, or just Smowning \n (4)Both require the same amount of energy.");
	    int FourthAnswer = Keyboard.readInt();
      AnswerSheet[3] = FourthAnswer;
	    if(FourthAnswer == 2) {
        Score+=1;
	    }
	    //Fifth Question//
	    System.out.println("In which of the following species does the male, NOT the female, carry the unborn offspring?");
	    //Choices//
	    System.out.println("(1)Serpentes \n (2)Hippocampus \n (3)Sirenia \n (4)HA, this is a trick question. The male member of ANY species never carries the unborn offspring.");
	    int FifthAnswer = Keyboard.readInt();
      AnswerSheet[4] = FifthAnswer;
	    if(FifthAnswer == 2) {
        Score+=1;
	    }

    }
    //Score report
    if(Score >= 3){
      System.out.println("Noice, you passed! Out of 5 questions, you got " + Score + " correct! \n Your answers: 1. " + AnswerSheet[0] + "\n 2. " + AnswerSheet[1] + "\n 3. " + AnswerSheet[2] + "\n 4. " + AnswerSheet[3] + "\n 5. " + AnswerSheet[4] + " \n The correct answers are: \n 1. (2) Mitochondria, or as I like to say, “Mighty Mitochondria”! \n 3. (2) Cortisol, the stress induced hormone. \n \t Fun Fact: Stress is slowly killing you, but what doesn’t \n  kill you immediately, only makes you stronger! (I think) \n 3. (1) Leptin. \n 4. (2) Frowning. Frowning requires more energy as it requires 43 muscles, \n much more compared to the 17 muscles needed to smile. \n 5. (2)  Hippocampus, also known as the seahorse.");
      return true;
        }

    if(Score<3){
      System.out.println("So close, yet so far. Out of 5 questions, you got " + Score + " correct! \n Your answers: 1. " + AnswerSheet[0] + "\n 2. " + AnswerSheet[1] + "\n 3. " + AnswerSheet[2] + "\n 4. " + AnswerSheet[3] + "\n 5. " + AnswerSheet[4] + " \n The correct answers are: \n 1. (2) Mitochondria, or as I like to say, “Mighty Mitochondria”! \n 3. (2) Cortisol, the stress induced hormone. \n \t Fun Fact: Stress is slowly killing you, but what doesn’t \n  kill you immediately, only makes you stronger! (I think) \n 3. (1) Leptin. \n 4. (2) Frowning. Frowning requires more energy as it requires 43 muscles, \n much more compared to the 17 muscles needed to smile. \n 5. (2)  Hippocampus, also known as the seahorse.");
	    return false;
    }
    else {
      System.out.println("Fine.");
      return false;
      //add 5 energy used to the player
    }

      
    //return 0;
  }
  public void PlayActivity(Player x) {
    boolean result = BioTrivia();
    if (result){
      System.out.println("Yay u won...");
      enery+=2;
    }else{
      System.out.println("Awww man  u lost");
      energy-=1;
    }
  }
}
