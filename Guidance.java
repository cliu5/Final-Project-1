public class Guidance extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Guidance();
    if (result){
      System.out.println("Yay u won...");
      enery+=2;
    }else{
      System.out.println("Awww man  u lost");
      energy-=1;
    }
  }

  public boolean Guidance(){
    return true;
  }
}
