public class pattern16 {
  public static void main(String[] args) {

    int n = 7;

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(j + "\t");
      }

      for (int j = 1; j <= (n * 2) - (i * 2); j++) {
        System.out.print("\t");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print(j + "\t");
      }

      System.out.println();
    }

  }
}
