import cs1.Keyboard;

public class OrderTheGridDriver{
  public static void main(String[] arg){
    System.out.println("This is the Sliding tile grid problem. The objective of the game is to move the numbered tiles until they share a format as the following example: 1 2 3 \n4 5 6 \n7 8 9 \n The less moves you use the better.")
    OrderTheGrid test = new OrderTheGrid();
    System.out.println(test);
    int counter = 0;
    while (!test.Finish()){
      System.out.println(test);
      System.out.println("Enter number of the tile that you would like to move:");
      int Piece = Keyboard.readInt();
      System.out.println("Enter the direction in which you would like to move the tile. (d = down, u = up, l = left, r = right)");
      String Shift = Keyboard.readString();

      if ((Piece > 0 && Piece < 10) && (Shift.equals("d") || Shift.equals("u") || Shift.equals("l") || Shift.equals("r"))){
        if (Shift.equals("d")){
          test.ShiftDown(Piece);
            }
        if (Shift.equals("u")){
          test.ShiftUp(Piece);
        }
        if (Shift.equals("l")){
          test.ShiftLeft(Piece);
        }
        if (Shift.equals("r")){
          test.ShiftRight(Piece);
        }
      }else {
        System.out.println("Not valid direction. Up = u, Down = d, Left = l, Right = r.");
      }
      counter += 1;
    }
     // test.ShiftLeft(4);
     // System.out.println(test);
     // test.ShiftRight(4);
     // System.out.println(test);
    // test.ShiftUp(5);
    // System.out.println(test);
    // test.ShiftUp(5);
    // System.out.println(test);
    if (counter <= 7){
      System.out.println("Congratulations. You corrected the puzzle in " + counter + " moves. That is less than or equal to our ideal solution of 7 moves. Good Job!!!");
    } else {
      System.out.println("Sorry, but you corrected the puzzle in " + counter + " moves. That is more than our ideal solution of 7 moves. Better luck next time.");
    }
  }
}
