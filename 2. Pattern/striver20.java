public class striver20 {
  public static void main(String[] args) {

    int n = 5;

    int spaces = (2 * n) - 2;

    for (int i = 1; i <= 2 * n - 1; i++) {
      int stars = i;
      if (i > n) {
        stars = 2 * n - i;
      }
      // For Printing Stars
      for (int j = 1; j <= stars; j++) {

        System.out.print("* ");
      }

      // For Printing Spaces
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" " + " ");
      }

      // Again Printing stars
      for (int j = 1; j <= stars; j++) {
        System.out.print("* ");
      }

      System.out.println();
      if (i < n) {
        spaces -= 2;
      } else
        spaces += 2;
    }

  }
}
