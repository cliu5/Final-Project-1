import cs1.Keyboard;
public class Guidance extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Guidance();
    if (result){
      System.out.println("You leave and move onto the next floor.");
    }else{
      System.out.println("You wait for another minute and then the secretary takes pity on you and tells you that \n your guidance couselor isn't present today. She gives you a piece of candy.");
      x.energy+=1;
    }
  }

  public boolean Guidance(){
    System.out.println("You enter the guidance office. You find that your guidance councelor is not here at the current time. \n Do you (1) wait for them to come OR (2) continue with the chase?");
    int Answer = Keyboard.readInt();
    return Answer == 2;
  }
}
