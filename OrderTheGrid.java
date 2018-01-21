public class OrderTheGrid{
private int[][] Grid;
  public OrderTheGrid(){
    Grid = new int[3][3];
    int[] numbers = {1,2,3,4,5,6,7,8,9};
    int index = 0;
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        index += 1;
        Grid[i][j] = index;
      }
    }
  }
  public String toString(){
    String grid = "";
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        grid += Grid[i][j];
      }
      grid += "\n";
    }
    return grid;
  }
  public void ShiftDown(int x){
    int row = 0;
    int column = 0;
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        if (Grid[i][j] == x){
          row = i;
          column = j;
        }
      }
    }
  }
}
