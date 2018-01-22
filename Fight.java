import cs1.Keyboard;

public class Fight extends Activity{

  public static boolean Fight(){
    int Health = 100;
    int OpHealth = 90;
    int MockCounter = 0;
    int DissCounter = 0;
    int PunchCounter = 0;
    int KickCounter = 0;
    System.out.println("You leap onto the roof of the =  floor. You see a man standing in the middle of the roof. He holds the rubber duck in his hands and and taunts you with the other. What do you do?");
    while (OpHealth > 0 && Health > 0) {
      System.out.println("1. Mock him \n2. Diss him. \n3. Punch him \n4. Ballerina-kick him.");
      System.out.println("Health-Check: Your health is " + Health + " and the Thief's health is " + OpHealth + ".");
      int Choice = Keyboard.readInt();
      if (Choice == 1){
        if (MockCounter == 0){
          MockCounter += 1;
          OpHealth -= 30;
          Health -= 10;
          System.out.println("You yell out: \n HA, You'll never get me, Na Na Na Na Nah! \nEnraged, the thief charges at you, only to slip on a conveniently placed bannana peel. He clutches his head in agony and spring to his feet. It appears to be SUPER EFFECTIVE. His health is now: " + OpHealth + ". He counters by yelling, \nThat trick won't work twice on me! You suck. \nBeing an easily offended person, you feel a pain in your heart. Your health has been reduced by 10. It is now at: " + Health + ".");
        } else {
          OpHealth -= 10;
          Health -= 20;
          System.out.println("You yell out: \n HA, You'll never get me, Na Na Na Na Nah! \nEnraged, the thief charges at you, only to slip on a conveniently placed watermelon peel. He catches his balance but twists his ankle slightly. It was not very effective. His health is now: " + OpHealth + ". He counters by yelling, \nThat trick won't work another time! You are a failure to society. \nYou care about your appearance in society, so you feel pain. Your health has been reduced by 30. It is now at: " + Health + ".");
        }
      } else if (Choice == 2){
        if (DissCounter == 0){
          DissCounter += 1;
          OpHealth += 20;
          Health -= 10;
          System.out.println("You yell out: \n Yo mama so ugly, that when Santa came down the chimeny, he cried: HO, HO, WHOLLY SH*T! \nThe Thief seems to strongly dislike his mother so it was the OPPOSITE of SUPER EFFECTIVE. He has regained some health, which is now: " + OpHealth + ". He counters by yelling, \n Thanks for dissing the person I hate. Yo mama so stupid that when I stole her TV, she yelled: YOU FORGOT THE REMOTE. \nYou love your mother dearly and this hurts. Your health has been reduced by 10. It is now at: " + Health + ".");
        } else {
          OpHealth += 20;
          Health -= 10;
          System.out.println("Despite earlier consequences, you once again yell out: \n Yo momma so fat when she goes camping the bears hide their food. \nAs seen before, the Thief seems to strongly dislike his mother so it was the OPPOSITE of SUPER EFFECTIVE. He has regained some health, which is now: " + OpHealth + ". He counters by yelling, \n Yo mama so fat it took nationwide 3 years to get on her side. \nYou love your mother dearly and this hurts. Your health has been reduced by 10. It is now at: " + Health + ".");
        }
      } else if (Choice == 3){
        if (PunchCounter == 0){
          PunchCounter += 1;
          OpHealth -= 10;
          Health -= 20;
          System.out.println("You charge at the Thief with your fist raised and punch him. However, since you are a Stuyvesant student and are unlikely to be on a sports team, it is not very effective. The Thief's health is now " + OpHealth + ". He counters by punching you in the face. Your health has been reduced by 20. It is now at: " + Health + ".");
        } else {
          OpHealth -= 15;
          Health -= 10;
          System.out.println("Once again, you charge at the Thief and punch him. He is suprised by your idiocracy and takes slightly more damage. His health is now " + OpHealth + ". He counters by punching you again. However, you have developed a resistance to punches and recieved less damage. Your health is " + Health + ".");
        }
      } else if (Choice == 4){
        if (KickCounter == 0){
          KickCounter += 1;
          OpHealth -= 50;
          Health -= 10;
          System.out.println("You prance over to the Thief, and in his confusion, Ballerina-kick him right between the legs. He hunches over in pain. Those semesters in mandatory square-dancing and ballroom dancing have finally paid off. The attack was a CRITICAL HIT. His health right now is " + OpHealth + ". He climbs up to his feet and launches a kick worthy of recognition at you. Sadly, he falls inches short and kicks you in the shin. You take damage. Your health is now " + Health + ".");
        } else {
          OpHealth -= 15;
          Health -= 20;
          System.out.println("You prance over to the Thief and Ballerina-kick him right between the legs. However, like Johnny English, he has developed a resistance to your tactics. His health right now is " + OpHealth + ". He climbs up to his feet and launches a kick worthy of recognition at you. This time, the kick connects and you take more damage. Your health is now " + Health + ".");
        }
      } else {

        System.out.println("You decide to horse around. The Thief summoned an Equus Caballus and it proceeds to kick you. Your health is now: " + Health + ". After kicking, it spontaneously disappears. The Thief yells: \n Stop horsing around!!");
      }
    }
    if (Health <= 0 && OpHealth <= 0){
      System.out.println("It was a draw! You both fall onto the ground breathless. He crawls over to you and place the rubber ducky in your hands. He whispers \n That was a good game mate.\n Everything fades to white.");
      return true;
    }
    if (Health <= 0){
      System.out.println("You lost. The Thief climbs onto his helicopter and yells out: \n I don't need the ducky of some worthless person. \nHe proceeds to throw the ducky next to you. Everything fades to white.");
      return false;
    }
    if (OpHealth <= 0){
      System.out.println("You won! The Thief passes out and you go over to him to pry the ducky out of his hands. While doing so, you also use a Sharpie that you so happen to find lying around, and draw on his face. You have retrieved the DUCKY!!!");
      return true;
    } else {
      return false;
    }
  }
  public void PlayActivity(Player x) {
    boolean result = Fight();
    if (result){
      x.energy+=2;
    }else{
      x.energy-=1;
    }
  }

}
