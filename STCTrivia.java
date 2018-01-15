import cs1.Keyboard;

public class STCTrivia extends Activity{
   
  public static int STCTrivia() {
    int Score=0;
    int[] AnswerSheet = new int[5];
    System.out.println("Welcome to the Stuyvesant Theater Club Room! And it's Quiz Time!"
                       + " Select the best answer below by typing in the corresponding number.");
    System.out.println("1. STC? What fun. Let's do it!");
    System.out.println("2. Theater is for sissies and old people.");
    int FirstChoice = Keyboard.readInt();
    if (FirstChoice == 1) {
	    System.out.println("Good choice, welcome to the club.");
	    //Introduces Bio Quiz//
	    System.out.println("It's time for some theater trivia. Hope you put on a great performance.");
	    //First Question//
	    System.out.println("Which of the following statement is true?");
	    //Choices//
	    System.out.println("(1) When a Broadway show goes on tour, that show is no longer on Broadway.  \n (2) All Broadway theatres have been renamed sometime in the past.  \n (3) Most Broadway shows are produced without any set run time.  \n (4) No Broadway theatre has less than 1,500 seats ");
	    int FirstAnswer = Keyboard.readInt();
      AnswerSheet[0] = FirstAnswer;
	    if(FirstAnswer== 3) {
        Score+=1;
	    }
	    //Second Question//
	    System.out.println("Which award ceremony is unique to the institution of Broadway?");
	    //Choices//
	    System.out.println("(1) Emmy Awards \n (2) Tony Awards \n (3) Oliver Awards \n (4) Suzi Bass Awards");
	    int SecondAnswer = Keyboard.readInt();
      AnswerSheet[1] = SecondAnswer;
	    if(SecondAnswer == 2) {
        Score+=1;
	    }
	    //Third Question//
	    System.out.println("The longest running show ON BROADWAY is...");
	    //Choices//
	    System.out.println("(1) Wicked \n (2) My Fair Lady  \n (3) The Phantom of the Opera  \n (4) Follies");
	    int ThirdAnswer = Keyboard.readInt();
      AnswerSheet[2] = ThirdAnswer;
	    if(ThirdAnswer == 3) {
        Score+=1;
	    }
	    //Fourth Question//
	    System.out.println("How are the days that there are no shows being performed referred to?");
	    //Choices//
	    System.out.println("(1) Easy days \n (2) Dark days \n (3) Off days  \n (4) Black days");
	    int FourthAnswer = Keyboard.readInt();
      AnswerSheet[3] = FourthAnswer;
	    if(FourthAnswer == 2) {
        Score+=1;
	    }
	    //Fifth Question//
	    System.out.println("In theater, what is a tableau?");
	    //Choices//
	    System.out.println("(1) Foreign language for table \n (2) A written record of all actors on stage \n (3) A prop table \n (4) When actors freeze in a picturesque position");
	    int FifthAnswer = Keyboard.readInt();
      AnswerSheet[4] = FifthAnswer;
	    if(FifthAnswer == 4) {
        Score+=1;
	    }

    }
    //Score report
    if(Score >= 3){
      System.out.println("Noice, you passed! Out of 5 questions, you got " + Score + " correct! \n You answers: 1. " + AnswerSheet[0] + "\n 2. " + AnswerSheet[1] + "\n 3. " + AnswerSheet[2] + "\n 4. " + AnswerSheet[3] + "\n 5. " + AnswerSheet[4] + " \n The correct answers are: \n 1. (3) Most Broadway shows are produced without any set run time. \n 2. (2) Tony Awards \n 3. (3) The Phantom of the Opera, running for a whopping 30 years, 25 in 2013. \n 4. (2) Dark days  \n 5. (4) When actors freeze in a picturesque position");
      return true;
    }

    if(Score<3){
      System.out.println("So close, yet so far. Out of 5 questions, you got " + Score + " correct! \n You answers: 1. " + AnswerSheet[0] + "\n 2. " + AnswerSheet[1] + "\n 3. " + AnswerSheet[2] + "\n 4. " + AnswerSheet[3] + "\n 5. " + AnswerSheet[4] + " \n The correct answers are: \n 1. (3) Most Broadway shows are produced without any set run time. \n 2. (2) Tony Awards \n 3. (3) The Phantom of the Opera, running for a whopping 30 years, 25 in 2013. \n 4. (2) Dark days  \n 5. (4) When actors freeze in a picturesque position");;
        return false;
    }
    else {
      System.out.println("Okay, and I'm SURE that you are neither of those." );
      return false;
      //add 5 energy used to the player
    }

      
    //return 0;
  }
  public void PlayActivity(Player x) {
    boolean result = STCTrivia();
    if (result){
      System.out.println("Yay u won...");
      enery+=2;
    }else{
      System.out.println("Awww man  u lost");
      energy-=1;
    }
  }
}
