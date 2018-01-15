import cs1.Keyboard;
public class Bathroom extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Bathroom();
    if (result){
      System.out.println("You consider the stench to be too strong and that you can hold it in for a while longer. You decide to proceed to the next floor.");
    }else{
      System.out.println("You brave the stench and enter the restroom. After a few moments, you stumble out, gasping for air. Despite being nasally-inhibited, you have relieved yourself. You continue onto the next floor.");
      x.energy+=1;
    }
  }

  public boolean Bathroom(){
    System.out.println("You enter the restroom. Just as you open the door, a stench hits you straign in the face. Reeling from the smell, you debate on whether to continue. (1 to hold it in OR 2 to brave the stench.)");
    int Answer = Keyboard.readInt();
    return Answer == 1;
  }
}
