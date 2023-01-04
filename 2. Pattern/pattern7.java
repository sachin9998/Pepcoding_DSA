public class pattern7 {
  public static void main(String[] args) {

    for (int i = 1; i <= n; i++) {
      int count = 1;
      for (int j = 1; j <= n; j++) {

        if (count == i) {
          System.out.print("*\t");

        } else {
          System.out.print("\t");
        }
        count++;
      }
      System.out.println();
    }

  }
}
