public class Cafe extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Cafe();
    if (result){
      System.out.println("Yay u won...");
      enery+=2;
    }else{
      System.out.println("Awww man  u lost");
      energy-=1;
    }
  }

  public boolean Cafe(){
    return true;
  }
}
