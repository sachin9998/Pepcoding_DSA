public class striver19 {
  public static void main(String[] args) {
    int n = 5;

    for (int i = 0; i < n; i++) {
      // FIRST HALF

      // Stars
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }

      // Space
      for (int j = 1; j <= i * 2; j++) {
        System.out.print(" ");
      }

      // Stars
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int i = 1; i <= n; i++) {
      // SECOND HALF

      // Stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // Space
      for (int j = 1; j <= n * 2 - (i * 2); j++) {
        System.out.print(" ");
      }

      // Stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

  }
}
