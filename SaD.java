public class SaD extends Activity{
  public void PlayActivity(Player x) {
    boolean result = SaDStarter();
    if (result){
      System.out.println("Yay u won…");
      energy+=2;
    }
    else{
      System.out.println("Awww man u lost");
      energy-=1;
    }
  }

  public boolean SaDStarter(){
    return true;
  }
}
