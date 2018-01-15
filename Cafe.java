public class Cafe extends Activity{
  public void PlayActivity(Player x) {
    boolean result = Cafe();
    if (result){
      System.out.println("You decide to wait on the lunch line. At first, the lunch lines move at a slow but steady rate. \n  But then, the flow of people caught up with the serving speed of the lunch ladies and slowed down \n to a snail's crawl. Taking into consideration the time needed and the miniscule size of the portions, \n you proceed upstairs.");
    }else{
      System.out.println("You decided to go straight upstairs and chase the thief.");
      energy+=1;
    }
  }

  public boolean Cafe(){
    System.out.println("You enter the cafeteria. Immediately, you see the mile long lunch line. Do you (1) chose to wait on line for food OR (2) give up on the food and chase the thief?");
    int Answer = Keyboard.readInt();
    return Answer == 1;
  }
}
