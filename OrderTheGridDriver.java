import cs1.Keyboard;

public class OrderTheGridDriver{
  public static void main(String[] arg){
    OrderTheGrid test = new OrderTheGrid();
    System.out.println(test);
    System.out.println(test);
    test.ShiftLeft(3);
    while (!test.Finish()){
      System.out.println(test);
      int Piece = Keyboard.readInt();
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
      System.out.println(test.Finish());
    }
    //test.ShiftDown(4);
    System.out.println(test);
    test.ShiftDown(4);
    System.out.println(test);
    test.ShiftUp(5);
    System.out.println(test);
    test.ShiftUp(5);
    System.out.println(test);
  }
}
