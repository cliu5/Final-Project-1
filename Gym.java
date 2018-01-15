public class Gym extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Gym();
    if (result){
      System.out.println("You walk up to the next floor.");
    }
  }

  public boolean Gym(){
    System.out.println("As you approach the gym, you find that the commotion was nothing more than students playing sports in the gymnasium. It looks like fun but you don't have the time to watch.");
    return true;
  }
}
