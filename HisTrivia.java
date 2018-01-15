import cs1.Keyboard;

public class HisTrivia extends Activity{
   
  public static boolean HisTrivia() {
    int Score=0;
    int[] AnswerSheet = new int[5];
    System.out.println("Welcome to the Mueseum Room! Since you seem so eager to be here, let's start with a little quiz!"
                       + " Select the best answer below by typing in the corresponding number.");
    System.out.println("1. History? What fun. Let's do it!");
    System.out.println("2. Oh boy! History Trivia? WHY WOULD I CARE ABOUT SOMETHING SO USELESS? The past is dead. Long live the Future!");
    int FirstChoice = Keyboard.readInt();
    if (FirstChoice == 1) {
	    System.out.println("Good choice, welcome to the mueseum.");
	    //Introduces Bio Quiz//
	    System.out.println("It's time to dust off your memory for some History Trivia!");
	    //First Question//
	    System.out.println("Which person might be the most responsible for the spread of the Black Death?");
	    //Choices//
	    System.out.println("(1) God \n (2) Pope Gregory IX \n (3) Chuck E. Cheese \n (4) Alexandre Yersin");
	    int FirstAnswer = Keyboard.readInt();
      AnswerSheet[0] = FirstAnswer;
	    if(FirstAnswer== 2) {
        Score+=1;
	    }
	    //Second Question//
	    System.out.println("What were the kamikaze pilots in World War II?");
	    //Choices//
	    System.out.println("(1) Extremely accurate weapons of destruction \n (2) Moderately good weapons of destruction \n (3) Flying Fortresses \n (4)What’s a kamikaze? Is that something you eat?");
	    int SecondAnswer = Keyboard.readInt();
      AnswerSheet[1] = SecondAnswer;
	    if(SecondAnswer == 2) {
        Score+=1;
	    }
	    //Third Question//
	    System.out.println("Who made the Wild West habitable?");
	    //Choices//
	    System.out.println("(1) Cowboys \n (2) Army \n (3)Power Rangers  \n (4) None of the above");
	    int ThirdAnswer = Keyboard.readInt();
      AnswerSheet[2] = ThirdAnswer;
	    if(ThirdAnswer == 4) {
        Score+=1;
	    }
	    //Fourth Question//
	    System.out.println("Which of the following presidents declared the ever so successful“War on Drugs”?");
	    //Choices//
	    System.out.println("(1) Lyndon B. Johnson \n (2) Richard Nixon \n (3) Gerald Ford  \n (4) Ronald Reagan");
	    int FourthAnswer = Keyboard.readInt();
      AnswerSheet[3] = FourthAnswer;
	    if(FourthAnswer == 2) {
        Score+=1;
	    }
	    //Fifth Question//
	    System.out.println("Why was the Nazi Party referred to as the Third Reich?");
	    //Choices//
	    System.out.println("(1) Because Hitler felt like it. \n (2) One and two are unlucky numbers so the Nazi party went with three. \n (3) It roughly translates to “Third Right” \n (4) It was preceeded by two Reichs.");
	    int FifthAnswer = Keyboard.readInt();
      AnswerSheet[4] = FifthAnswer;
	    if(FifthAnswer == 2) {
        Score+=1;
	    }

    }
    //Score report
    if(Score >= 3){
      System.out.println("Noice, you passed! Out of 5 questions, you got " + Score + " correct! \n You answers: 1. " + AnswerSheet[0] + "\n 2. " + AnswerSheet[1] + "\n 3. " + AnswerSheet[2] + "\n 4. " + AnswerSheet[3] + "\n 5. " + AnswerSheet[4] + " \n The correct answers are: \n 1. (2) Pope Gregory IX. By condemning cats as servants of Satan, \n  his actions would lead to a wide extermination of cats. This reduction of cats allowed for the \n increased numbers of rats, vectors of the Black Death. \n 2. (2) Most kamikaze died in vain. Only 1 in 9 kamikaze pilots hit their targets during WW2. \n 3. (1) Leptin. \n 4. (2)  Richard Nixon, who declared drug abuse “public enemy number one”. \n 5. (4) The Nazi party referred to themselves as the Third Reich because they wanted the public \n to believe that they were another unifying force. First Reich was the medieval Holy Roman Empire,\n  which lasted until 1806. The Second Reich included the German Empire from 1871-1918.");
      return true;
        }

    if(Score<3){
      System.out.println("So close, yet so far. Out of 5 questions, you got " + Score + " correct! \n You answers: 1. " + AnswerSheet[0] + "\n 2. " + AnswerSheet[1] + "\n 3. " + AnswerSheet[2] + "\n 4. " + AnswerSheet[3] + "\n 5. " + AnswerSheet[4] + " \n The correct answers are: \n 1. (2) Pope Gregory IX. By condemning cats as servants of Satan, \n  his actions would lead to a wide extermination of cats. This reduction of cats allowed for the \n increased numbers of rats, vectors of the Black Death. \n 2. (2) Most kamikaze died in vain. Only 1 in 9 kamikaze pilots hit their targets during WW2. \n 3. (1) Leptin. \n 4. (2)  Richard Nixon, who declared drug abuse “public enemy number one”. \n 5. (4) The Nazi party referred to themselves as the Third Reich because they wanted the public \n to believe that they were another unifying force. First Reich was the medieval Holy Roman Empire,\n  which lasted until 1806. The Second Reich included the German Empire from 1871-1918.");
        return false;
    }
    else {
      System.out.println("Very well, but remember the words of William Faulkner, “The past is never dead. It's not even past.”" );
      return false;
    }
  }
  
  public void PlayActivity(Player x) {
    boolean result = HisTrivia();
    if (result){
      System.out.println("Yay u won...");
      enery+=2;
    }else{
      System.out.println("Awww man  u lost");
      energy-=1;
    }
  }


}
