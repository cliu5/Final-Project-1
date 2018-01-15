import cs1.Keyboard;

public class Band extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Band();
    if (result){
      System.out.println("You leave the room and climb up the stairs to the second floor.");
    } else {
      System.out.println("You walk up to the cowled figure. Just as you are about to speak, the figure turns around \n  and whispers, “I am Dr. Chaos and I vant you to LEAVE.” You have little choice but to oblige. You \n leave the room and proceed to the next floor.");
      energy -= 1;
  }

  public boolean Band(){
    System.out.println("You walk into the band room. Inside, there is an odd man wearing a cowl, and accompanying \n  him is a tall boy wearing mascara. What was noticable was the absence of instrumental music and \n  the worried murmuring of the students. While there is chaos and disorder all around in the room, \n there is nothing there regarding the thief. Do you want to talk to the mysterious cowled figure? \n  (1 for yes, 2 for no)");
    int Answer = Keyboard.readInt();
    return Answer == 2;
  }
}
