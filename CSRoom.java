public class CSRoom extends Activity{
  public void PlayActivity(Player x) {
    boolean result = CSRoomStarter();
    if (result){
      System.out.println(“Yay u won…”);
      enery+=2;
    }else{
      System.print”Awww man  u lost”;
      energy-=1;
    }
  }

  public boolean CSRoomStarter(){
    return true;
  }
}
