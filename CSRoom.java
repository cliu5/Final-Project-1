import cs1.Keyboard;
public class CSRoom extends Activity{
  public void PlayActivity(Player x) {
    boolean result = CSRoom();
    if (result){
      System.out.println("You decide to proceed to the next floor.");
    }else{
      System.out.println("You are about to knock on the door when the warning bell rings. You realize that you don't have much time left to catch the perpatrator so you rush up to the next floor.");
      x.energy+=1;
    }
  }

  public boolean CSRoom(){
    System.out.println("As you approach the Computer Science Room, you notice that the doors are closed and there are students inside the room. Inside, there appears to be students giving demonstrations of their projects. A really tall Asian boy and a girl of moderate height are killing it with their demo. Do chose to 1. interupt the class to look for the thief, OR 2. proceed onto the next floor?");
    int Answer = Keyboard.readInt();
    return Answer == 2;
  }
}
