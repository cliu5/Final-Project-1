public class PhyLab extends Activity{
  public void PlayActivity(Player x) {
    boolean result = PhyLab();
    if (result){
      System.out.println("You climb up the stairs to the next floor.");
      enery+=2;
    }else{
      System.out.println("You keep on watching until, suddenly, another teacher walks by you. Turns out the previous teacher was a sub. The actual teacher is much more Wonderful. You believe that the spectacle is over and proceed to the next floor.");
      energy-=1;
    }
  }

  public boolean PhyLab(){
    System.out.println("You enter the laboratory and watch from near the door. A man with a very strong accent is \n instructing his class on how to perform a lab. When he does the lab to demonstrate, he seems extremely childish as he keeps on yelling “I did it, I did it. Did you see that? I did it!” Do you (1) continue to watch the spectacle, OR (2) resume the chase?");
    int Answer = Keyboard.readInt();
    return Answer == 2;
  }
}
