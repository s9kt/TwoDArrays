class Main {
  public static void main(String[] args) {
  TwoDArray arr = new TwoDArray(6, 5);
  arr.randomize(10, 100);
  arr.display();
  System.out.println(arr.sumEachRow());
  System.out.println(arr.sumEachCollumn());
  }
}