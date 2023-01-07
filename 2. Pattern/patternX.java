public class patternX {
  public static void main(String[] args) {
    int n = 4;

    int size = n * 2 - 1;

    for (int i = 0; i < size; i++) {

      for (int j = 0; j < size; j++) {

        int top = i;
        int left = j;
        int right = (2 * n - 2) - j;
        int down = (2 * n - 2) - i;

        int td = Math.min(top, down);
        int rl = Math.min(left, right);

        int ans = n - Math.min(td, rl);
        System.out.print(ans + " ");

      }
      System.out.println();
    }

  }
}
