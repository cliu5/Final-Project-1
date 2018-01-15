public class Bathroom extends Activity{
  public void PlayActivity(Player x) {
    boolean result = BathroomStarter();
    if (result){
      System.out.println(“Yay u won…”);
      enery+=2;
    }else{
      System.print”Awww man  u lost”;
      energy-=1;
    }
  }

  public boolean BathroomStarter(){
    return true;
  }
}
