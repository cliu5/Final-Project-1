import cs1.Keyboard;

public class OrderTheGrid extends Activity{

  public int[][] Grid = new int[3][3];

  public boolean OrderTheGrid(){
    Grid = new int[3][3];
    int[] numbers = {6,5,3,7,9,2,1,4,8};
    int index = 0;
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        Grid[i][j] = numbers[index];
        index += 1;
      }
    }
    System.out.println("This is the Sliding tile grid problem. The objective of the game is to move the numbered tiles until they share a format as the following example: \n1 2 3 \n4 5 6 \n7 8 9 \n The less moves you use the better.");
    int counter = 0;
    while (!Finish()){
      System.out.println(toString());
      System.out.println("Enter number of the tile that you would like to move:");
      int Piece = Keyboard.readInt();
      System.out.println("Enter the direction in which you would like to move the tile. (d = down, u = up, l = left, r = right)");
      String Shift = Keyboard.readString();
      System.out.println("\n");

      if ((Piece > 0 && Piece < 10) && (Shift.equals("d") || Shift.equals("u") || Shift.equals("l") || Shift.equals("r"))){
        if (Shift.equals("d")){
          ShiftDown(Piece);
        }
        if (Shift.equals("u")){
          ShiftUp(Piece);
        }
        if (Shift.equals("l")){
          ShiftLeft(Piece);
        }
        if (Shift.equals("r")){
          ShiftRight(Piece);
        }
      }else {
        System.out.println("Not valid direction. Up = u, Down = d, Left = l, Right = r.");
      }
      counter += 1;
    }
    System.out.println(toString());
    if (counter <= 7){
        System.out.println("Congratulations. You corrected the puzzle in " + counter + " moves. That is less than or equal to our ideal solution of 7 moves. Good Job!!!");
        return true;
      } else {
        System.out.println("Sorry, but you corrected the puzzle in " + counter + " moves. That is more than our ideal solution of 7 moves. Better luck next time.");
        return false;
    }
  }

  public String toString(){
    String grid = "";
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        grid += Grid[i][j];
        grid += " ";
      }
      grid += "\n";
    }
    return grid;
  }
  public boolean Finish(){
    boolean Truth = true;
    int number = 1;
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        if (Grid[i][j] != number){
        //if (Grid[i][j] != (3*i + j + 1)){
          Truth = false;
        }
        number += 1;
      }
    }
    return Truth;
  }
  public void ShiftDown(int y){
    int row = 0;
    int column = 0;
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        if (Grid[i][j] == y){
          row = i;
          column = j;
        }
      }
    }
    if (row != 2){
      int value = Grid[row+1][column];
      Grid[row+1][column] = Grid[row][column];
      Grid[row][column] = value;
    }
    else {
      System.out.println("Don't do that again. I see you trying to break this code. DON'T DO THAT AGAIN.");
    }
  }
  public void ShiftUp(int y){
    int row = 0;
    int column = 0;
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        if (Grid[i][j] == y){
          row = i;
          column = j;
        }
      }
    }
    if (row != 0){
      int value = Grid[row-1][column];
      Grid[row-1][column] = Grid[row][column];
      Grid[row][column] = value;
    }
    else {
      System.out.println("NOT VALID. Try again.");
    }
  }
  public void ShiftLeft(int y){
    int row = 0;
    int column = 0;
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        if (Grid[i][j] == y){
          row = i;
          column = j;
        }
      }
    }
    if (column != 0){
      int value = Grid[row][column-1];
      Grid[row][column-1] = Grid[row][column];
      Grid[row][column] = value;
    }
    else {
      System.out.println("NOT VALID. Try again.");
    }
  }
  public void ShiftRight(int y){
    int row = 0;
    int column = 0;
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        if (Grid[i][j] == y){
          row = i;
          column = j;
        }
      }
    }
    if (column != 2){
      int value = Grid[row][column+1];
      Grid[row][column+1] = Grid[row][column];
      Grid[row][column] = value;
    }
    else {
      System.out.println("NOT VALID. Try again.");
    }
  }
  public void PlayActivity(Player x) {
    boolean result = OrderTheGrid();
    if (result){
      x.energy+=2;
    }else{
      x.energy-=1;
    }
  }
}
