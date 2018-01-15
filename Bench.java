import cs1.Keyboard
public class Bench extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Bench();
    if (result){
      System.out.println("Congratulation on your triumph.");
      x.energy+=2;
    }else{
      System.out.println("Better brush up on your riddling skills.");
      x.energy-=1;
    }
  }

  public boolean Bench(){
    return true; int Score=0;
    String[] AnswerSheet = new String[5];
    System.out.println("As you sit down on the bench to rest, you notice a sheet of paper. It seems to have a collection \n  of hard riddles for you to solve. Do you chose to:");
    System.out.println("1. Challenge youself with some hard riddles");
    System.out.println("2. Back down from a great challenge");
    int FirstChoice = Keyboard.readInt();
    if (FirstChoice == 1) {
      System.out.println("Good choice, welcome to Riddle Arena.");
      //Introduces Bio Quiz//
      System.out.println("Come one, come all, test your knowledge with the following quizzes! All answers should be LOWERCASE.");
      //First Question//
      System.out.println("Before Mount Everest was discovered, which mountain was the tallest?");
      String FirstAnswer = Keyboard.readString();
      AnswerSheet[0] = FirstAnswer;
      boolean correct = false;
      for (int i = 0; i < FirstAnswer.length() - 7; i ++){
        if (FirstAnswer.substring(i, i + 7).equals("everest")){
          correct = true;
        }
      }
      if(correct) {
        Score+=1;
      }
      //Second Question//
      System.out.println("Forward I am heavy, backwards I am not. What am I?");
      String SecondAnswer = Keyboard.readString();
      AnswerSheet[1] = SecondAnswer;
      boolean correct = false;
      for (int i = 0; i < SecondAnswer.length() - 3; i ++){
        if (SecondAnswer.substring(i, i + 3).equals("ton")){
          correct = true;
        }
      }
        if(correct) {
        Score+=1;
      }
      //Third Question//
      System.out.println("To all the students who took drafting, how do you get straight A’s?");
      String ThirdAnswer = Keyboard.readString();
      AnswerSheet[2] = ThirdAnswer;
      boolean correct = false;
      for (int i = 0; i < ThirdAnswer.length() - 5; i ++){
        if (ThirdAnswer.substring(i, i + 5).equals("ruler")){
          correct = true;
        }
      }
      if(correct) {
        Score+=1;
      }
      //Fourth Question//
      System.out.println("In Stuyvesant, there exists pieces of technology that allow you to walk through walls. What are they?");
      String FourthAnswer = Keyboard.readString();
      AnswerSheet[3] = FourthAnswer;
      boolean correct = false;
      for (int i = 0; i < FourthAnswer.length() - 4; i ++){
        if (FourthAnswer.substring(i, i + 4).equals("door")){
          correct = true;
        }
      }
      if(correct) {
        Score+=1;
      }
      //Fifth Question//
      System.out.println("A one-story school has yellow walls, pink desks, black computers, green blackboards, \n  beige floors, red lights, blue doors, grey stalls, white windows, teal-colored water fountains, \n and orange sinks. What color are the stairs?");
      String FifthAnswer = Keyboard.readString();
      AnswerSheet[4] = FifthAnswer;
      boolean correct = false;
      for (int i = 0; i < FifthAnswer.length() - 3; i ++){
        if (FifthAnswer.substring(i, i + 3).equals("one")){
          correct = true;
        }
      }
      if(correct) {
        Score+=1;if(FifthAnswer == 2) {
        Score+=1;
      }

    }
    //Score report
    if(Score >= 3){
      System.out.println("Noice, you passed! Out of 5 questions, you got " + Score + " correct! \n Your answers: 1. " + AnswerSheet[0] + "\n 2. " + AnswerSheet[1] + "\n 3. " + AnswerSheet[2] + "\n 4. " + AnswerSheet[3] + "\n 5. " + AnswerSheet[4] + " \n The correct answers are: \n 1. Mount Everest \n 2. ton \n 3. With a ruler \n 4. Doors \n 5. Only one floor exist, therefore no stairs exist.");
      return true;
        }

    if(Score<3){
      System.out.println("So close, yet so far. Out of 5 questions, you got " + Score + " correct! \n Your answers: 1. " + AnswerSheet[0] + "\n 2. " + AnswerSheet[1] + "\n 3. " + AnswerSheet[2] + "\n 4. " + AnswerSheet[3] + "\n 5. " + AnswerSheet[4] + " \n The correct answers are: \n 1. Mount Everest \n 2. ton \n 3. With a ruler \n 4. Doors \n 5. Only one floor exist, therefore no stairs exist.");
      return false;
    }
    else {
      System.out.println("Very well.");
      return false;
    }
    }
  }
}
