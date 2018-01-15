import java.util.Arrays;
import java.util.ArrayList;
import cs1.Keyboard
public class Driver{
public static void main(String[] args){
    System.out.println("What is your name?");

 

    String name=Keyboard.readString();

    Player _player=new Player(name);
    _player.Play();
}
}
