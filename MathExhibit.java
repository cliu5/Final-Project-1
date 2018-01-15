import cs1.Keyboard
public class MathExhibit extends Activity{
  public void PlayActivity(Player x) {
    boolean result = MathExhibit();
    if (result){
      System.out.println("Yay u won...");
      x.energy+=2;
    }else{
      System.out.println("Awww man  u lost");
      x.energy-=1;
    }
  }

  public boolean MathExhibit(){
    return true;
  }
}
