import cs1.Keyboard;
public class Game2048 extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Game2048();
    if (result){
      System.out.println("Yay u won...");
      x.energy+=2;
    }else{
      System.out.println("Awww man  u lost");
      x.energy-=1;
    }
  }

  public boolean Game2048(){
    return true;
  }
}
