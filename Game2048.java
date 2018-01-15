public class Game2048 extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Game2048Starter();
    if (result){
      System.out.println(“Yay u won…”);
      enery+=2;
    }else{
      System.print”Awww man  u lost”;
      energy-=1;
    }
  }

  public boolean Game2048Starter(){
    return true;
  }
}
