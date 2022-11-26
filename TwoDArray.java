class TwoDArray {
  private int[][] arr2d;
  
  public TwoDArray(int l, int w){
    arr2d = new int[l][w]; 
  }

  public void randomize(int min, int max){
    int range = max - min + 1;
    for(int i = 0; i < arr2d.length; i++){
      for(int j = 0; j < arr2d[i].length; j++){
        arr2d[i][j] = (int)(Math.random() * range) + min;
      }
    }
  }

  public void display(){
    for(int i = 0; i < arr2d.length; i++){
      for(int j = 0; j < arr2d[i].length; j++){
        System.out.print(arr2d[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public String sumEachRow(){
    String sumRow = "The sum of each row is: \n";
    for(int i = 0; i < arr2d.length; i++){
      sumRow += sumRow(i) + "\n";
    }
    
    return sumRow;
  }

  public String sumEachCollumn(){
    String sumCollumn = "The sum of each collumn is: \n";
      for(int i = 0; i < arr2d[0].length; i++){
        sumCollumn += sumCollumn(i) + "\t";
      }
    
    return sumCollumn;
  }

  private int sumRow(int row){
    int sum = 0;
    for(int i = 0; i < arr2d[row].length; i++){
      sum += arr2d[row][i];
    }
    return sum;
  }

  private int sumCollumn(int collumn){
    int sum = 0;
    for(int i = 0; i < arr2d.length; i++){
      sum += arr2d[i][collumn];
    }
    return sum;
  }
}