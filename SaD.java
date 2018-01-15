import cs1.Keyboard;
public class SaD extends Activity{
  public void PlayActivity(Player x) {
    boolean result = SaD();
    if (result){
      System.out.println("Yay u won…");
      x.energy+=2;
    }
    else{
      System.out.println("Awww man u lost");
      x.energy-=1;
    }

  }

  public boolean SaD(){
    return true;
  }
}
