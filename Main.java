class Main {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++){
      for(int j = i; j <= i; j++){
        for(j = 1; j <= i; j++){
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  } 
}